package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;
import emu.gingerps.net.proto.AddBackupAvatarTeamRspOuterClass.AddBackupAvatarTeamRsp;

public class PacketAddBackupAvatarTeamRsp extends BasePacket {
    public PacketAddBackupAvatarTeamRsp(Retcode retcode) {
        super(PacketOpcodes.AddBackupAvatarTeamRsp);

        AddBackupAvatarTeamRsp proto = AddBackupAvatarTeamRsp.newBuilder()
            .setRetcode(retcode.getNumber())
            .build();

        this.setData(proto);
    }

    public PacketAddBackupAvatarTeamRsp() {
        this(Retcode.RET_SUCC);
    }
}
