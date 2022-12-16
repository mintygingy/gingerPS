package emu.gingerps.game.entity.gadget.chest;

import emu.gingerps.gingerps;
import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.game.entity.gadget.GadgetChest;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.server.packet.send.PacketGadgetAutoPickDropInfoNotify;

import java.util.ArrayList;
import java.util.List;

public class BossChestInteractHandler implements ChestInteractHandler{
    @Override
    public boolean isTwoStep() {
        return true;
    }

    @Override
    public boolean onInteract(GadgetChest chest, Player player) {
        return this.onInteract(chest,player,false);
    }

    public boolean onInteract(GadgetChest chest, Player player,boolean useCondensedResin) {
        var blossomRewards = player.getScene().getBlossomManager().onReward(player,chest.getGadget(),useCondensedResin);
        if (blossomRewards!=null) {
            player.getInventory().addItems(blossomRewards, ActionReason.OpenWorldBossChest);
            player.sendPacket(new PacketGadgetAutoPickDropInfoNotify(blossomRewards));
            return true;
        }

        var worldDataManager = chest.getGadget().getScene().getWorld().getServer().getWorldDataSystem();
        var monster = chest.getGadget().getMetaGadget().group.monsters.get(chest.getGadget().getMetaGadget().boss_chest.monster_config_id);
        var reward = worldDataManager.getRewardByBossId(monster.monster_id);

        if (reward == null) {
            gingerps.getLogger().warn("Could not found the reward of boss monster {}", monster.monster_id);
            return false;
        }
        List<GameItem> rewards = new ArrayList<>();
        for (ItemParamData param : reward.getPreviewItems()) {
            rewards.add(new GameItem(param.getId(), Math.max(param.getCount(), 1)));
        }

        player.getInventory().addItems(rewards, ActionReason.OpenWorldBossChest);
        player.sendPacket(new PacketGadgetAutoPickDropInfoNotify(rewards));

        return true;
    }
}
