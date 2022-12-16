package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CompoundDataNotifyOuterClass.CompoundDataNotify;
import emu.gingerps.net.proto.CompoundQueueDataOuterClass.CompoundQueueData;

import java.util.List;
import java.util.Set;

public class PacketCompoundDataNotify extends BasePacket {

    public PacketCompoundDataNotify(Set<Integer> unlockedCompounds, List<CompoundQueueData> compoundQueueData) {
        super(PacketOpcodes.CompoundDataNotify);
        var proto= CompoundDataNotify.newBuilder()
            .addAllUnlockCompoundList(unlockedCompounds)
            .addAllCompoundQueueDataList(compoundQueueData)
            .build();
        this.setData(proto);
    }
}
