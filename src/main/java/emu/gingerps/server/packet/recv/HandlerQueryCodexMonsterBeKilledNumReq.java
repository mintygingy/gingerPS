package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass;
import emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketQueryCodexMonsterBeKilledNumRsp;

@Opcodes(PacketOpcodes.QueryCodexMonsterBeKilledNumReq)
public class HandlerQueryCodexMonsterBeKilledNumReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        QueryCodexMonsterBeKilledNumReq req = QueryCodexMonsterBeKilledNumReq.parseFrom(payload);
        session.send(new PacketQueryCodexMonsterBeKilledNumRsp(session.getPlayer(), req.getCodexIdListList()));
    }

}
