package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GroupUnloadNotifyOuterClass;

import java.util.List;

public class PacketGroupUnloadNotify extends BasePacket {

	public PacketGroupUnloadNotify(List<Integer> groupList) {
		super(PacketOpcodes.GroupUnloadNotify);

        var proto = GroupUnloadNotifyOuterClass.GroupUnloadNotify.newBuilder();

        proto.addAllGroupList(groupList);

        this.setData(proto);
	}
}
