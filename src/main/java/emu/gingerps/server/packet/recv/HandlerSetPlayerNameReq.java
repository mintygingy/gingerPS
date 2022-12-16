package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerNameReqOuterClass.SetPlayerNameReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetPlayerNameRsp;

@Opcodes(PacketOpcodes.SetPlayerNameReq)
public class HandlerSetPlayerNameReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// Auto template
		SetPlayerNameReq req = SetPlayerNameReq.parseFrom(payload);
		
		if (req.getNickName() != null && req.getNickName().length() > 0) {
			session.getPlayer().setNickname(req.getNickName());
			session.send(new PacketSetPlayerNameRsp(session.getPlayer()));
		}
	}

}
