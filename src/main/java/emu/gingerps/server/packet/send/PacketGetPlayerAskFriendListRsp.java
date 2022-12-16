package emu.gingerps.server.packet.send;

import emu.gingerps.game.friends.Friendship;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetPlayerAskFriendListRspOuterClass.GetPlayerAskFriendListRsp;

public class PacketGetPlayerAskFriendListRsp extends BasePacket {
	
	public PacketGetPlayerAskFriendListRsp(Player player) {
		super(PacketOpcodes.GetPlayerAskFriendListRsp);
		
		GetPlayerAskFriendListRsp.Builder proto = GetPlayerAskFriendListRsp.newBuilder();

		for (Friendship friendship : player.getFriendsList().getPendingFriends().values()) {
			if (friendship.getAskerId() == player.getUid()) {
				continue;
			}
			proto.addAskFriendList(friendship.toProto());
		}
		
		this.setData(proto);
	}
}
