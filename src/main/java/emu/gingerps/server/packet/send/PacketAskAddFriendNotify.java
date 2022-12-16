package emu.gingerps.server.packet.send;

import emu.gingerps.game.friends.Friendship;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AskAddFriendNotifyOuterClass.AskAddFriendNotify;

public class PacketAskAddFriendNotify extends BasePacket {
	
	public PacketAskAddFriendNotify(Friendship friendship) {
		super(PacketOpcodes.AskAddFriendNotify);

		AskAddFriendNotify proto = AskAddFriendNotify.newBuilder()
				.setTargetUid(friendship.getFriendId())
				.setTargetFriendBrief(friendship.toProto())
				.build();
		
		this.setData(proto);
	}
}
