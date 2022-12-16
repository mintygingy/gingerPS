package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarFightPropUpdateNotifyOuterClass.AvatarFightPropUpdateNotify;

public class PacketAvatarFightPropUpdateNotify extends BasePacket {
	
	public PacketAvatarFightPropUpdateNotify(Avatar avatar, FightProperty prop) {
		super(PacketOpcodes.AvatarFightPropUpdateNotify);
		
		AvatarFightPropUpdateNotify proto = AvatarFightPropUpdateNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.putFightPropMap(prop.getId(), avatar.getFightProperty(prop))
				.build();
		
		this.setData(proto);
	}
}
