package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketAvatarChangeCostumeRsp extends BasePacket {
	
	public PacketAvatarChangeCostumeRsp(long avatarGuid, int costumeId) {
		super(PacketOpcodes.AvatarChangeCostumeRsp);

		AvatarChangeCostumeRsp proto = AvatarChangeCostumeRsp.newBuilder()
				.setAvatarGuid(avatarGuid)
				.setCostumeId(costumeId)
				.build();
		
		this.setData(proto);
	}
	
	public PacketAvatarChangeCostumeRsp() {
		super(PacketOpcodes.AvatarChangeCostumeRsp);

		AvatarChangeCostumeRsp proto = AvatarChangeCostumeRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
				.build();
		
		this.setData(proto);
	}
}
