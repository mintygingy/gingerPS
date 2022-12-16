package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.GetAllMailReqOuterClass;
import emu.gingerps.net.proto.GetPlayerTokenReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetAllMailRsp;
import emu.gingerps.server.packet.send.PacketGetGachaInfoRsp;

@Opcodes(PacketOpcodes.GetAllMailReq)
public class HandlerGetAllMailReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetAllMailReqOuterClass.GetAllMailReq req = GetAllMailReqOuterClass.GetAllMailReq.parseFrom(payload);
        session.send(new PacketGetAllMailRsp(session.getPlayer(), req.getIsCollected()));
    }
}
