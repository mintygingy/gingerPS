package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PingRspOuterClass.PingRsp;

public class PacketPingRsp extends BasePacket {

	public PacketPingRsp(int clientSeq, int time) {
		super(PacketOpcodes.PingRsp, clientSeq);
		
		PingRsp p = PingRsp.newBuilder()
				.setClientTime(time)
				.build();
		
		this.setData(p.toByteArray());
	}
}
