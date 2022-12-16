package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ObstacleModifyNotify)
public class HandlerObstacleModifyNotify extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// Auto template
	}

}
