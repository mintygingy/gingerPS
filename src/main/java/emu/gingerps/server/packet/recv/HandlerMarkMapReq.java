package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.MarkMapReqOuterClass.MarkMapReq;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.MarkMapReq)
public class HandlerMarkMapReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		MarkMapReq req = MarkMapReq.parseFrom(payload);
		session.getPlayer().getMapMarksManager().handleMapMarkReq(req);
	}
}
