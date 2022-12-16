package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SelectWorktopOptionRspOuterClass.SelectWorktopOptionRsp;

public class PacketSelectWorktopOptionRsp extends BasePacket {
	
	public PacketSelectWorktopOptionRsp(int entityId, int optionId) {
		super(PacketOpcodes.SelectWorktopOptionRsp);
		
		SelectWorktopOptionRsp proto = SelectWorktopOptionRsp.newBuilder()
				.setGadgetEntityId(entityId)
				.setOptionId(optionId)
				.build();
		
		this.setData(proto);
	}
}
