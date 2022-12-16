package emu.gingerps.server.packet.send;

import java.util.Collection;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneEntityAppearNotifyOuterClass.SceneEntityAppearNotify;
import emu.gingerps.net.proto.VisionTypeOuterClass.VisionType;

public class PacketSceneEntityAppearNotify extends BasePacket {
	
	public PacketSceneEntityAppearNotify(GameEntity entity) {
		super(PacketOpcodes.SceneEntityAppearNotify, true);

		SceneEntityAppearNotify.Builder proto = SceneEntityAppearNotify.newBuilder()
				.setAppearType(VisionType.VISION_TYPE_BORN)
				.addEntityList(entity.toProto());

		this.setData(proto.build());
	}
	
	public PacketSceneEntityAppearNotify(GameEntity entity, VisionType vision, int param) {
		super(PacketOpcodes.SceneEntityAppearNotify, true);

		SceneEntityAppearNotify.Builder proto = SceneEntityAppearNotify.newBuilder()
				.setAppearType(vision)
				.setParam(param)
				.addEntityList(entity.toProto());

		this.setData(proto.build());
	}
	
	public PacketSceneEntityAppearNotify(Player player) {
		this(player.getTeamManager().getCurrentAvatarEntity());
	}

	public PacketSceneEntityAppearNotify(Collection<? extends GameEntity> entities, VisionType visionType) {
		super(PacketOpcodes.SceneEntityAppearNotify, true);
		
		SceneEntityAppearNotify.Builder proto = SceneEntityAppearNotify.newBuilder()
				.setAppearType(visionType);
		
		entities.forEach(e -> proto.addEntityList(e.toProto()));

		this.setData(proto.build());
	}
}
