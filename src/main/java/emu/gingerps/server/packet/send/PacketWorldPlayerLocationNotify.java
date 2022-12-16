package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WorldPlayerLocationNotifyOuterClass.WorldPlayerLocationNotify;

public class PacketWorldPlayerLocationNotify extends BasePacket {
	
	public PacketWorldPlayerLocationNotify(World world) {
		super(PacketOpcodes.WorldPlayerLocationNotify);

		WorldPlayerLocationNotify.Builder proto = WorldPlayerLocationNotify.newBuilder();
		
		for (Player p : world.getPlayers()) {
			proto.addPlayerWorldLocList(p.getWorldPlayerLocationInfo());
		}
		
		this.setData(proto);
	}
}
