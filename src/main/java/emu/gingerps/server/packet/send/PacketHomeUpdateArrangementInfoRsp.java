package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketHomeUpdateArrangementInfoRsp extends BasePacket {

	public PacketHomeUpdateArrangementInfoRsp() {
		super(PacketOpcodes.HomeUpdateArrangementInfoRsp);

	}
}
