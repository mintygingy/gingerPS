package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarFightPropNotifyOuterClass.AvatarFightPropNotify;

public class PacketAvatarFightPropNotify extends BasePacket {
	
	public PacketAvatarFightPropNotify(Avatar avatar) {
		super(PacketOpcodes.AvatarFightPropNotify);
		
		AvatarFightPropNotify proto = AvatarFightPropNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.putAllFightPropMap(avatar.getFightProperties())
				.build();
		
		this.setData(proto);
	}
}
