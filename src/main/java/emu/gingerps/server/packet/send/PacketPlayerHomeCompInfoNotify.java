package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerHomeCompInfoNotifyOuterClass;
import emu.gingerps.net.proto.PlayerHomeCompInfoOuterClass;

import java.util.List;

public class PacketPlayerHomeCompInfoNotify extends BasePacket {

    public PacketPlayerHomeCompInfoNotify(Player player) {
        super(PacketOpcodes.PlayerHomeCompInfoNotify);

        if (player.getRealmList() == null) {
            // Do not send
            return;
        }

        PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify proto = PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.newBuilder()
                .setCompInfo(
                        PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.newBuilder()
                                .addAllUnlockedModuleIdList(player.getRealmList())
                                .addAllLevelupRewardGotLevelList(List.of(1)) // Hardcoded
                                .setFriendEnterHomeOptionValue(player.getHome().getEnterHomeOption())
                                .build()
                )
                .build();

        this.setData(proto);
    }
}
