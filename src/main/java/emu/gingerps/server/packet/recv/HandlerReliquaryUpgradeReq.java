package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ReliquaryUpgradeReqOuterClass.ReliquaryUpgradeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ReliquaryUpgradeReq)
public class HandlerReliquaryUpgradeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ReliquaryUpgradeReq req = ReliquaryUpgradeReq.parseFrom(payload);

        session.getServer().getInventorySystem().upgradeRelic(session.getPlayer(), req.getTargetReliquaryGuid(), req.getFoodReliquaryGuidListList(), req.getItemParamListList());
    }

}
