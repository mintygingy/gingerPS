package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetActivityShopSheetInfoReqOuterClass.GetActivityShopSheetInfoReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetActivityShopSheetInfoRsp;

@Opcodes(PacketOpcodes.GetActivityShopSheetInfoReq)
public class HandlerGetActivityShopSheetInfoReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetActivityShopSheetInfoReq req = GetActivityShopSheetInfoReq.parseFrom(payload);
        session.getPlayer().sendPacket(new PacketGetActivityShopSheetInfoRsp(req.getShopType()));
    }

}
