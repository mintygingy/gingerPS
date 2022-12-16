package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketPathfindingEnterSceneRsp extends BasePacket {

	public PacketPathfindingEnterSceneRsp(int clientSequence) {
		super(PacketOpcodes.PathfindingEnterSceneRsp);
	}
}
