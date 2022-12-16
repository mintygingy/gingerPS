package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.game.props.LifeState;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarLifeStateChangeNotifyOuterClass.AvatarLifeStateChangeNotify;
import emu.gingerps.net.proto.PlayerDieTypeOuterClass.PlayerDieType;
import emu.gingerps.net.proto.ServerBuffOuterClass;
import emu.gingerps.net.proto.ServerBuffOuterClass.ServerBuff;

import java.util.ArrayList;

public class PacketAvatarLifeStateChangeNotify extends BasePacket {
	
	public PacketAvatarLifeStateChangeNotify(Avatar avatar) {
		super(PacketOpcodes.AvatarLifeStateChangeNotify);

		AvatarLifeStateChangeNotify proto = AvatarLifeStateChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setLifeState(avatar.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP) > 0 ? LifeState.LIFE_ALIVE.getValue() : LifeState.LIFE_DEAD.getValue())
				.build();
		
		this.setData(proto);
	}
	public PacketAvatarLifeStateChangeNotify(Avatar avatar, int attackerId, LifeState lifeState) {
		super(PacketOpcodes.AvatarLifeStateChangeNotify);

		AvatarLifeStateChangeNotify proto = AvatarLifeStateChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setLifeState(lifeState.getValue())
				.setMoveReliableSeq(attackerId)
				.build();

		this.setData(proto);
	}

	public PacketAvatarLifeStateChangeNotify(Avatar avatar, LifeState lifeState, PlayerDieType dieType) {
		this(avatar, lifeState, null, "", dieType);
	}

	public PacketAvatarLifeStateChangeNotify(Avatar avatar, LifeState lifeState, GameEntity sourceEntity,
											 String attackTag, PlayerDieType dieType) {
		super(PacketOpcodes.AvatarLifeStateChangeNotify);

		AvatarLifeStateChangeNotify.Builder proto = AvatarLifeStateChangeNotify.newBuilder();

		proto.setAvatarGuid(avatar.getGuid());
		proto.setLifeState(lifeState.getValue());
		if (sourceEntity != null) {
			proto.setSourceEntityId(sourceEntity.getId());
		}
		proto.setDieType(dieType);
		proto.setAttackTag((attackTag));

		this.setData(proto.build());
	}

}
