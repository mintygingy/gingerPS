package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketFurnitureCurModuleArrangeCountNotify;

@Opcodes(PacketOpcodes.GetFurnitureCurModuleArrangeCountReq)
public class HandlerGetFurnitureCurModuleArrangeCountReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		session.send(new PacketFurnitureCurModuleArrangeCountNotify());
	}

}
