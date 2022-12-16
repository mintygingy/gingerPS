package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ReformFireworksReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketFireworksReformDataNotify;
import emu.gingerps.server.packet.send.PacketReformFireworksRsp;

@Opcodes(PacketOpcodes.ReformFireworksReq)
public class HandlerReformFireworksReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        var req
                = ReformFireworksReqOuterClass.ReformFireworksReq.parseFrom(payload);
        session.send(new PacketFireworksReformDataNotify(req.getFireworksReformData()));
        session.send(new PacketReformFireworksRsp());
    }
}
