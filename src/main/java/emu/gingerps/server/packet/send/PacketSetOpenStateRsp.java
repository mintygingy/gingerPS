package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;
import emu.gingerps.net.proto.SetOpenStateRspOuterClass.SetOpenStateRsp;

public class PacketSetOpenStateRsp extends BasePacket {
    public PacketSetOpenStateRsp(int openState, int value) {
        super(PacketOpcodes.SetOpenStateRsp);

        SetOpenStateRsp proto = SetOpenStateRsp.newBuilder()
            .setKey(openState).setValue(value).build();

        this.setData(proto);
    }

    public PacketSetOpenStateRsp(Retcode retcode) {
        super(PacketOpcodes.SetOpenStateRsp);

        SetOpenStateRsp proto = SetOpenStateRsp.newBuilder()
            .setRetcode(retcode.getNumber()).build();

        this.setData(proto);
    }
}
