package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketH5ActivityIdsNotify;

@Opcodes(PacketOpcodes.GetAllH5ActivityInfoReq)
public class HandlerGetAllH5ActivityInfoReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		session.send(new PacketH5ActivityIdsNotify());
	}

}
