package emu.gingerps.server.packet.send;

import emu.gingerps.game.home.HomeBlockItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeComfortInfoNotifyOuterClass;
import emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass;

import java.util.ArrayList;
import java.util.List;

public class PacketHomeComfortInfoNotify extends BasePacket {

    public PacketHomeComfortInfoNotify(Player player) {
        super(PacketOpcodes.HomeComfortInfoNotify);

        if (player.getRealmList() == null) {
            // Do not send
            return;
        }

        List<HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo> comfortInfoList = new ArrayList<>();

        for (int moduleId : player.getRealmList()) {
            var homeScene = player.getHome().getHomeSceneItem(moduleId + 2000);
            var blockComfortList = homeScene.getBlockItems().values().stream()
                    .map(HomeBlockItem::calComfort)
                    .toList();
            var homeRoomScene = player.getHome().getHomeSceneItem(homeScene.getRoomSceneId());

            comfortInfoList.add(
                    HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.newBuilder()
                        .setModuleId(moduleId)
                            .setRoomSceneComfortValue(homeRoomScene.calComfort())
                            .addAllWorldSceneBlockComfortValueList(blockComfortList)
                        .build()
            );
        }

        HomeComfortInfoNotifyOuterClass.HomeComfortInfoNotify proto = HomeComfortInfoNotifyOuterClass.HomeComfortInfoNotify
                .newBuilder()
                .addAllModuleInfoList(comfortInfoList)
                .build();


        this.setData(proto);
    }
}
