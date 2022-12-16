package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify;

public class PacketAvatarFlycloakChangeNotify extends BasePacket {
	
	public PacketAvatarFlycloakChangeNotify(Avatar avatar) {
		super(PacketOpcodes.AvatarFlycloakChangeNotify);

		 AvatarFlycloakChangeNotify proto = AvatarFlycloakChangeNotify.newBuilder()
				 .setAvatarGuid(avatar.getGuid())
				 .setFlycloakId(avatar.getFlyCloak())
				 .build();

		 this.setData(proto);
	}
}
