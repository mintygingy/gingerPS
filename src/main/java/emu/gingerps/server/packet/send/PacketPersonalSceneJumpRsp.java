package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PersonalSceneJumpRspOuterClass.PersonalSceneJumpRsp;
import emu.gingerps.utils.Position;

public class PacketPersonalSceneJumpRsp extends BasePacket {

	public PacketPersonalSceneJumpRsp(int sceneId, Position pos) {
		super(PacketOpcodes.PersonalSceneJumpRsp);

		PersonalSceneJumpRsp proto = PersonalSceneJumpRsp.newBuilder()
				.setDestSceneId(sceneId)
				.setDestPos(pos.toProto())
				.build();
		
		this.setData(proto);
	}
}
