package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass;

import java.util.Set;

public class PacketUnlockedFurnitureSuiteDataNotify extends BasePacket {

	public PacketUnlockedFurnitureSuiteDataNotify(Set<Integer> unlockList) {
		super(PacketOpcodes.UnlockedFurnitureSuiteDataNotify);

		var proto = UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.newBuilder();

		proto.addAllFurnitureSuiteIdList(unlockList);
		proto.setIsAll(true);

		this.setData(proto);
	}
}
