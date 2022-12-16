package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetWidgetSlotRspOuterClass;

public class PacketSetWidgetSlotRsp extends BasePacket {

    public PacketSetWidgetSlotRsp(int materialId) {
        super(PacketOpcodes.SetWidgetSlotRsp);

        SetWidgetSlotRspOuterClass.SetWidgetSlotRsp proto = SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.newBuilder()
                .setMaterialId(materialId)
                .build();

        this.setData(proto);
    }
}
