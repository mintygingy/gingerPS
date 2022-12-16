package emu.gingerps.server.packet.send;

import emu.gingerps.game.activity.PlayerActivityData;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ActivityUpdateWatcherNotifyOuterClass;

public class PacketActivityUpdateWatcherNotify extends BasePacket {

	public PacketActivityUpdateWatcherNotify(int activityId, PlayerActivityData.WatcherInfo watcherInfo) {
		super(PacketOpcodes.ActivityUpdateWatcherNotify);

        var proto = ActivityUpdateWatcherNotifyOuterClass.ActivityUpdateWatcherNotify.newBuilder();

        proto.setActivityId(activityId)
            .setWatcherInfo(watcherInfo.toProto());

        this.setData(proto);
	}
}
