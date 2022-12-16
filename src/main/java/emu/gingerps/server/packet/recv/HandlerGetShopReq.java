package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetShopReqOuterClass.GetShopReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetShopRsp;

@Opcodes(PacketOpcodes.GetShopReq)
public class HandlerGetShopReq extends PacketHandler {
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GetShopReq req = GetShopReq.parseFrom(payload);

		session.send(new PacketGetShopRsp(session.getPlayer(), req.getShopType()));
	}
}
