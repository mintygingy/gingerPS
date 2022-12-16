package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify;

public class PacketPlayerGameTimeNotify extends BasePacket {
	
	public PacketPlayerGameTimeNotify(Player player) {
		super(PacketOpcodes.PlayerGameTimeNotify);
		
		PlayerGameTimeNotify proto = PlayerGameTimeNotify.newBuilder()
				.setGameTime(player.getScene().getTime())
				.setUid(player.getUid())
				.build();
		
		this.setData(proto);
	}
}
