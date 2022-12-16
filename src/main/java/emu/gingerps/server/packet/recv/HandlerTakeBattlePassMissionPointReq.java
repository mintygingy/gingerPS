package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeBattlePassMissionPointReqOuterClass.TakeBattlePassMissionPointReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketTakeBattlePassMissionPointRsp;

@Opcodes(PacketOpcodes.TakeBattlePassMissionPointReq)
public class HandlerTakeBattlePassMissionPointReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = TakeBattlePassMissionPointReq.parseFrom(payload);

        session.getPlayer().getBattlePassManager().takeMissionPoint(req.getMissionIdListList());

        session.send(new PacketTakeBattlePassMissionPointRsp());
    }
}
