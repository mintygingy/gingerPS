package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetMailItemReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetMailItemRsp;

@Opcodes(PacketOpcodes.GetMailItemReq)
public class HandlerGetMailItemReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetMailItemReqOuterClass.GetMailItemReq req = GetMailItemReqOuterClass.GetMailItemReq.parseFrom(payload);
        session.send(new PacketGetMailItemRsp(session.getPlayer(), req.getMailIdListList()));
    }

}
