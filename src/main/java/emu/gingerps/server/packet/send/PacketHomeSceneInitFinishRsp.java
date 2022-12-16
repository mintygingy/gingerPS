package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeSceneArrangementInfoOuterClass;
import emu.gingerps.net.proto.HomeSceneInitFinishReqOuterClass;

public class PacketHomeSceneInitFinishRsp extends BasePacket {

	public PacketHomeSceneInitFinishRsp() {
		super(PacketOpcodes.HomeSceneInitFinishRsp);

		var proto = HomeSceneInitFinishReqOuterClass.HomeSceneInitFinishReq.newBuilder();

		this.setData(proto);

	}
}
