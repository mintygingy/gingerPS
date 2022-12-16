package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerCookArgsReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.PlayerCookArgsReq)
public class HandlerPlayerCookArgsReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PlayerCookArgsReqOuterClass.PlayerCookArgsReq req = PlayerCookArgsReqOuterClass.PlayerCookArgsReq.parseFrom(payload);
        session.getPlayer().getCookingManager().handleCookArgsReq(req);
    }
}
