package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify;

public class PacketEntityFightPropUpdateNotify extends BasePacket {
	
	public PacketEntityFightPropUpdateNotify(GameEntity entity, FightProperty prop) {
		super(PacketOpcodes.EntityFightPropUpdateNotify);
		
		EntityFightPropUpdateNotify proto = EntityFightPropUpdateNotify.newBuilder()
				.setEntityId(entity.getId())
				.putFightPropMap(prop.getId(), entity.getFightProperty(prop))
				.build();
		
		this.setData(proto);
	}
}
