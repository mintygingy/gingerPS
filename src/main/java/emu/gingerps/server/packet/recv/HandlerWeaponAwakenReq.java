package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.WeaponAwakenReq)
public class HandlerWeaponAwakenReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        WeaponAwakenReq req = WeaponAwakenReq.parseFrom(payload);

        // Weapon refinement
        session.getServer().getInventorySystem().refineWeapon(session.getPlayer(), req.getTargetWeaponGuid(), req.getItemGuid());
    }

}
