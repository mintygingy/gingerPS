package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerRTTInfoOuterClass.PlayerRTTInfo;
import emu.gingerps.net.proto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify;

public class PacketWorldPlayerRTTNotify extends BasePacket {
	
	public PacketWorldPlayerRTTNotify(World world) {
		super(PacketOpcodes.WorldPlayerRTTNotify);
		
		WorldPlayerRTTNotify.Builder proto = WorldPlayerRTTNotify.newBuilder();
		
		for (Player player : world.getPlayers()) {
			proto.addPlayerRttList(
					PlayerRTTInfo.newBuilder()
							.setUid(player.getUid())
							.setRtt(10) // TODO - put player ping here
			);
		}
		
		this.setData(proto);
	}
}
