package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.LunchBoxDataOuterClass;
import emu.gingerps.net.proto.SetUpLunchBoxWidgetRspOuterClass;

public class PacketSetUpLunchBoxWidgetRsp extends BasePacket {

    public PacketSetUpLunchBoxWidgetRsp(LunchBoxDataOuterClass.LunchBoxData lunchBoxData) {
        super(PacketOpcodes.SetUpLunchBoxWidgetRsp);
        var rsp
                = SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.newBuilder();
        rsp.setLunchBoxData(lunchBoxData);

        setData(rsp.build());
    }
}
