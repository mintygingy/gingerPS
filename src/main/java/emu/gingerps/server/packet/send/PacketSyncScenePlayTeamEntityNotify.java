package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SyncScenePlayTeamEntityNotifyOuterClass.SyncScenePlayTeamEntityNotify;

public class PacketSyncScenePlayTeamEntityNotify extends BasePacket {
	
	public PacketSyncScenePlayTeamEntityNotify(Player player) {
		super(PacketOpcodes.SyncScenePlayTeamEntityNotify);

		SyncScenePlayTeamEntityNotify proto = SyncScenePlayTeamEntityNotify.newBuilder()
				.setSceneId(player.getSceneId())
				.build(); 
		
		this.setData(proto);
	}
}
