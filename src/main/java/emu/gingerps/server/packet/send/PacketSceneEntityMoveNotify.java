package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo;
import emu.gingerps.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify;

public class PacketSceneEntityMoveNotify extends BasePacket {
	
	public PacketSceneEntityMoveNotify(EntityMoveInfo moveInfo) {
		super(PacketOpcodes.SceneEntityMoveNotify, true);

		SceneEntityMoveNotify proto = SceneEntityMoveNotify.newBuilder()
				.setMotionInfo(moveInfo.getMotionInfo())
				.setEntityId(moveInfo.getEntityId())
				.setSceneTime(moveInfo.getSceneTime())
				.setReliableSeq(moveInfo.getReliableSeq())
				.build();
		
		this.setData(proto);
	}
}
