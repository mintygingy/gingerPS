package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketPlayerSetPauseRsp extends BasePacket {

	public PacketPlayerSetPauseRsp(int clientSequence) {
		super(PacketOpcodes.PlayerSetPauseRsp);
		
		this.buildHeader(clientSequence);
	}
}
