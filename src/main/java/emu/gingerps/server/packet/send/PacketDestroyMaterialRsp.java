package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp;
import it.unimi.dsi.fastutil.ints.Int2IntMap;

public class PacketDestroyMaterialRsp extends BasePacket {

    public PacketDestroyMaterialRsp(Int2IntMap returnMaterialMap) {
        super(PacketOpcodes.DestroyMaterialRsp);

        var proto = DestroyMaterialRsp.newBuilder();

        returnMaterialMap.forEach((id, count) -> {
            proto.addItemIdList(id);
            proto.addItemCountList(count);
        });

        this.setData(proto);
    }
}
