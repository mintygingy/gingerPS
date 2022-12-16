package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CompoundQueueDataOuterClass.CompoundQueueData;
import emu.gingerps.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;

public class PacketPlayerCompoundMaterialRsp extends BasePacket {
    /**
     * Builder for successful message.
     *
     * @param compoundQueueData new compound queue
     */
    public PacketPlayerCompoundMaterialRsp(CompoundQueueData compoundQueueData) {
        super(PacketOpcodes.PlayerCompoundMaterialRsp);
        PlayerCompoundMaterialRsp proto = PlayerCompoundMaterialRsp.newBuilder()
            .setCompoundQueueData(compoundQueueData)
            .setRetcode(Retcode.RET_SUCC_VALUE)
            .build();
        setData(proto);
    }

    /**
     * Builder for failed message.
     * @param retcode error code
     */
    public PacketPlayerCompoundMaterialRsp(int retcode) {
        super(PacketOpcodes.PlayerCompoundMaterialRsp);
        PlayerCompoundMaterialRsp proto = PlayerCompoundMaterialRsp.newBuilder()
            .setRetcode(retcode)
            .build();
        setData(proto);
    }

}
