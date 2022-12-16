package emu.gingerps.game.dungeons;

import emu.gingerps.GameConstants;
import emu.gingerps.gingerps;
import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ScenePointEntry;
import emu.gingerps.data.excels.DungeonData;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.SceneType;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.server.game.BaseGameSystem;
import emu.gingerps.server.game.GameServer;
import emu.gingerps.server.packet.send.PacketDungeonEntryInfoRsp;
import emu.gingerps.server.packet.send.PacketPlayerEnterDungeonRsp;
import emu.gingerps.utils.Position;

import java.util.List;

public class DungeonSystem extends BaseGameSystem {
    private static final BasicDungeonSettleListener basicDungeonSettleObserver = new BasicDungeonSettleListener();

    public DungeonSystem(GameServer server) {
        super(server);
    }

    public void getEntryInfo(Player player, int pointId) {
        ScenePointEntry entry = GameData.getScenePointEntryById(player.getScene().getId(), pointId);

        if (entry == null) {
            // Error
            player.sendPacket(new PacketDungeonEntryInfoRsp());
            return;
        }

        player.sendPacket(new PacketDungeonEntryInfoRsp(player, entry.getPointData()));
    }

    public boolean enterDungeon(Player player, int pointId, int dungeonId) {
        DungeonData data = GameData.getDungeonDataMap().get(dungeonId);

        if (data == null) {
            return false;
        }
        gingerps.getLogger().info("{}({}) is trying to enter dungeon {}" ,player.getNickname(),player.getUid(),dungeonId);

        int sceneId = data.getSceneId();
        player.getScene().setPrevScene(sceneId);

        if (player.getWorld().transferPlayerToScene(player, sceneId, data)) {
            player.getScene().addDungeonSettleObserver(basicDungeonSettleObserver);
            player.getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_ENTER_DUNGEON, data.getId());
        }

        player.getScene().setPrevScenePoint(pointId);
        player.sendPacket(new PacketPlayerEnterDungeonRsp(pointId, dungeonId));
        return true;
    }

    /**
     * used in tower dungeons handoff
     */
    public boolean handoffDungeon(Player player, int dungeonId, List<DungeonSettleListener> dungeonSettleListeners) {
        DungeonData data = GameData.getDungeonDataMap().get(dungeonId);

        if (data == null) {
            return false;
        }
        gingerps.getLogger().info("{}({}) is trying to enter tower dungeon {}" ,player.getNickname(),player.getUid(),dungeonId);

        if (player.getWorld().transferPlayerToScene(player, data.getSceneId(), data)) {
            dungeonSettleListeners.forEach(player.getScene()::addDungeonSettleObserver);
        }
        return true;
    }

    public void exitDungeon(Player player) {
        Scene scene = player.getScene();

        if (scene==null || scene.getSceneType() != SceneType.SCENE_DUNGEON) {
            return;
        }

        // Get previous scene
        int prevScene = scene.getPrevScene() > 0 ? scene.getPrevScene() : 3;

        // Get previous position
        DungeonData dungeonData = scene.getDungeonData();
        Position prevPos = new Position(GameConstants.START_POSITION);

        if (dungeonData != null) {
            ScenePointEntry entry = GameData.getScenePointEntryById(prevScene, scene.getPrevScenePoint());

            if (entry != null) {
                prevPos.set(entry.getPointData().getTranPos());
            }
        }
        // clean temp team if it has
        player.getTeamManager().cleanTemporaryTeam();
        player.getTowerManager().clearEntry();

        // Transfer player back to world
        player.getWorld().transferPlayerToScene(player, prevScene, prevPos);
        player.sendPacket(new BasePacket(PacketOpcodes.PlayerQuitDungeonRsp));
    }

    public void updateDailyDungeons() {
        GameData.getScenePointEntries().forEach((id, entry) -> entry.getPointData().updateDailyDungeon());
    }
}
