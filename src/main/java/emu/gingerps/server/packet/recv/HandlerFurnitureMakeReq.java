package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.FurnitureMakeReq)
public class HandlerFurnitureMakeReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		session.getPlayer().getFurnitureManager().queryStatus();
	}

}
