package emu.gingerps.game.dungeons.challenge;

import emu.gingerps.gingerps;
import emu.gingerps.data.DataLoader;
import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.data.excels.DungeonData;
import emu.gingerps.game.dungeons.DungeonDrop;
import emu.gingerps.game.dungeons.DungeonDropEntry;
import emu.gingerps.game.dungeons.challenge.trigger.ChallengeTrigger;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.game.props.WatcherTriggerType;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.proto.ResinCostTypeOuterClass;
import emu.gingerps.scripts.constants.EventType;
import emu.gingerps.scripts.data.SceneGroup;
import emu.gingerps.scripts.data.ScriptArgs;
import emu.gingerps.server.packet.send.PacketGadgetAutoPickDropInfoNotify;
import emu.gingerps.utils.Utils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DungeonChallenge extends WorldChallenge {

    /**
     * has more challenge
     */
    private boolean stage;
    private IntSet rewardedPlayers;

    private final static Int2ObjectMap<List<DungeonDropEntry>> dungeonDropData = new Int2ObjectOpenHashMap<>();

    public static void initialize() {
        // Read the data we need for dungeon rewards drops.
        try {
            DataLoader.loadList("DungeonDrop.json", DungeonDrop.class).forEach(entry -> {
                dungeonDropData.put(entry.getDungeonId(), entry.getDrops());
            });
            gingerps.getLogger().debug("Loaded {} dungeon drop data entries.", dungeonDropData.size());
        }
        catch (Exception ex) {
            gingerps.getLogger().error("Unable to load dungeon drop data.", ex);
        }
    }

    public DungeonChallenge(Scene scene, SceneGroup group,
                            int challengeId, int challengeIndex,
                            List<Integer> paramList,
                            int timeLimit, int goal,
                            List<ChallengeTrigger> challengeTriggers) {
        super(scene, group, challengeId, challengeIndex, paramList, timeLimit, goal, challengeTriggers);
        this.setRewardedPlayers(new IntOpenHashSet());
    }

    public boolean isStage() {
        return stage;
    }

    public void setStage(boolean stage) {
        this.stage = stage;
    }

    public IntSet getRewardedPlayers() {
        return rewardedPlayers;
    }

    public void setRewardedPlayers(IntSet rewardedPlayers) {
        this.rewardedPlayers = rewardedPlayers;
    }

    @Override
    public void done() {
        super.done();
        if (this.isSuccess()) {
            // Settle
            settle();
        }
    }

    private void settle() {
        if (!stage) {
            var scene = this.getScene();
            scene.getDungeonSettleListeners().forEach(o -> o.onDungeonSettle(getScene()));
            scene.getScriptManager().callEvent(EventType.EVENT_DUNGEON_SETTLE,
                    new ScriptArgs(this.isSuccess() ? 1 : 0));
            // Battle pass trigger
            scene.getPlayers().forEach(p -> p.getBattlePassManager().triggerMission(WatcherTriggerType.TRIGGER_FINISH_DUNGEON));
        }
    }

    private List<GameItem> rollRewards(boolean useCondensed) {
        List<GameItem> rewards = new ArrayList<>();
        int dungeonId = this.getScene().getDungeonData().getId();
        // If we have specific drop data for this dungeon, we use it.
        if (dungeonDropData.containsKey(dungeonId)) {
            List<DungeonDropEntry> dropEntries = dungeonDropData.get(dungeonId);

            // Roll for each drop group.
            for (var entry : dropEntries) {
                // Determine the number of drops we get for this entry.
                int start = entry.getCounts().get(0);
                int end = entry.getCounts().get(entry.getCounts().size() - 1);
                var candidateAmounts = IntStream.range(start, end + 1).boxed().collect(Collectors.toList());

                int amount = Utils.drawRandomListElement(candidateAmounts, entry.getProbabilities());

                if (useCondensed) {
                    amount += Utils.drawRandomListElement(candidateAmounts, entry.getProbabilities());
                }

                // Double rewards in multiplay mode, if specified.
                if (entry.isMpDouble() && this.getScene().getPlayerCount() > 1) {
                    amount *= 2;
                }

                // Roll items for this group.
                // Here, we have to handle stacking, or the client will not display results correctly.
                // For now, we use the following logic: If the possible drop item are a list of multiple items,
                // we roll them separately. If not, we stack them. This should work out in practice, at least
                // for the currently existing set of dungeons.
                if (entry.getItems().size() == 1) {
                    rewards.add(new GameItem(entry.getItems().get(0), amount));
                }
                else {
                    for (int i = 0; i < amount; i++) {
                        // int itemIndex = ThreadLocalRandom.current().nextInt(0, entry.getItems().size());
                        // int itemId = entry.getItems().get(itemIndex);
                        int itemId = Utils.drawRandomListElement(entry.getItems(), entry.getItemProbabilities());
                        rewards.add(new GameItem(itemId, 1));
                    }
                }
            }
        }
        // Otherwise, we fall back to the preview data.
        else {
            gingerps.getLogger().info("No drop data found or dungeon {}, falling back to preview data ...", dungeonId);
            for (ItemParamData param : getScene().getDungeonData().getRewardPreview().getPreviewItems()) {
                rewards.add(new GameItem(param.getId(), Math.max(param.getCount(), 1)));
            }
        }

        return rewards;
    }

    public void getStatueDrops(Player player, GadgetInteractReq request) {
        DungeonData dungeonData = getScene().getDungeonData();
        int resinCost = dungeonData.getStatueCostCount() != 0 ? dungeonData.getStatueCostCount() : 20;

        if (!isSuccess() || dungeonData == null || dungeonData.getRewardPreview() == null || dungeonData.getRewardPreview().getPreviewItems().length == 0) {
            return;
        }

        // Already rewarded
        if (getRewardedPlayers().contains(player.getUid())) {
            return;
        }

        // Get rewards.
        List<GameItem> rewards = new ArrayList<>();

        if (request.getResinCostType() == ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_CONDENSE) {
            // Check if condensed resin is usable here.
            // For this, we use the following logic for now:
            // The normal resin cost of the dungeon has to be 20.
            if (resinCost != 20) {
                return;
            }

            // Spend the condensed resin and only proceed if the transaction succeeds.
            if (!player.getResinManager().useCondensedResin(1)) return;

            // Roll rewards.
            rewards.addAll(this.rollRewards(true));
        }
        else {
            // Spend the resin and only proceed if the transaction succeeds.
            if (!player.getResinManager().useResin(resinCost)) return;

            // Roll rewards.
            rewards.addAll(this.rollRewards(false));
        }

        // Add rewards to player and send notification.
        player.getInventory().addItems(rewards, ActionReason.DungeonStatueDrop);
        player.sendPacket(new PacketGadgetAutoPickDropInfoNotify(rewards));

        getRewardedPlayers().add(player.getUid());
    }
}
