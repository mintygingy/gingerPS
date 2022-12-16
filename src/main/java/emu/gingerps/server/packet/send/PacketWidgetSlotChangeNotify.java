package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WidgetSlotChangeNotifyOuterClass;
import emu.gingerps.net.proto.WidgetSlotDataOuterClass;
import emu.gingerps.net.proto.WidgetSlotOpOuterClass;

public class PacketWidgetSlotChangeNotify extends BasePacket {

    public PacketWidgetSlotChangeNotify(WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify proto) {
        super(PacketOpcodes.WidgetSlotChangeNotify);

        this.setData(proto);
    }

    public PacketWidgetSlotChangeNotify(WidgetSlotOpOuterClass.WidgetSlotOp op) {
        super(PacketOpcodes.WidgetSlotChangeNotify);

        WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify proto = WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.newBuilder()
                .setOp(op)
                .setSlot(
                        WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                                .setIsActive(true)
                                .build()
                )
                .build();

        this.setData(proto);
    }

    public PacketWidgetSlotChangeNotify(int materialId) {
        super(PacketOpcodes.WidgetSlotChangeNotify);

        WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify proto = WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.newBuilder()
                .setSlot(
                        WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                                .setIsActive(true)
                                .setMaterialId(materialId)
                                .build()
                )
                .build();

        this.setData(proto);
    }

}
