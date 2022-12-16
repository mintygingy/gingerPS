package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeSceneJumpRspOuterClass;

public class PacketHomeSceneJumpRsp extends BasePacket {

	public PacketHomeSceneJumpRsp(boolean enterRoomScene) {
		super(PacketOpcodes.HomeSceneJumpRsp);

		var proto = HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.newBuilder();

		proto.setIsEnterRoomScene(enterRoomScene);

		this.setData(proto);
	}
}
