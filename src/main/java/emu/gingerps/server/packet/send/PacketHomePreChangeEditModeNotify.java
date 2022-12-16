package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomePreChangeEditModeNotifyOuterClass;

public class PacketHomePreChangeEditModeNotify extends BasePacket {

    public PacketHomePreChangeEditModeNotify(boolean isEnterEditMode) {
        super(PacketOpcodes.HomePreChangeEditModeNotify);

        var proto = HomePreChangeEditModeNotifyOuterClass.HomePreChangeEditModeNotify.newBuilder();

        proto.setIsEnterEditMode(isEnterEditMode);

        this.setData(proto);
    }
}
