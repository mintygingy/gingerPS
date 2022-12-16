package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarChangeCostumeNotifyOuterClass.AvatarChangeCostumeNotify;

public class PacketAvatarChangeCostumeNotify extends BasePacket {
	
	public PacketAvatarChangeCostumeNotify(EntityAvatar entity) {
		super(PacketOpcodes.AvatarChangeCostumeNotify);

		AvatarChangeCostumeNotify proto = AvatarChangeCostumeNotify.newBuilder()
				.setEntityInfo(entity.toProto())
				.build();
		
		this.setData(proto);
	}
}
