package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ReformFireworksRspOuterClass;

public class PacketReformFireworksRsp extends BasePacket {
    public PacketReformFireworksRsp() {
        super(PacketOpcodes.ReformFireworksRsp);
        var proto = ReformFireworksRspOuterClass.ReformFireworksRsp.newBuilder()
            .build();
        this.setData(proto);
    }
}
