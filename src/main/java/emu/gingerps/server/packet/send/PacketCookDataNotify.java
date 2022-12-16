package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify;
import emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData;

public class PacketCookDataNotify extends BasePacket {

    public PacketCookDataNotify(List<CookRecipeData> recipes) {
        super(PacketOpcodes.CookDataNotify);

        CookDataNotify proto = CookDataNotify.newBuilder()
                .addAllRecipeDataList(recipes)
                .build();

        this.setData(proto);
    }
}
