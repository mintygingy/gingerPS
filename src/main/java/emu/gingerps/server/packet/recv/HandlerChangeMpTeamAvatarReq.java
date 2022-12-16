package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ChangeMpTeamAvatarReq)
public class HandlerChangeMpTeamAvatarReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		ChangeMpTeamAvatarReq req = ChangeMpTeamAvatarReq.parseFrom(payload);
		
		session.getPlayer().getTeamManager().setupMpTeam(req.getAvatarGuidListList());
	}

}
