package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerApplyEnterMpResultRspOuterClass.PlayerApplyEnterMpResultRsp;

public class PacketPlayerApplyEnterMpResultRsp extends BasePacket {
	
	public PacketPlayerApplyEnterMpResultRsp(int applyUid, boolean isAgreed) {
		super(PacketOpcodes.PlayerApplyEnterMpResultRsp);

		PlayerApplyEnterMpResultRsp proto = PlayerApplyEnterMpResultRsp.newBuilder()
				.setApplyUid(applyUid)
				.setIsAgreed(isAgreed)
				.build();
		
		this.setData(proto);
	}
}
