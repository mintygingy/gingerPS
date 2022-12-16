package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType;
import emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp;

public class PacketDealAddFriendRsp extends BasePacket {
	
	public PacketDealAddFriendRsp(int targetUid, DealAddFriendResultType result) {
		super(PacketOpcodes.DealAddFriendRsp);

		DealAddFriendRsp proto = DealAddFriendRsp.newBuilder()
				.setTargetUid(targetUid)
				.setDealAddFriendResult(result)
				.build();
		
		this.setData(proto);
	}
}
