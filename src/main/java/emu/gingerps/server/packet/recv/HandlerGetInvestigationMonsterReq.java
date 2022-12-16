package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetInvestigationMonsterReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetInvestigationMonsterRsp;

@Opcodes(PacketOpcodes.GetInvestigationMonsterReq)
public class HandlerGetInvestigationMonsterReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = GetInvestigationMonsterReqOuterClass.GetInvestigationMonsterReq.parseFrom(payload);

        session.send(new PacketGetInvestigationMonsterRsp(
                session.getPlayer(),
                session.getServer().getWorldDataSystem(),
                req.getCityIdListList()));

    }

}
