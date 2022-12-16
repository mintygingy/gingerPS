package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.AvatarSkillUpgradeReq)
public class HandlerAvatarSkillUpgradeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarSkillUpgradeReq req = AvatarSkillUpgradeReq.parseFrom(payload);

        // Sanity checks
        var avatar = session.getPlayer().getAvatars().getAvatarByGuid(req.getAvatarGuid());
        if (avatar == null) return;
        // Level up avatar talent
        avatar.upgradeSkill(req.getAvatarSkillId());
    }
}
