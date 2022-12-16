package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetBattlePassViewedReqOuterClass.SetBattlePassViewedReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetBattlePassViewedRsp;

@Opcodes(PacketOpcodes.SetBattlePassViewedReq)
public class HandlerSetBattlePassViewedReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = SetBattlePassViewedReq.parseFrom(payload);

        session.getPlayer().getBattlePassManager().updateViewed();
        session.send(new PacketSetBattlePassViewedRsp(req.getScheduleId()));
    }
}
