package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerTimeNotifyOuterClass.PlayerTimeNotify;

public class PacketPlayerTimeNotify extends BasePacket {
	
	public PacketPlayerTimeNotify(Player player) {
		super(PacketOpcodes.PlayerTimeNotify);

		PlayerTimeNotify proto = PlayerTimeNotify.newBuilder()
				.setIsPaused(player.isPaused())
				.setPlayerTime(player.getClientTime())
				.setServerTime(System.currentTimeMillis())
				.build();
		
		this.setData(proto);
	}
}
