package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp;

public class PacketSetBattlePassViewedRsp extends BasePacket {
	
	public PacketSetBattlePassViewedRsp(int scheduleId) {
		super(PacketOpcodes.SetBattlePassViewedRsp);
		
		SetBattlePassViewedRsp proto = SetBattlePassViewedRsp.newBuilder()
				.setScheduleId(scheduleId)
				.build();
		
		this.setData(proto);
	}
}
