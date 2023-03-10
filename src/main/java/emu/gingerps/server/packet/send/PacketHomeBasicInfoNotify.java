package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeBasicInfoNotifyOuterClass;
import emu.gingerps.net.proto.HomeBasicInfoOuterClass;
import emu.gingerps.net.proto.HomeLimitedShopInfoOuterClass;
import emu.gingerps.net.proto.VectorOuterClass;

public class PacketHomeBasicInfoNotify extends BasePacket {

    public PacketHomeBasicInfoNotify(Player player, boolean editMode) {
        super(PacketOpcodes.HomeBasicInfoNotify);

        if (player.getCurrentRealmId() <= 0) {
            return;
        }

        var proto = HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.newBuilder();

        var sceneId = player.getCurrentRealmId() + 2000;
        var homeScene = player.getHome().getHomeSceneItem(sceneId);

        proto.setBasicInfo(HomeBasicInfoOuterClass.HomeBasicInfo.newBuilder()
                .setCurModuleId(player.getCurrentRealmId())
                .setCurRoomSceneId(homeScene.getRoomSceneId())
                .setIsInEditMode(editMode)
                .setHomeOwnerUid(player.getUid())
                .setLevel(player.getHome().getLevel())
                .setOwnerNickName(player.getNickname())
                // TODO limit shop
                .build());

        this.setData(proto);
    }
}
