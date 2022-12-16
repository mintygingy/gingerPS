package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneKickPlayerReqOuterClass.SceneKickPlayerReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSceneKickPlayerRsp;

@Opcodes(PacketOpcodes.SceneKickPlayerReq)
public class HandlerSceneKickPlayerReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SceneKickPlayerReq req = SceneKickPlayerReq.parseFrom(payload);

        if (session.getServer().getMultiplayerSystem().kickPlayer(session.getPlayer(), req.getTargetUid())) {
            // Success
            session.send(new PacketSceneKickPlayerRsp(req.getTargetUid()));
        } else {
            // Fail
            session.send(new PacketSceneKickPlayerRsp());
        }
    }

}
