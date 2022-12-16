package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeFurnitureMakeReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.TakeFurnitureMakeReq)
public class HandlerTakeFurnitureMakeReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = TakeFurnitureMakeReqOuterClass.TakeFurnitureMakeReq.parseFrom(payload);

		session.getPlayer().getFurnitureManager().take(req.getIndex(), req.getMakeId(), req.getIsFastFinish());
	}

}
