package emu.gingerps.game.tower;

import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.TowerLevelData;
import emu.gingerps.game.dungeons.DungeonSettleListener;
import emu.gingerps.game.dungeons.TowerDungeonSettleListener;
import emu.gingerps.game.player.BasePlayerManager;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.packet.send.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TowerManager extends BasePlayerManager {

    public TowerManager(Player player) {
        super(player);
    }

    public TowerData getTowerData() {
        return getPlayer().getTowerData();
    }

    public int getCurrentFloorId() {
        return getTowerData().currentFloorId;
    }

    public int getCurrentLevelId() {
        return getTowerData().currentLevelId + getTowerData().currentLevel;
    }

    /**
     * form 1-3
     */
    public int getCurrentLevel() {
        return getTowerData().currentLevel + 1;
    }
    private static final List<DungeonSettleListener> towerDungeonSettleListener = List.of(new TowerDungeonSettleListener());

    public Map<Integer, TowerLevelRecord> getRecordMap() {
        Map<Integer, TowerLevelRecord> recordMap = getTowerData().recordMap;
        if (recordMap == null || recordMap.size()==0) {
            recordMap = new HashMap<>();
            recordMap.put(1001, new TowerLevelRecord(1001));
            getTowerData().recordMap = recordMap;
        }
        return recordMap;
    }

    public void teamSelect(int floor, List<List<Long>> towerTeams) {
        var floorData = GameData.getTowerFloorDataMap().get(floor);
        getTowerData().currentFloorId = floorData.getFloorId();
        getTowerData().currentLevel = 0;
        getTowerData().currentLevelId = GameData.getTowerLevelDataMap().values().stream()
                .filter(x -> x.getLevelGroupId() == floorData.getLevelGroupId() && x.getLevelIndex() == 1)
                .findFirst()
                .map(TowerLevelData::getId)
                .orElse(0);

        if (getTowerData().entryScene == 0) {
            getTowerData().entryScene = player.getSceneId();
        }

        player.getTeamManager().setupTemporaryTeam(towerTeams);
    }


    public void enterLevel(int enterPointId) {
        var levelData = GameData.getTowerLevelDataMap().get(getCurrentLevelId());

        var dungeonId = levelData.getDungeonId();

        notifyCurLevelRecordChange();
        // use team user choose
        player.getTeamManager().useTemporaryTeam(0);
        player.getServer().getDungeonSystem().handoffDungeon(player, dungeonId,
                towerDungeonSettleListener);

        // make sure user can exit dungeon correctly
        player.getScene().setPrevScene(getTowerData().entryScene);
        player.getScene().setPrevScenePoint(enterPointId);

        player.getSession().send(new PacketTowerEnterLevelRsp(getTowerData().currentFloorId, getCurrentLevel()));
        // stop using skill
        player.getSession().send(new PacketCanUseSkillNotify(false));
        // notify the cond of stars
        player.getSession().send(new PacketTowerLevelStarCondNotify(getTowerData().currentFloorId, getCurrentLevel()));
    }

    public void notifyCurLevelRecordChange() {
        player.getSession().send(new PacketTowerCurLevelRecordChangeNotify(getTowerData().currentFloorId, getCurrentLevel()));
    }
    public void notifyCurLevelRecordChangeWhenDone(int stars) {
        Map<Integer, TowerLevelRecord> recordMap = getRecordMap();
        int currentFloorId = getTowerData().currentFloorId;
        if (!recordMap.containsKey(currentFloorId)) {
            recordMap.put(currentFloorId,
                    new TowerLevelRecord(currentFloorId).setLevelStars(getCurrentLevelId(),stars));
        }else {
            recordMap.put(currentFloorId,
                    recordMap.get(currentFloorId).setLevelStars(getCurrentLevelId(),stars));
        }

        getTowerData().currentLevel++;

        if (!hasNextLevel()) {
            // set up the next floor
            var nextFloorId = this.getNextFloorId();
            recordMap.computeIfAbsent(nextFloorId, TowerLevelRecord::new);
            player.getSession().send(new PacketTowerCurLevelRecordChangeNotify(nextFloorId, 1));
        }else {
            player.getSession().send(new PacketTowerCurLevelRecordChangeNotify(currentFloorId, getCurrentLevel()));
        }
    }
    public boolean hasNextLevel() {
        return getTowerData().currentLevel < 3;
    }
    public int getNextFloorId() {
        return player.getServer().getTowerSystem().getNextFloorId(getTowerData().currentFloorId);
    }
    public boolean hasNextFloor() {
        return player.getServer().getTowerSystem().getNextFloorId(getTowerData().currentFloorId) > 0;
    }

    public void clearEntry() {
        getTowerData().entryScene = 0;
    }

    public boolean canEnterScheduleFloor() {
        Map<Integer, TowerLevelRecord> recordMap = getRecordMap();
        if (!recordMap.containsKey(player.getServer().getTowerSystem().getLastEntranceFloor())) {
            return false;
        }
        return recordMap.get(player.getServer().getTowerSystem().getLastEntranceFloor())
                .getStarCount() >= 6;
    }

    public void mirrorTeamSetUp(int teamId) {
        // use team user choose
        player.getTeamManager().useTemporaryTeam(teamId);
        player.sendPacket(new PacketTowerMiddleLevelChangeTeamNotify());
    }
}
