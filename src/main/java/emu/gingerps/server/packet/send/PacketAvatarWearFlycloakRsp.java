package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarWearFlycloakRspOuterClass.AvatarWearFlycloakRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketAvatarWearFlycloakRsp extends BasePacket {
	public PacketAvatarWearFlycloakRsp(long avatarGuid, int costumeId) {
		super(PacketOpcodes.AvatarWearFlycloakRsp);

		AvatarWearFlycloakRsp proto = AvatarWearFlycloakRsp.newBuilder()
				.setAvatarGuid(avatarGuid)
				.setFlycloakId(costumeId)
				.build();
		
		this.setData(proto);
	}
	
	public PacketAvatarWearFlycloakRsp() {
		super(PacketOpcodes.AvatarWearFlycloakRsp);

		AvatarWearFlycloakRsp proto = AvatarWearFlycloakRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
				.build();
		
		this.setData(proto);
	}
}
