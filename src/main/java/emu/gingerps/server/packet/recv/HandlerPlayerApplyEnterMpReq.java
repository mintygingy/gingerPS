package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerApplyEnterMpReqOuterClass.PlayerApplyEnterMpReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlayerApplyEnterMpRsp;

@Opcodes(PacketOpcodes.PlayerApplyEnterMpReq)
public class HandlerPlayerApplyEnterMpReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PlayerApplyEnterMpReq req = PlayerApplyEnterMpReq.parseFrom(payload);

        session.getServer().getMultiplayerSystem().applyEnterMp(session.getPlayer(), req.getTargetUid());
        session.send(new PacketPlayerApplyEnterMpRsp(req.getTargetUid()));
    }

}
