package emu.gingerps.server.packet.send;

import java.util.Collection;

import emu.gingerps.game.battlepass.BattlePassMission;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify;

public class PacketBattlePassMissionUpdateNotify extends BasePacket {

    public PacketBattlePassMissionUpdateNotify(BattlePassMission mission) {
        super(PacketOpcodes.BattlePassMissionUpdateNotify);

        var proto = BattlePassMissionUpdateNotify.newBuilder()
        		.addMissionList(mission.toProto())
        		.build();

        this.setData(proto);
    }
    
    public PacketBattlePassMissionUpdateNotify(Collection<BattlePassMission> missions) {
        super(PacketOpcodes.BattlePassMissionUpdateNotify);

        var proto = BattlePassMissionUpdateNotify.newBuilder();

        missions.forEach(mission -> {
        	proto.addMissionList(mission.toProto());
        });
        
        this.setData(proto.build());
    }

}
