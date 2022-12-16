package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DeleteFriendReqOuterClass.DeleteFriendReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.DeleteFriendReq)
public class HandlerDeleteFriendReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		DeleteFriendReq req = DeleteFriendReq.parseFrom(payload);
		
		session.getPlayer().getFriendsList().deleteFriend(req.getTargetUid());
	}

}
