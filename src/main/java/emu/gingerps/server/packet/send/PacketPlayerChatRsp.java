package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerChatRspOuterClass.PlayerChatRsp;

public class PacketPlayerChatRsp extends BasePacket {
	
	public PacketPlayerChatRsp() {
		super(PacketOpcodes.PlayerChatRsp);
		
		PlayerChatRsp proto = PlayerChatRsp.newBuilder().build();
		
		this.setData(proto);
	}
}
