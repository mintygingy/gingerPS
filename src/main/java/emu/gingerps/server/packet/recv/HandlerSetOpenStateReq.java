package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetOpenStateReqOuterClass.SetOpenStateReq;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.SetOpenStateReq)
public class HandlerSetOpenStateReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = SetOpenStateReq.parseFrom(payload);
        int openState = req.getKey();
        int value = req.getValue();

        session.getPlayer().getProgressManager().setOpenStateFromClient(openState, value);
    }
}
