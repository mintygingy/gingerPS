package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketHomeEnterEditModeFinishRsp;

@Opcodes(PacketOpcodes.HomeEnterEditModeFinishReq)
public class HandlerHomeEnterEditModeFinishReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        /*
         * This packet is about the edit mode
         */
        session.send(new PacketHomeEnterEditModeFinishRsp());
    }

}
