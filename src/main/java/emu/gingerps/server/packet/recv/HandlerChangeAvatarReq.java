package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ChangeAvatarReq)
public class HandlerChangeAvatarReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		ChangeAvatarReq req = ChangeAvatarReq.parseFrom(payload);
		
		session.getPlayer().getTeamManager().changeAvatar(req.getGuid());
	}

}
