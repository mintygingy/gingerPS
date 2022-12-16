package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.*;
import emu.gingerps.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify;

import java.util.ArrayList;
import java.util.List;

public class PacketBattlePassCurScheduleUpdateNotify extends BasePacket {
	
    public PacketBattlePassCurScheduleUpdateNotify(Player player) {
        super(PacketOpcodes.BattlePassCurScheduleUpdateNotify);

        var proto = BattlePassCurScheduleUpdateNotify.newBuilder();

        proto
        	.setHaveCurSchedule(true)
        	.setCurSchedule(player.getBattlePassManager().getScheduleProto())
        	.build();

        setData(proto.build());

    }
}
