package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.QueryPathReqOuterClass;
import emu.gingerps.net.proto.QueryPathReqOuterClass.QueryPathReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketQueryPathRsp;

@Opcodes(PacketOpcodes.QueryPathReq)
public class HandlerQueryPathReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = QueryPathReq.parseFrom(payload);

        /**
         * It is not the actual work
         */

        if (req.getDestinationPosList().size() > 0) {
            session.send(new PacketQueryPathRsp(req));
        }
    }

}
