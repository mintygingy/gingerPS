package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify;
import emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData;

public class PacketCookRecipeDataNotify extends BasePacket {
    public PacketCookRecipeDataNotify(CookRecipeData recipe) {
        super(PacketOpcodes.CookRecipeDataNotify);

        CookRecipeDataNotify proto = CookRecipeDataNotify.newBuilder()
                .setRecipeData(recipe)
                .build();
        
        this.setData(proto);
    }

    public PacketCookRecipeDataNotify(int recipeId) {
        super(PacketOpcodes.CookRecipeDataNotify);

        CookRecipeDataNotify proto = CookRecipeDataNotify.newBuilder()
                .setRecipeData(CookRecipeData.newBuilder().setRecipeId(recipeId))
                .build();
        
        this.setData(proto);
    }
}
