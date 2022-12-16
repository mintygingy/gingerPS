package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WorldPlayerInfoNotifyOuterClass.WorldPlayerInfoNotify;

public class PacketWorldPlayerInfoNotify extends BasePacket {
	
	public PacketWorldPlayerInfoNotify(World world) {
		super(PacketOpcodes.WorldPlayerInfoNotify);
		
		WorldPlayerInfoNotify.Builder proto = WorldPlayerInfoNotify.newBuilder();
		
		for (int i = 0; i < world.getPlayers().size(); i++) {
			Player p = world.getPlayers().get(i);
			
			proto.addPlayerInfoList(p.getOnlinePlayerInfo());
			proto.addPlayerUidList(p.getUid());
		}
		
		this.setData(proto.build());
	}
}
