package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WidgetCoolDownDataOuterClass;
import emu.gingerps.net.proto.WidgetCoolDownNotifyOuterClass;

public class PacketWidgetCoolDownNotify extends BasePacket {

    public PacketWidgetCoolDownNotify(int id, long coolDownTime, boolean isSuccess) {
        super(PacketOpcodes.WidgetCoolDownNotify);

        WidgetCoolDownNotifyOuterClass.WidgetCoolDownNotify proto = WidgetCoolDownNotifyOuterClass.WidgetCoolDownNotify.newBuilder()
                .addGroupCoolDownDataList(
                        WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder()
                                .setId(id)
                                .setCoolDownTime(coolDownTime)
                                .setIsSuccess(isSuccess)
                                .build()
                )
                .build();

        this.setData(proto);
    }
}
