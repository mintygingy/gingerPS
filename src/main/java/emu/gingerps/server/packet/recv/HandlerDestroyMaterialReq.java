package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DestroyMaterialReqOuterClass.DestroyMaterialReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.DestroyMaterialReq)
public class HandlerDestroyMaterialReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DestroyMaterialReq req = DestroyMaterialReq.parseFrom(payload);

        // Delete items
        session.getServer().getInventorySystem().destroyMaterial(session.getPlayer(), req.getMaterialListList());
    }
}
