package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DeleteFriendNotifyOuterClass.DeleteFriendNotify;

public class PacketDeleteFriendNotify extends BasePacket {
	
	public PacketDeleteFriendNotify(int targetUid) {
		super(PacketOpcodes.DeleteFriendNotify);

		DeleteFriendNotify proto = DeleteFriendNotify.newBuilder()
				.setTargetUid(targetUid)
				.build();
		
		this.setData(proto);
	}
}
