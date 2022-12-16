package emu.gingerps.server.packet.send;

import java.util.Collection;
import java.util.List;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify;
import emu.gingerps.net.proto.VisionTypeOuterClass.VisionType;

public class PacketSceneEntityDisappearNotify extends BasePacket {
	
	public PacketSceneEntityDisappearNotify(GameEntity entity, VisionType disappearType) {
		super(PacketOpcodes.SceneEntityDisappearNotify);

		SceneEntityDisappearNotify proto = SceneEntityDisappearNotify.newBuilder()
				.setDisappearType(disappearType)
				.addEntityList(entity.getId())
				.build();

		this.setData(proto);
	}
	
	public PacketSceneEntityDisappearNotify(Collection<GameEntity> entities, VisionType disappearType) {
		super(PacketOpcodes.SceneEntityDisappearNotify);

		SceneEntityDisappearNotify.Builder proto = SceneEntityDisappearNotify.newBuilder()
				.setDisappearType(disappearType);
		
		entities.forEach(e -> proto.addEntityList(e.getId()));

		this.setData(proto);
	}
}
