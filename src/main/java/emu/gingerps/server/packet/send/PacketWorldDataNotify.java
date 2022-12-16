package emu.gingerps.server.packet.send;

import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PropValueOuterClass.PropValue;
import emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify;

public class PacketWorldDataNotify extends BasePacket {
	
	public PacketWorldDataNotify(World world) {
		super(PacketOpcodes.WorldDataNotify);
		
		int worldLevel = world.getWorldLevel();
		int isMp = world.isMultiplayer() ? 1 : 0;

		WorldDataNotify proto = WorldDataNotify.newBuilder()
				.putWorldPropMap(1, PropValue.newBuilder().setType(1).setIval(worldLevel).setVal(worldLevel).build())
				.putWorldPropMap(2, PropValue.newBuilder().setType(2).setIval(isMp).setVal(isMp).build())
				.build();

		this.setData(proto);
	}
}
