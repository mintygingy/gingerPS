package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeBattlePassRewardReqOuterClass.TakeBattlePassRewardReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketTakeBattlePassRewardRsp;

@Opcodes(PacketOpcodes.TakeBattlePassRewardReq)
public class HandlerTakeBattlePassRewardReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = TakeBattlePassRewardReq.parseFrom(payload);

        session.getPlayer().getBattlePassManager().takeReward(req.getTakeOptionListList());
    }
}
