package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ReliquaryDecomposeReqOuterClass.ReliquaryDecomposeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ReliquaryDecomposeReq)
public class HandlerReliquaryDecomposeReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ReliquaryDecomposeReq req = ReliquaryDecomposeReq.parseFrom(payload);
        session.getServer().getCombineSystem().decomposeReliquaries(session.getPlayer(), req.getConfigId(), req.getTargetCount(), req.getGuidListList());
    }
}
