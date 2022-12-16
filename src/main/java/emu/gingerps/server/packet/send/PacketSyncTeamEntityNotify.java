package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo;
import emu.gingerps.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify;
import emu.gingerps.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo;

public class PacketSyncTeamEntityNotify extends BasePacket {
	
	public PacketSyncTeamEntityNotify(Player player) {
		super(PacketOpcodes.SyncTeamEntityNotify);
		
		SyncTeamEntityNotify.Builder proto = SyncTeamEntityNotify.newBuilder()
				.setSceneId(player.getSceneId());
		
		if (player.getWorld().isMultiplayer()) {
			for (Player p : player.getWorld().getPlayers()) {
				// Skip if same player
				if (player == p) {
					continue;
				}
				
				// Set info
				TeamEntityInfo info = TeamEntityInfo.newBuilder()
						.setTeamEntityId(p.getTeamManager().getEntityId())
						.setAuthorityPeerId(p.getPeerId())
						.setTeamAbilityInfo(AbilitySyncStateInfo.newBuilder())
						.build();
				
				proto.addTeamEntityInfoList(info);
			}
		}

		this.setData(proto);
	}
}
