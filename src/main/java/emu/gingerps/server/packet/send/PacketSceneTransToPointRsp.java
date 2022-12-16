package emu.gingerps.server.packet.send;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ScenePointEntry;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.net.proto.SceneTransToPointRspOuterClass.SceneTransToPointRsp;
import emu.gingerps.utils.Position;

public class PacketSceneTransToPointRsp extends BasePacket {
	
	public PacketSceneTransToPointRsp(Player player, int pointId, int sceneId) {
		super(PacketOpcodes.SceneTransToPointRsp);

		SceneTransToPointRsp proto = SceneTransToPointRsp.newBuilder()
				.setRetcode(0)
	            .setPointId(pointId)
	            .setSceneId(sceneId)
	            .build();

		this.setData(proto);
	}

	public PacketSceneTransToPointRsp() {
		super(PacketOpcodes.SceneTransToPointRsp);
		
		SceneTransToPointRsp proto = SceneTransToPointRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE) // Internal server error
	            .build();

		this.setData(proto);
	}
}
