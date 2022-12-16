package emu.gingerps.server.packet.send;

import static emu.gingerps.config.Configuration.*;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.StoreTypeOuterClass.StoreType;
import emu.gingerps.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify;

public class PacketStoreWeightLimitNotify extends BasePacket {

    public PacketStoreWeightLimitNotify() {
        super(PacketOpcodes.StoreWeightLimitNotify);

        StoreWeightLimitNotify p = StoreWeightLimitNotify.newBuilder()
                .setStoreType(StoreType.STORE_TYPE_PACK)
                .setWeightLimit(INVENTORY_LIMITS.all)
                .setWeaponCountLimit(INVENTORY_LIMITS.weapons)
                .setReliquaryCountLimit(INVENTORY_LIMITS.relics)
                .setMaterialCountLimit(INVENTORY_LIMITS.materials)
                .setFurnitureCountLimit(INVENTORY_LIMITS.furniture)
                .build();

        this.setData(p);
    }
}
