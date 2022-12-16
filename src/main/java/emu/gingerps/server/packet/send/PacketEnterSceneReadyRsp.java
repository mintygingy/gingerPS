package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp;

public class PacketEnterSceneReadyRsp extends BasePacket {

	public PacketEnterSceneReadyRsp(Player player) {
		super(PacketOpcodes.EnterSceneReadyRsp, 11);
		
		EnterSceneReadyRsp p = EnterSceneReadyRsp.newBuilder()
				.setEnterSceneToken(player.getEnterSceneToken())
				.build();
		
		this.setData(p.toByteArray());
	}
}
