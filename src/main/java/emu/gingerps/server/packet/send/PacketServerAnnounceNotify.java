package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AnnounceDataOuterClass;
import emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass;
import emu.gingerps.utils.Utils;

import java.util.List;

public class PacketServerAnnounceNotify extends BasePacket {

    public PacketServerAnnounceNotify(List<AnnounceDataOuterClass.AnnounceData> data) {
        super(PacketOpcodes.ServerAnnounceNotify);

        var proto = ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.newBuilder();

        proto.addAllAnnounceDataList(data);

        this.setData(proto);
    }

	public PacketServerAnnounceNotify(String msg, int configId) {
		super(PacketOpcodes.ServerAnnounceNotify);

        var proto = ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.newBuilder();

        proto.addAnnounceDataList(AnnounceDataOuterClass.AnnounceData.newBuilder()
            .setConfigId(configId)
            .setBeginTime(Utils.getCurrentSeconds() + 1)
            .setEndTime(Utils.getCurrentSeconds() + 2)
            .setCenterSystemText(msg)
            .setCenterSystemFrequency(1)
            .build());

        this.setData(proto);
	}
}
