package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.LaunchFireworksReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketFireworksLaunchDataNotify;
import emu.gingerps.server.packet.send.PacketLaunchFireworksRsp;

@Opcodes(PacketOpcodes.LaunchFireworksReq)
public class HandlerLaunchFireworksReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        var req
                = LaunchFireworksReqOuterClass.LaunchFireworksReq.parseFrom(payload);


        session.send(new PacketFireworksLaunchDataNotify(req.getSchemeData()));
        session.send(new PacketLaunchFireworksRsp());
    }
}
