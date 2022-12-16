package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlayerGetForceQuitBanInfoRsp;

@Opcodes(PacketOpcodes.PlayerGetForceQuitBanInfoReq)
public class HandlerPlayerGetForceQuitBanInfoReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        if (session.getServer().getMultiplayerSystem().leaveCoop(session.getPlayer())) {
            // Success
            session.send(new PacketPlayerGetForceQuitBanInfoRsp(RetcodeOuterClass.Retcode.RET_SUCC_VALUE));
        } else {
            // Fail
            session.send(new PacketPlayerGetForceQuitBanInfoRsp(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE));
        }
    }

}
