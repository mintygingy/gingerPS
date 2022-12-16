package emu.gingerps.server.packet.send;

import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HostPlayerNotifyOuterClass.HostPlayerNotify;

public class PacketHostPlayerNotify extends BasePacket {
	
	public PacketHostPlayerNotify(World world) {
		super(PacketOpcodes.HostPlayerNotify);
		
		HostPlayerNotify proto = HostPlayerNotify.newBuilder()
				.setHostUid(world.getHost().getUid())
				.setHostPeerId(world.getHost().getPeerId())
				.build();
		
		this.setData(proto);
	}
}
