package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetUpLunchBoxWidgetReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetUpLunchBoxWidgetRsp;

@Opcodes(PacketOpcodes.SetUpLunchBoxWidgetReq)
public class HandlerSetUpLunchBoxWidgetReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req
                = SetUpLunchBoxWidgetReqOuterClass.SetUpLunchBoxWidgetReq.parseFrom(payload);

        session.send(new PacketSetUpLunchBoxWidgetRsp(req.getLunchBoxData()));
    }
}
