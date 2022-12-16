package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ForgeStartRspOuterClass.ForgeStartRsp;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;

public class PacketForgeStartRsp extends BasePacket {

    public PacketForgeStartRsp(Retcode retcode) {
        super(PacketOpcodes.ForgeStartRsp);

        ForgeStartRsp proto = ForgeStartRsp.newBuilder()
                .setRetcode(retcode.getNumber())
                .build();

        this.setData(proto);
    }
}
