package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ForgeQueueManipulateReq)
public class HandlerForgeQueueManipulateReq extends PacketHandler {
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
    	ForgeQueueManipulateReq req = ForgeQueueManipulateReq.parseFrom(payload);
		session.getPlayer().getForgingManager().handleForgeQueueManipulateReq(req);
	}
}
