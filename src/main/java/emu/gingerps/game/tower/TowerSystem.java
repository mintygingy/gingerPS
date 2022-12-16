package emu.gingerps.game.tower;

import emu.gingerps.gingerps;
import emu.gingerps.data.DataLoader;
import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.TowerScheduleData;
import emu.gingerps.server.game.BaseGameSystem;
import emu.gingerps.server.game.GameServer;

import java.util.ArrayList;
import java.util.List;

public class TowerSystem extends BaseGameSystem {

    public TowerSystem(GameServer server) {
        super(server);
        this.load();
    }

    private TowerScheduleConfig towerScheduleConfig;

    public synchronized void load() {
        try {
            towerScheduleConfig = DataLoader.loadClass("TowerSchedule.json", TowerScheduleConfig.class);
        } catch (Exception e) {
            gingerps.getLogger().error("Unable to load tower schedule config.", e);
        }
    }

    public TowerScheduleConfig getTowerScheduleConfig() {
        return towerScheduleConfig;
    }

    public TowerScheduleData getCurrentTowerScheduleData() {
        var data = GameData.getTowerScheduleDataMap().get(towerScheduleConfig.getScheduleId());
        if (data == null) {
            gingerps.getLogger().error("Could not get current tower schedule data by schedule id {}, please check your resource files",
                    towerScheduleConfig.getScheduleId());
        }

        return data;
    }

    public List<Integer> getAllFloors() {
        List<Integer> floors = new ArrayList<>(this.getCurrentTowerScheduleData().getEntranceFloorId());
        floors.addAll(this.getScheduleFloors());
        return floors;
    }

    public List<Integer> getScheduleFloors() {
        return getCurrentTowerScheduleData().getSchedules().get(0).getFloorList();
    }

    public int getNextFloorId(int floorId) {
        var entranceFloors = getCurrentTowerScheduleData().getEntranceFloorId();
        var scheduleFloors = getScheduleFloors();
        var nextId = 0;

        // find in entrance floors first
        for (int i=0;i<entranceFloors.size()-1;i++) {
            if (floorId == entranceFloors.get(i)) {
                nextId = entranceFloors.get(i+1);
            }
        }

        if (floorId == entranceFloors.get(entranceFloors.size()-1)) {
            nextId = scheduleFloors.get(0);
        }

        if (nextId != 0) {
            return nextId;
        }

        // find in schedule floors
        for (int i=0; i < scheduleFloors.size() - 1; i++) {
            if (floorId == scheduleFloors.get(i)) {
                nextId = scheduleFloors.get(i + 1);
            }
        }return nextId;
    }

    public Integer getLastEntranceFloor() {
        return getCurrentTowerScheduleData().getEntranceFloorId().get(getCurrentTowerScheduleData().getEntranceFloorId().size() - 1);
    }
}
