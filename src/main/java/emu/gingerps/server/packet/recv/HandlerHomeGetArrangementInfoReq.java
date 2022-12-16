package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeGetArrangementInfoReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketHomeGetArrangementInfoRsp;

@Opcodes(PacketOpcodes.HomeGetArrangementInfoReq)
public class HandlerHomeGetArrangementInfoReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.parseFrom(payload);

		session.send(new PacketHomeGetArrangementInfoRsp(session.getPlayer(), req.getSceneIdListList()));
	}

}
