package emu.gingerps.server.packet.send;

import emu.gingerps.data.GameData;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.*;
import emu.gingerps.net.proto.BattlePassAllDataNotifyOuterClass.BattlePassAllDataNotify;

import java.util.ArrayList;
import java.util.List;

public class PacketBattlePassAllDataNotify extends BasePacket {
    public PacketBattlePassAllDataNotify(Player player) {
        super(PacketOpcodes.BattlePassAllDataNotify);

        var proto = BattlePassAllDataNotify.newBuilder();
        
        proto
        	.setHaveCurSchedule(true)
        	.setCurSchedule(player.getBattlePassManager().getScheduleProto());

        for (var missionData : GameData.getBattlePassMissionDataMap().values()) {
        	// Dont send invalid refresh types
        	if (!missionData.isValidRefreshType()) {
        		continue;
        	}
        	
        	// Check if player has mission in bp manager. If not, then add an empty proto from the mission data
        	if (player.getBattlePassManager().hasMission(missionData.getId())) {
        		proto.addMissionList(player.getBattlePassManager().loadMissionById(missionData.getId()).toProto());
        	} else {
        		proto.addMissionList(missionData.toProto());
        	}
        }

        setData(proto.build());
    }
}
