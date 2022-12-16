package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AskAddFriendRspOuterClass.AskAddFriendRsp;

public class PacketAskAddFriendRsp extends BasePacket {
	
	public PacketAskAddFriendRsp(int targetUid) {
		super(PacketOpcodes.AskAddFriendRsp);
		
		AskAddFriendRsp proto = AskAddFriendRsp.newBuilder()
				.setTargetUid(targetUid)
				.build();
		
		this.setData(proto);
	}
}
