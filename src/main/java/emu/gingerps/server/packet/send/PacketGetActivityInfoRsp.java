package emu.gingerps.server.packet.send;

import emu.gingerps.game.activity.ActivityManager;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetActivityInfoRspOuterClass.GetActivityInfoRsp;

import java.util.Set;

public class PacketGetActivityInfoRsp extends BasePacket {
	public PacketGetActivityInfoRsp(Set<Integer> activityIdList, ActivityManager activityManager) {
		super(PacketOpcodes.GetActivityInfoRsp);

		var proto = GetActivityInfoRsp.newBuilder();

        activityIdList.stream()
            .map(activityManager::getInfoProtoByActivityId)
            .forEach(proto::addActivityInfoList);

		this.setData(proto);
	}
}
