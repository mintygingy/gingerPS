package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.inventory.Inventory;
import emu.gingerps.game.inventory.InventoryTab;
import emu.gingerps.game.inventory.ItemType;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.QuickUseWidgetRspOuterClass.QuickUseWidgetRsp;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPullRecentChatRsp;

@Opcodes(PacketOpcodes.QuickUseWidgetReq)
public class HandlerQuickUseWidgetReq extends PacketHandler {
    /*
    * WARNING: with the consuming of material widget ( Example: bomb ),
    * this is just a implement designed to the decreasing of count
    *
    * ### Known Bug: No effects after using item but decrease. ###
    *
    * If you know which Packet could make the effects, feel free to contribute!
    * */
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        QuickUseWidgetRsp.Builder proto = QuickUseWidgetRsp.newBuilder();
        Player pl = session.getPlayer();
        synchronized (pl) {
            int materialId = pl.getWidgetId();
            Inventory inventory = session.getPlayer().getInventory();
            InventoryTab inventoryTab = inventory.getInventoryTab(ItemType.ITEM_MATERIAL);
            GameItem item = inventoryTab.getItemById(materialId);
            int remain = item.getCount();
            if (remain > 0) {
                remain--;
                if (remain <= 0) {
                    proto.setRetcode(1);
                } else {
                    proto.setRetcode(0);
                }
                proto.setMaterialId(materialId);
                inventory.removeItem(item,1);// decrease count
                BasePacket rsp = new BasePacket(PacketOpcodes.QuickUseWidgetRsp);
                rsp.setData(proto);
                session.send(rsp);
                gingerps.getLogger().warn("class has no effects in the game, feel free to implement it");
                // but no effects in the game, feel free to implement it!
            }
        }
    }
}
