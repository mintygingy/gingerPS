package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;
import emu.gingerps.net.proto.DelBackupAvatarTeamRspOuterClass.DelBackupAvatarTeamRsp;

public class PacketDelBackupAvatarTeamRsp extends BasePacket {
    public PacketDelBackupAvatarTeamRsp(Retcode retcode, int id) {
          super(PacketOpcodes.DelBackupAvatarTeamRsp);

        DelBackupAvatarTeamRsp proto = DelBackupAvatarTeamRsp.newBuilder()
            .setRetcode(retcode.getNumber())
            .setBackupAvatarTeamId(id)
            .build();

        this.setData(proto);
    }

    public PacketDelBackupAvatarTeamRsp(int id) {
        this(Retcode.RET_SUCC, id);
    }
}
