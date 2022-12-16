package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerCookReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.PlayerCookReq)
public class HandlerPlayerCookReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PlayerCookReqOuterClass.PlayerCookReq req = PlayerCookReqOuterClass.PlayerCookReq.parseFrom(payload);
        session.getPlayer().getCookingManager().handlePlayerCookReq(req);
    }
}
