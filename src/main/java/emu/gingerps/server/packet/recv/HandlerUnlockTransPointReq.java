package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.net.proto.UnlockTransPointReqOuterClass.UnlockTransPointReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketUnlockTransPointRsp;

@Opcodes(PacketOpcodes.UnlockTransPointReq)
public class HandlerUnlockTransPointReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        UnlockTransPointReq req = UnlockTransPointReq.parseFrom(payload);
        boolean unlocked = session.getPlayer().getProgressManager().unlockTransPoint(req.getSceneId(), req.getPointId(), false);
        session.getPlayer().sendPacket(new PacketUnlockTransPointRsp(unlocked ? RetcodeOuterClass.Retcode.RET_SUCC : RetcodeOuterClass.Retcode.RET_FAIL));
    }
}
