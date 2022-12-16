package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerDieTypeOuterClass.PlayerDieType;
import emu.gingerps.net.proto.WorldPlayerDieNotifyOuterClass.WorldPlayerDieNotify;

public class PacketWorldPlayerDieNotify extends BasePacket {
	
	public PacketWorldPlayerDieNotify(PlayerDieType playerDieType, int killerId) {
		super(PacketOpcodes.WorldPlayerDieNotify);

		WorldPlayerDieNotify proto = WorldPlayerDieNotify.newBuilder()
				.setDieType(playerDieType)
				.setMonsterId(killerId)
				.build();
		
		this.setData(proto);
	}
}
