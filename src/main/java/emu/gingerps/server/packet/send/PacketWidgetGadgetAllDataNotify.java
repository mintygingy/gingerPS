package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WidgetGadgetAllDataNotifyOuterClass.WidgetGadgetAllDataNotify;

public class PacketWidgetGadgetAllDataNotify extends BasePacket {

    public PacketWidgetGadgetAllDataNotify() {
        super(PacketOpcodes.AllWidgetDataNotify);

        WidgetGadgetAllDataNotify proto = WidgetGadgetAllDataNotify.newBuilder().build();

        this.setData(proto);
    }
}
