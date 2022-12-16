package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilityChangeNotifyOuterClass.AbilityChangeNotify;

public class PacketAbilityChangeNotify extends BasePacket {
	
	public PacketAbilityChangeNotify(EntityAvatar entity) {
		super(PacketOpcodes.AbilityChangeNotify, true);

		AbilityChangeNotify proto = AbilityChangeNotify.newBuilder()
				.setEntityId(entity.getId())
				.setAbilityControlBlock(entity.getAbilityControlBlock())
				.build();
		
		this.setData(proto);
	}
}
