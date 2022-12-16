package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ActivityTakeWatcherRewardRspOuterClass;

public class PacketActivityTakeWatcherRewardRsp extends BasePacket {

	public PacketActivityTakeWatcherRewardRsp(int activityId, int watcherId) {
		super(PacketOpcodes.ActivityTakeWatcherRewardRsp);

        var proto = ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.newBuilder();

        proto.setActivityId(activityId)
            .setWatcherId(watcherId);

        this.setData(proto);
	}

}
