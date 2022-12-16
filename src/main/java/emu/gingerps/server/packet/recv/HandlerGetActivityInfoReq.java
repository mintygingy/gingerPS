package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.GetActivityInfoReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetActivityInfoRsp;

import java.util.HashSet;

@Opcodes(PacketOpcodes.GetActivityInfoReq)
public class HandlerGetActivityInfoReq extends PacketHandler {
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = GetActivityInfoReqOuterClass.GetActivityInfoReq.parseFrom(payload);

		session.send(new PacketGetActivityInfoRsp(
            new HashSet<>(req.getActivityIdListList()),
            session.getPlayer().getActivityManager()));
	}
}
