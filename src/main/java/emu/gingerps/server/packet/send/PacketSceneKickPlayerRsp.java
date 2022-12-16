package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.net.proto.SceneKickPlayerRspOuterClass.SceneKickPlayerRsp;

public class PacketSceneKickPlayerRsp extends BasePacket {
	
	public PacketSceneKickPlayerRsp(int targetUid) {
		super(PacketOpcodes.SceneKickPlayerRsp);

		SceneKickPlayerRsp proto = SceneKickPlayerRsp.newBuilder()
				.setTargetUid(targetUid)
				.build();
		
		this.setData(proto);
	}
	
	public PacketSceneKickPlayerRsp() {
		super(PacketOpcodes.SceneKickPlayerRsp);

		SceneKickPlayerRsp proto = SceneKickPlayerRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
				.build();
		
		this.setData(proto);
	}
}
