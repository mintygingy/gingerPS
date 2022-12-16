package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CompoundQueueDataOuterClass.CompoundQueueData;
import emu.gingerps.net.proto.GetCompoundDataRspOuterClass.GetCompoundDataRsp;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;

import java.util.List;
import java.util.Set;

public class PacketGetCompoundDataRsp extends BasePacket {
    public PacketGetCompoundDataRsp(Set<Integer> unlockedCompounds, List<CompoundQueueData> compoundQueueData) {
        super(PacketOpcodes.GetCompoundDataRsp);
        var proto = GetCompoundDataRsp.newBuilder()
            .addAllUnlockCompoundList(unlockedCompounds)
            .addAllCompoundQueueDataList(compoundQueueData)
            .setRetcode(Retcode.RET_SUCC_VALUE)
            .build();
        setData(proto);
    }
}
