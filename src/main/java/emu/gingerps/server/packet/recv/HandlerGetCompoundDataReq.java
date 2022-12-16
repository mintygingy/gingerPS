package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetCompoundDataReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.GetCompoundDataReq)
public class HandlerGetCompoundDataReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = GetCompoundDataReqOuterClass.GetCompoundDataReq.parseFrom(payload);
        session.getPlayer().getCookingCompoundManager().handleGetCompoundDataReq(req);
    }
}
