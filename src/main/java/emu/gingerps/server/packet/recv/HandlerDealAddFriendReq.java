package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DealAddFriendReqOuterClass.DealAddFriendReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.DealAddFriendReq)
public class HandlerDealAddFriendReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		DealAddFriendReq req = DealAddFriendReq.parseFrom(payload);
		
		session.getPlayer().getFriendsList().handleFriendRequest(req.getTargetUid(), req.getDealAddFriendResult());
	}

}
