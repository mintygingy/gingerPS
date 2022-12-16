package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PacketHeadOuterClass.PacketHead;
import emu.gingerps.net.proto.PingReqOuterClass.PingReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPingRsp;

@Opcodes(PacketOpcodes.PingReq)
public class HandlerPingReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		PacketHead head = PacketHead.parseFrom(header);
		PingReq ping = PingReq.parseFrom(payload);
		
		session.updateLastPingTime(ping.getClientTime());
		
		session.send(new PacketPingRsp(head.getClientSequenceId(), ping.getClientTime()));
	}

}
