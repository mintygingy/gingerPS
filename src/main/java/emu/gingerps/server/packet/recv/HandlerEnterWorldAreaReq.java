package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq;
import emu.gingerps.net.proto.PacketHeadOuterClass.PacketHead;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEnterWorldAreaRsp;

@Opcodes(PacketOpcodes.EnterWorldAreaReq)
public class HandlerEnterWorldAreaReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		PacketHead head = PacketHead.parseFrom(header);
		EnterWorldAreaReq enterWorld = EnterWorldAreaReq.parseFrom(payload);
		
		session.send(new PacketEnterWorldAreaRsp(head.getClientSequenceId(), enterWorld));
		//session.send(new PacketScenePlayerLocationNotify(session.getPlayer()));
	}

}
