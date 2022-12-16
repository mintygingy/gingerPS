package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify;

public class PacketCombineDataNotify extends BasePacket {
	
	public PacketCombineDataNotify(Iterable<Integer> unlockedCombines) {
		super(PacketOpcodes.CombineDataNotify);
		
		CombineDataNotify proto = CombineDataNotify.newBuilder()
				.addAllCombineIdList(unlockedCombines)
				.build();
		
		this.setData(proto);
	}
}
