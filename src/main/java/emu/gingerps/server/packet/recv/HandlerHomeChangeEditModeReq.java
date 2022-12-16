package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChangeEditModeReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.*;

@Opcodes(PacketOpcodes.HomeChangeEditModeReq)
public class HandlerHomeChangeEditModeReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = HomeChangeEditModeReqOuterClass.HomeChangeEditModeReq.parseFrom(payload);

		session.send(new PacketHomePreChangeEditModeNotify(req.getIsEnterEditMode()));
		session.send(new PacketHomeBasicInfoNotify(session.getPlayer(), req.getIsEnterEditMode()));
		session.send(new PacketHomeComfortInfoNotify(session.getPlayer()));

		session.send(new PacketHomeChangeEditModeRsp(req.getIsEnterEditMode()));
	}

}
