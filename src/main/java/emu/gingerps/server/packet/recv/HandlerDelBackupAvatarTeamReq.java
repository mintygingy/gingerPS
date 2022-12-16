package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DelBackupAvatarTeamReqOuterClass.DelBackupAvatarTeamReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.DelBackupAvatarTeamReq)
public class HandlerDelBackupAvatarTeamReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DelBackupAvatarTeamReq req = DelBackupAvatarTeamReq.parseFrom(payload);
        session.getPlayer().getTeamManager().removeCustomTeam(req.getBackupAvatarTeamId());
    }
}
