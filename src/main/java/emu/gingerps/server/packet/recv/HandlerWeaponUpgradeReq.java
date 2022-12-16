package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WeaponUpgradeReqOuterClass.WeaponUpgradeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.WeaponUpgradeReq)
public class HandlerWeaponUpgradeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        WeaponUpgradeReq req = WeaponUpgradeReq.parseFrom(payload);

        // Level up weapon
        session.getServer().getInventorySystem().upgradeWeapon(
                session.getPlayer(),
                req.getTargetWeaponGuid(),
                req.getFoodWeaponGuidListList(),
                req.getItemParamListList()
        );
    }

}
