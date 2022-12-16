package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FireworksReformDataNotifyOuterClass;
import emu.gingerps.net.proto.FireworksReformDataOuterClass;

public class PacketFireworksReformDataNotify extends BasePacket {

    public PacketFireworksReformDataNotify(FireworksReformDataOuterClass.FireworksReformData fireworksReformData) {
        super(PacketOpcodes.FireworksReformDataNotify);

        var proto
            = FireworksReformDataNotifyOuterClass.FireworksReformDataNotify.newBuilder();

        proto.addFireworksReformDataList(fireworksReformData);

        setData(proto.build());
    }

}
