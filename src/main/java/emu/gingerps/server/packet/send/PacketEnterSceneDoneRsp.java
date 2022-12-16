package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EnterSceneDoneRspOuterClass.EnterSceneDoneRsp;

public class PacketEnterSceneDoneRsp extends BasePacket {

	public PacketEnterSceneDoneRsp(Player player) {
		super(PacketOpcodes.EnterSceneDoneRsp);

		EnterSceneDoneRsp p = EnterSceneDoneRsp.newBuilder()
				.setEnterSceneToken(player.getEnterSceneToken())
				.build();
		
		this.setData(p);
	}
}
