package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ActivityInfoNotifyOuterClass;
import emu.gingerps.net.proto.ActivityInfoOuterClass;

public class PacketActivityInfoNotify extends BasePacket {

	public PacketActivityInfoNotify(ActivityInfoOuterClass.ActivityInfo activityInfo) {
		super(PacketOpcodes.ActivityInfoNotify);

        var proto = ActivityInfoNotifyOuterClass.ActivityInfoNotify.newBuilder();

        proto.setActivityInfo(activityInfo);

        this.setData(proto);
	}
}
