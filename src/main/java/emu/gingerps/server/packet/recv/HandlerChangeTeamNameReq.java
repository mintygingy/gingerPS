package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ChangeTeamNameReq)
public class HandlerChangeTeamNameReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		ChangeTeamNameReq req = ChangeTeamNameReq.parseFrom(payload);
		
		session.getPlayer().getTeamManager().setTeamName(req.getTeamId(), req.getTeamName());
	}

}
