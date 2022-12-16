package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.SetEquipLockStateReq)
public class HandlerSetEquipLockStateReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SetEquipLockStateReq req = SetEquipLockStateReq.parseFrom(payload);

        session.getServer().getInventorySystem().lockEquip(session.getPlayer(), req.getTargetEquipGuid(), req.getIsLocked());
    }

}
