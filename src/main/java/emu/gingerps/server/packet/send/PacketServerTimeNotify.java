package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ServerTimeNotifyOuterClass.ServerTimeNotify;

public class PacketServerTimeNotify extends BasePacket {
	
	public PacketServerTimeNotify() {
		super(PacketOpcodes.ServerTimeNotify);

		ServerTimeNotify proto = ServerTimeNotify.newBuilder()
				.setServerTime(System.currentTimeMillis())
				.build();
		
		this.setData(proto);
	}
}
