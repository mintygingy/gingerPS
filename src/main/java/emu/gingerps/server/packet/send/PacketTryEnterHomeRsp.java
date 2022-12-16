package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.net.proto.TryEnterHomeRspOuterClass;

public class PacketTryEnterHomeRsp extends BasePacket {

    public PacketTryEnterHomeRsp() {
        super(PacketOpcodes.TryEnterHomeRsp);

        TryEnterHomeRspOuterClass.TryEnterHomeRsp proto = TryEnterHomeRspOuterClass.TryEnterHomeRsp.newBuilder()
                .setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
                .build();

        this.setData(proto);
    }

    public PacketTryEnterHomeRsp(int uid) {
        super(PacketOpcodes.TryEnterHomeRsp);

        TryEnterHomeRspOuterClass.TryEnterHomeRsp proto = TryEnterHomeRspOuterClass.TryEnterHomeRsp.newBuilder()
                .setRetcode(0)
                .setTargetUid(uid)
                .build();

        this.setData(proto);
    }

    public PacketTryEnterHomeRsp(int retCode, int uid) {
        super(PacketOpcodes.TryEnterHomeRsp);

        TryEnterHomeRspOuterClass.TryEnterHomeRsp proto = TryEnterHomeRspOuterClass.TryEnterHomeRsp.newBuilder()
            .setRetcode(retCode)
            .setTargetUid(uid)
            .build();

        this.setData(proto);
    }
}
