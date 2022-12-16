package emu.gingerps.server.packet.send;

import emu.gingerps.game.tower.TowerManager;
import emu.gingerps.game.tower.TowerSystem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerAllDataRspOuterClass.TowerAllDataRsp;
import emu.gingerps.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord;
import emu.gingerps.net.proto.TowerFloorRecordOuterClass.TowerFloorRecord;
import emu.gingerps.net.proto.TowerLevelRecordOuterClass;
import emu.gingerps.utils.DateHelper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PacketTowerAllDataRsp extends BasePacket {

    public PacketTowerAllDataRsp(TowerSystem towerScheduleManager, TowerManager towerManager) {
        super(PacketOpcodes.TowerAllDataRsp);

        var recordList = towerManager.getRecordMap().values().stream()
                .map(rec -> TowerFloorRecord.newBuilder()
                        .setFloorId(rec.getFloorId())
                        .setFloorStarRewardProgress(rec.getFloorStarRewardProgress())
                        .putAllPassedLevelMap(rec.getPassedLevelMap())
                        .addAllPassedLevelRecordList(buildFromPassedLevelMap(rec.getPassedLevelMap()))
                        .build()
                )
                .toList();

        var openTimeMap = towerScheduleManager.getScheduleFloors().stream()
                .collect(Collectors.toMap(x -> x,
                        y -> DateHelper.getUnixTime(towerScheduleManager.getTowerScheduleConfig()
                        .getScheduleStartTime()))
                );

        TowerAllDataRsp proto = TowerAllDataRsp.newBuilder()
                .setTowerScheduleId(towerScheduleManager.getCurrentTowerScheduleData().getScheduleId())
                .addAllTowerFloorRecordList(recordList)
                .setCurLevelRecord(TowerCurLevelRecord.newBuilder().setIsEmpty(true))
                .setScheduleStartTime(DateHelper.getUnixTime(towerScheduleManager.getTowerScheduleConfig()
                        .getScheduleStartTime()))
                .setNextScheduleChangeTime(DateHelper.getUnixTime(towerScheduleManager.getTowerScheduleConfig()
                        .getNextScheduleChangeTime()))
                .putAllFloorOpenTimeMap(openTimeMap)
                .setIsFinishedEntranceFloor(towerManager.canEnterScheduleFloor())
                .build();

        this.setData(proto);
    }

    private List<TowerLevelRecordOuterClass.TowerLevelRecord> buildFromPassedLevelMap(Map<Integer, Integer> map) {
        return map.entrySet().stream()
                .map(item -> TowerLevelRecordOuterClass.TowerLevelRecord.newBuilder()
                        .setLevelId(item.getKey())
                        .addAllSatisfiedCondList(IntStream.range(1, item.getValue() + 1).boxed().toList())
                        .build())
                .toList();

    }

}
