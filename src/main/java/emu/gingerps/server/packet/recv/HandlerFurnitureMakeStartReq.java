package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FurnitureMakeStartReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.FurnitureMakeStartReq)
public class HandlerFurnitureMakeStartReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = FurnitureMakeStartReqOuterClass.FurnitureMakeStartReq.parseFrom(payload);

		session.getPlayer().getFurnitureManager().startMake(req.getMakeId(), req.getAvatarId());

	}

}
