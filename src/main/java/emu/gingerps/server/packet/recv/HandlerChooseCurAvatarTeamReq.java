package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ChooseCurAvatarTeamReq)
public class HandlerChooseCurAvatarTeamReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		ChooseCurAvatarTeamReq req = ChooseCurAvatarTeamReq.parseFrom(payload);
		
		session.getPlayer().getTeamManager().setCurrentTeam(req.getTeamId());
	}

}
