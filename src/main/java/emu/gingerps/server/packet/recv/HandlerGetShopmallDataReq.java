package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetShopmallDataRsp;

@Opcodes(PacketOpcodes.GetShopmallDataReq)
public class HandlerGetShopmallDataReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// TODO add the correct shops
		session.send(new PacketGetShopmallDataRsp());
	}

}
