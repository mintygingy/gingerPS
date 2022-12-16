package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;
import emu.gingerps.net.proto.UnlockTransPointRspOuterClass.UnlockTransPointRsp;

public class PacketUnlockTransPointRsp extends BasePacket {
    public PacketUnlockTransPointRsp(Retcode retcode) {
        super(PacketOpcodes.UnlockTransPointRsp);

        UnlockTransPointRsp proto = UnlockTransPointRsp.newBuilder()
                .setRetcode(retcode.getNumber())
                .build();

        this.setData(proto);
    }
}
