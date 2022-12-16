package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarChangeElementTypeRspOuterClass.AvatarChangeElementTypeRsp;

public class PacketAvatarChangeElementTypeRsp extends BasePacket {
	
	public PacketAvatarChangeElementTypeRsp() {
		super(PacketOpcodes.AvatarChangeElementTypeRsp);
	}
	
	public PacketAvatarChangeElementTypeRsp(int retcode) {
		super(PacketOpcodes.AvatarChangeElementTypeRsp);
		
		if (retcode > 0) {
			AvatarChangeElementTypeRsp proto = AvatarChangeElementTypeRsp.newBuilder()
					.setRetcode(retcode)
					.build();
			
			this.setData(proto);
		}
	}
}
