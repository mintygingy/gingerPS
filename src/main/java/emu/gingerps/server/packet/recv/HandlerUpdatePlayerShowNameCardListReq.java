package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UpdatePlayerShowNameCardListReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketUpdatePlayerShowNameCardListRsp;

@Opcodes(PacketOpcodes.UpdatePlayerShowNameCardListReq)
public class HandlerUpdatePlayerShowNameCardListReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.parseFrom(payload);

        session.getPlayer().setShowNameCardList(req.getShowNameCardIdListList());

        session.send(new PacketUpdatePlayerShowNameCardListRsp(req.getShowNameCardIdListList()));
    }
}
