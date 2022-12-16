package emu.gingerps.server.packet.send;

import static emu.gingerps.config.Configuration.*;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ItemOuterClass.Item;
import emu.gingerps.net.proto.PlayerStoreNotifyOuterClass.PlayerStoreNotify;
import emu.gingerps.net.proto.StoreTypeOuterClass.StoreType;

public class PacketPlayerStoreNotify extends BasePacket {

    public PacketPlayerStoreNotify(Player player) {
        super(PacketOpcodes.PlayerStoreNotify);

        this.buildHeader(2);

        PlayerStoreNotify.Builder p = PlayerStoreNotify.newBuilder()
                .setStoreType(StoreType.STORE_TYPE_PACK)
                .setWeightLimit(GAME_OPTIONS.inventoryLimits.all);

        for (GameItem item : player.getInventory()) {
            Item itemProto = item.toProto();
            p.addItemList(itemProto);
        }

        this.setData(p.build());
    }
}
