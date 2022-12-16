package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify;

public class PacketAvatarAddNotify extends BasePacket {
	
	public PacketAvatarAddNotify(Avatar avatar, boolean addedToTeam) {
		super(PacketOpcodes.AvatarAddNotify);
		
		AvatarAddNotify proto = AvatarAddNotify.newBuilder()
				.setAvatar(avatar.toProto())
				.setIsInTeam(addedToTeam)
				.build();
		
		this.setData(proto);
	}
}
