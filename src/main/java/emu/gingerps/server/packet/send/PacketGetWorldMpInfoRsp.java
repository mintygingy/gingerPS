package emu.gingerps.server.packet.send;

import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetWorldMpInfoRspOuterClass.GetWorldMpInfoRsp;

public class PacketGetWorldMpInfoRsp extends BasePacket {
	
	public PacketGetWorldMpInfoRsp(World world) {
		super(PacketOpcodes.GetWorldMpInfoRsp);

		GetWorldMpInfoRsp proto = GetWorldMpInfoRsp.newBuilder()
				.setIsInMpMode(world.isMultiplayer())
				.build();
		
		this.setData(proto);
	}
}
