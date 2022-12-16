package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.SetUpAvatarTeamReq)
public class HandlerSetUpAvatarTeamReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		SetUpAvatarTeamReq req = SetUpAvatarTeamReq.parseFrom(payload);
		
		session.getPlayer().getTeamManager().setupAvatarTeam(req.getTeamId(), req.getAvatarTeamGuidListList());
	}

}
