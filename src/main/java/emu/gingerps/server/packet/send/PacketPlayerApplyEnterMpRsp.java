package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp;

public class PacketPlayerApplyEnterMpRsp extends BasePacket {
	
	public PacketPlayerApplyEnterMpRsp(int targetUid) {
		super(PacketOpcodes.PlayerApplyEnterMpRsp);
		
		PlayerApplyEnterMpRsp proto = PlayerApplyEnterMpRsp.newBuilder()
				.setTargetUid(targetUid)
				.build();
		
		this.setData(proto);
	}
}
