package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PacketHeadOuterClass.PacketHead;
import emu.gingerps.net.proto.PlayerSetPauseReqOuterClass.PlayerSetPauseReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlayerSetPauseRsp;

@Opcodes(PacketOpcodes.PlayerSetPauseReq)
public class HandlerPlayerSetPauseReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		PacketHead head = PacketHead.parseFrom(header);
		PlayerSetPauseReq req = PlayerSetPauseReq.parseFrom(payload);
		
		session.send(new PacketPlayerSetPauseRsp(head.getClientSequenceId()));
		session.getPlayer().setPaused(req.getIsPaused());
	}

}
