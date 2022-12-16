package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PostEnterSceneRspOuterClass.PostEnterSceneRsp;

public class PacketPostEnterSceneRsp extends BasePacket {

	public PacketPostEnterSceneRsp(Player player) {
		super(PacketOpcodes.PostEnterSceneRsp);
		
		PostEnterSceneRsp p = PostEnterSceneRsp.newBuilder()
			.setEnterSceneToken(player.getEnterSceneToken())
			.build();
		
		this.setData(p);
	}
}
