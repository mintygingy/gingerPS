package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeAllUnlockedBgmIdListNotifyOuterClass;

public class PacketHomeAllUnlockedBgmIdListNotify extends BasePacket {
    public PacketHomeAllUnlockedBgmIdListNotify(Player player) {
        super(PacketOpcodes.HomeAllUnlockedBgmIdListNotify);

        if (player.getRealmList() == null) {
            return;
        }

        var unlocked = player.getHome().getUnlockedHomeBgmList();

        var notify = HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.newBuilder()
            .addAllAllUnlockedBgmIdList(unlocked)
            .build();

        this.setData(notify);
    }
}
