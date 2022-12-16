package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerApplyEnterMpResultReqOuterClass.PlayerApplyEnterMpResultReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlayerApplyEnterMpResultRsp;

@Opcodes(PacketOpcodes.PlayerApplyEnterMpResultReq)
public class HandlerPlayerApplyEnterMpResultReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PlayerApplyEnterMpResultReq req = PlayerApplyEnterMpResultReq.parseFrom(payload);

        session.getServer().getMultiplayerSystem().applyEnterMpReply(session.getPlayer(), req.getApplyUid(), req.getIsAgreed());
        session.send(new PacketPlayerApplyEnterMpResultRsp(req.getApplyUid(), req.getIsAgreed()));
    }

}
