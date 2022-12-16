package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.player.TeamInfo;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeMpTeamAvatarRspOuterClass.ChangeMpTeamAvatarRsp;

public class PacketChangeMpTeamAvatarRsp extends BasePacket {
	
	public PacketChangeMpTeamAvatarRsp(Player player, TeamInfo teamInfo) {
		super(PacketOpcodes.ChangeMpTeamAvatarRsp);
		
		ChangeMpTeamAvatarRsp.Builder proto = ChangeMpTeamAvatarRsp.newBuilder()
				.setCurAvatarGuid(player.getTeamManager().getCurrentCharacterGuid());
		
		for (int avatarId : teamInfo.getAvatars()) {
			proto.addAvatarGuidList(player.getAvatars().getAvatarById(avatarId).getGuid());
		}
		
		this.setData(proto);
	}
}
