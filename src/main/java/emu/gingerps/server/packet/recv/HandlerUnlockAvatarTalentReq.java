package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.UnlockAvatarTalentReq)
public class HandlerUnlockAvatarTalentReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        UnlockAvatarTalentReq req = UnlockAvatarTalentReq.parseFrom(payload);

        // Unlock avatar const
        var avatar = session.getPlayer().getAvatars().getAvatarByGuid(req.getAvatarGuid());
        if (avatar == null) return;
        avatar.unlockConstellation(req.getTalentId());
    }

}
