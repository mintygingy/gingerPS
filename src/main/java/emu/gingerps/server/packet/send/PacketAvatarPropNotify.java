package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarPropNotifyOuterClass.AvatarPropNotify;

public class PacketAvatarPropNotify extends BasePacket {
	public PacketAvatarPropNotify(Avatar avatar) {
		super(PacketOpcodes.AvatarPropNotify);
		
		AvatarPropNotify proto = AvatarPropNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.putPropMap(PlayerProperty.PROP_LEVEL.getId(), avatar.getLevel())
				.putPropMap(PlayerProperty.PROP_EXP.getId(), avatar.getExp())
				.putPropMap(PlayerProperty.PROP_BREAK_LEVEL.getId(), avatar.getPromoteLevel())
				.putPropMap(PlayerProperty.PROP_SATIATION_VAL.getId(), 0)
				.putPropMap(PlayerProperty.PROP_SATIATION_PENALTY_TIME.getId(), 0)
				.build();
		
		this.setData(proto);
	}
	
	public PacketAvatarPropNotify(Avatar avatar, PlayerProperty prop, int value) {
		super(PacketOpcodes.AvatarPropNotify);

		AvatarPropNotify proto = AvatarPropNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.putPropMap(prop.getId(), value)
				.build();
		
		this.setData(proto);
	}
}
