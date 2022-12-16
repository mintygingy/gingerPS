package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarGainFlycloakNotifyOuterClass.AvatarGainFlycloakNotify;

public class PacketAvatarGainFlycloakNotify extends BasePacket {
	
	public PacketAvatarGainFlycloakNotify(int flycloak) {
		super(PacketOpcodes.AvatarGainFlycloakNotify);

		AvatarGainFlycloakNotify proto = AvatarGainFlycloakNotify.newBuilder()
				.setFlycloakId(flycloak)
				.build();
		
		this.setData(proto);
	}
}
