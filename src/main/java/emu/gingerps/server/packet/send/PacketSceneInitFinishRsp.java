package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneInitFinishRspOuterClass.SceneInitFinishRsp;

public class PacketSceneInitFinishRsp extends BasePacket {

	public PacketSceneInitFinishRsp(Player player) {
		super(PacketOpcodes.SceneInitFinishRsp, 11);
		
		SceneInitFinishRsp p = SceneInitFinishRsp.newBuilder().setEnterSceneToken(player.getEnterSceneToken()).build();
		
		this.setData(p.toByteArray());
	}
}
