package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AskAddFriendReqOuterClass.AskAddFriendReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.AskAddFriendReq)
public class HandlerAskAddFriendReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		AskAddFriendReq req = AskAddFriendReq.parseFrom(payload);
		
		session.getPlayer().getFriendsList().sendFriendRequest(req.getTargetUid());
	}

}
