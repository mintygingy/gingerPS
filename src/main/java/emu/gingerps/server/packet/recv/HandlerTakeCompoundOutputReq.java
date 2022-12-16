package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeCompoundOutputReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.TakeCompoundOutputReq)
public class HandlerTakeCompoundOutputReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.parseFrom(payload);
        session.getPlayer().getCookingCompoundManager().handleTakeCompoundOutputReq(req);
    }
}
