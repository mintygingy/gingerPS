package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.BlossomBriefInfoNotifyOuterClass;
import emu.gingerps.net.proto.BlossomBriefInfoOuterClass;

public class PacketBlossomBriefInfoNotify extends BasePacket {
    public PacketBlossomBriefInfoNotify(Iterable<BlossomBriefInfoOuterClass.BlossomBriefInfo> blossoms) {
        super(PacketOpcodes.BlossomBriefInfoNotify);
        this.setData(BlossomBriefInfoNotifyOuterClass.BlossomBriefInfoNotify.newBuilder().addAllBriefInfoList(blossoms));
    }
}
