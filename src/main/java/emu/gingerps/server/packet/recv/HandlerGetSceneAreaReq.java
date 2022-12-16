package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetSceneAreaReqOuterClass.GetSceneAreaReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetSceneAreaRsp;

@Opcodes(PacketOpcodes.GetSceneAreaReq)
public class HandlerGetSceneAreaReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GetSceneAreaReq req = GetSceneAreaReq.parseFrom(payload);

        session.send(new PacketGetSceneAreaRsp(session.getPlayer(), req.getSceneId()));
    }

}
