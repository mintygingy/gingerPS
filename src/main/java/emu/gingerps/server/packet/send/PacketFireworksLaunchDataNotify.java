package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FireworksLaunchDataNotifyOuterClass;
import emu.gingerps.net.proto.FireworksLaunchSchemeDataOuterClass;

public class PacketFireworksLaunchDataNotify extends BasePacket {

    public PacketFireworksLaunchDataNotify(FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData notify) {
        super(PacketOpcodes.FireworksLaunchDataNotify);

        var proto
                = FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify.newBuilder();

        proto.setLastUseSchemeId(1).addSchemeDataList(notify);

        setData(proto.build());
    }

}
