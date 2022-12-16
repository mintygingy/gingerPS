package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WeaponPromoteReqOuterClass.WeaponPromoteReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.WeaponPromoteReq)
public class HandlerWeaponPromoteReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        WeaponPromoteReq req = WeaponPromoteReq.parseFrom(payload);

        // Ascend weapon
        session.getServer().getInventorySystem().promoteWeapon(session.getPlayer(), req.getTargetWeaponGuid());
    }

}
