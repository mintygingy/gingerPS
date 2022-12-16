package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerCompoundMaterialReqOuterClass;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.PlayerCompoundMaterialReq)
public class HandlerPlayerCompoundMaterialReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.parseFrom(payload);
        session.getPlayer().getCookingCompoundManager().handlePlayerCompoundMaterialReq(req);
    }

}
