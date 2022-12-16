package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChangeBgmNotifyOuterClass;

public class PacketHomeChangeBgmNotify extends BasePacket {
    public PacketHomeChangeBgmNotify(int homeBgmId) {
        super(PacketOpcodes.HomeChangeBgmNotify);

        var notify = HomeChangeBgmNotifyOuterClass.HomeChangeBgmNotify.newBuilder()
            .setBgmId(homeBgmId)
            .build();

        this.setData(notify);
    }
}
