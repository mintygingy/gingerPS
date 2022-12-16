package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChangeBgmRspOuterClass;

public class PacketHomeChangeBgmRsp extends BasePacket {
    public PacketHomeChangeBgmRsp() {
        super(PacketOpcodes.HomeChangeBgmRsp);

        var rsp = HomeChangeBgmRspOuterClass.HomeChangeBgmRsp.newBuilder()
            .setRetcode(0)
            .build();

        this.setData(rsp);
    }
}
