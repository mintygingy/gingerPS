package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass;

import java.util.Set;

public class PacketUnlockedFurnitureFormulaDataNotify extends BasePacket {

	public PacketUnlockedFurnitureFormulaDataNotify(Set<Integer> unlockList) {
		super(PacketOpcodes.UnlockedFurnitureFormulaDataNotify);

		var proto = UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.newBuilder();

		proto.addAllFurnitureIdList(unlockList);
		proto.setIsAll(true);

		this.setData(proto);
	}
}
