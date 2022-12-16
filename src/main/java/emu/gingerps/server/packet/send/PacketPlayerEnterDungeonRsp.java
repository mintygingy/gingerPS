package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp;

public class PacketPlayerEnterDungeonRsp extends BasePacket {
	
	public PacketPlayerEnterDungeonRsp(int pointId, int dungeonId) {
		super(PacketOpcodes.PlayerEnterDungeonRsp);
		
		PlayerEnterDungeonRsp proto = PlayerEnterDungeonRsp.newBuilder()
				.setPointId(pointId)
				.setDungeonId(dungeonId)
				.build();
		
		this.setData(proto);
	}
}
