package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChooseModuleReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketHomeChooseModuleRsp;
import emu.gingerps.server.packet.send.PacketHomeComfortInfoNotify;
import emu.gingerps.server.packet.send.PacketPlayerHomeCompInfoNotify;


@Opcodes(PacketOpcodes.HomeChooseModuleReq)
public class HandlerHomeChooseModuleReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        HomeChooseModuleReqOuterClass.HomeChooseModuleReq req =
                HomeChooseModuleReqOuterClass.HomeChooseModuleReq.parseFrom(payload);
        session.getPlayer().addRealmList(req.getModuleId());
        session.getPlayer().setCurrentRealmId(req.getModuleId());
        session.send(new PacketHomeChooseModuleRsp(req.getModuleId()));
        session.send(new PacketPlayerHomeCompInfoNotify(session.getPlayer()));
        session.send(new PacketHomeComfortInfoNotify(session.getPlayer()));
    }
}
