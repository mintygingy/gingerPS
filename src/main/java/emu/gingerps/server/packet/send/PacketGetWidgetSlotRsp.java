package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetWidgetSlotRspOuterClass;
import emu.gingerps.net.proto.WidgetSlotDataOuterClass;
import emu.gingerps.net.proto.WidgetSlotTagOuterClass;

import java.util.List;

public class PacketGetWidgetSlotRsp extends BasePacket {

    public PacketGetWidgetSlotRsp(Player player) {
        super(PacketOpcodes.GetWidgetSlotRsp);

        GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.Builder proto =
                GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.newBuilder();

        if (player.getWidgetId() == 0) {  // TODO: check this logic later, it was null-checking an int before which made it dead code
            proto.addAllSlotList(List.of());
        } else {
            proto.addSlotList(
                    WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                            .setIsActive(true)
                            .setMaterialId(player.getWidgetId())
                            .build()
            );

            proto.addSlotList(
                    WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
                            .setTag(WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_ATTACH_AVATAR)
                            .build()
            );
        }

        GetWidgetSlotRspOuterClass.GetWidgetSlotRsp protoData = proto.build();

        this.setData(protoData);
    }
}
