package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.player.TeamInfo;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetUpAvatarTeamRspOuterClass.SetUpAvatarTeamRsp;

public class PacketSetUpAvatarTeamRsp extends BasePacket {
	
	public PacketSetUpAvatarTeamRsp(Player player, int teamId, TeamInfo teamInfo) {
		super(PacketOpcodes.SetUpAvatarTeamRsp);

		SetUpAvatarTeamRsp.Builder proto = SetUpAvatarTeamRsp.newBuilder()
				.setTeamId(teamId)
				.setCurAvatarGuid(player.getTeamManager().getCurrentCharacterGuid());
		
		for (int avatarId : teamInfo.getAvatars()) {
			proto.addAvatarTeamGuidList(player.getAvatars().getAvatarById(avatarId).getGuid());
		}
		
		this.setData(proto);
	}
}
