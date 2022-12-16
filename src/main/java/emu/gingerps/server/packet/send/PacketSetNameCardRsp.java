package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetNameCardRspOuterClass.SetNameCardRsp;

public class PacketSetNameCardRsp extends BasePacket {
	
	public PacketSetNameCardRsp(int nameCardId) {
		super(PacketOpcodes.SetNameCardRsp);
		
		SetNameCardRsp proto = SetNameCardRsp.newBuilder()
				.setNameCardId(nameCardId)
				.build();
		
		this.setData(proto);
	}
}
