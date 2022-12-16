package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DoGachaReqOuterClass.DoGachaReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.DoGachaReq)
public class HandlerDoGachaReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DoGachaReq req = DoGachaReq.parseFrom(payload);

        session.getServer().getGachaSystem().doPulls(session.getPlayer(), req.getGachaScheduleId(), req.getGachaTimes());
    }
}
