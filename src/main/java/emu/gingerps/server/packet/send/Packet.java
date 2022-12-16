package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class Packet extends BasePacket {
	
	public Packet() {
		super(PacketOpcodes.NONE);

	}
}
