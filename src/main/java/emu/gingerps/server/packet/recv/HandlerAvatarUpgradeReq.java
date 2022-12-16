package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarUpgradeReqOuterClass.AvatarUpgradeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.AvatarUpgradeReq)
public class HandlerAvatarUpgradeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarUpgradeReq req = AvatarUpgradeReq.parseFrom(payload);

        // Level up avatar
        session.getServer().getInventorySystem().upgradeAvatar(
                session.getPlayer(),
                req.getAvatarGuid(),
                req.getItemId(),
                req.getCount()
        );
    }

}
