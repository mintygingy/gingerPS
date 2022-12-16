package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeAvatarRspOuterClass.ChangeAvatarRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketChangeAvatarRsp extends BasePacket {
	
	public PacketChangeAvatarRsp(long guid) {
		super(PacketOpcodes.ChangeAvatarRsp);

		ChangeAvatarRsp p = ChangeAvatarRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SUCC_VALUE)
				.setCurGuid(guid)
				.build();
		
		this.setData(p);
	}
}
