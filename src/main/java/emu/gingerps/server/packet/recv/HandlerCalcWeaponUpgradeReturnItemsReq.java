package emu.gingerps.server.packet.recv;

import java.util.List;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CalcWeaponUpgradeReturnItemsReqOuterClass.CalcWeaponUpgradeReturnItemsReq;
import emu.gingerps.net.proto.ItemParamOuterClass.ItemParam;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketCalcWeaponUpgradeReturnItemsRsp;

@Opcodes(PacketOpcodes.CalcWeaponUpgradeReturnItemsReq)
public class HandlerCalcWeaponUpgradeReturnItemsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        CalcWeaponUpgradeReturnItemsReq req = CalcWeaponUpgradeReturnItemsReq.parseFrom(payload);

        List<ItemParam> returnOres = session.getServer().getInventorySystem().calcWeaponUpgradeReturnItems(
                session.getPlayer(),
                req.getTargetWeaponGuid(),
                req.getFoodWeaponGuidListList(),
                req.getItemParamListList()
        );

        if (returnOres != null) {
            session.send(new PacketCalcWeaponUpgradeReturnItemsRsp(req.getTargetWeaponGuid(), returnOres));
        } else {
            session.send(new PacketCalcWeaponUpgradeReturnItemsRsp());
        }
    }

}
