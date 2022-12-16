package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeNewUnlockedBgmIdListNotifyOuterClass;

public class PacketHomeNewUnlockedBgmIdListNotify extends BasePacket {
    public PacketHomeNewUnlockedBgmIdListNotify(int homeBgmId) {
        super(PacketOpcodes.HomeNewUnlockedBgmIdListNotify);

        var notify = HomeNewUnlockedBgmIdListNotifyOuterClass.HomeNewUnlockedBgmIdListNotify.newBuilder()
            .addNewUnlockedBgmIdList(homeBgmId)
            .build();

        this.setData(notify);
    }
}
