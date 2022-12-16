package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerSignatureReqOuterClass.SetPlayerSignatureReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetPlayerSignatureRsp;

@Opcodes(PacketOpcodes.SetPlayerSignatureReq)
public class HandlerSetPlayerSignatureReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// Auto template
		SetPlayerSignatureReq req = SetPlayerSignatureReq.parseFrom(payload);
		
		if (req.getSignature() != null && req.getSignature().length() > 0) {
			session.getPlayer().setSignature(req.getSignature());
			session.send(new PacketSetPlayerSignatureRsp(session.getPlayer()));
		}
	}

}
