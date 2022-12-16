package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FurnitureCurModuleArrangeCountNotifyOuterClass;
import emu.gingerps.net.proto.Uint32PairOuterClass;

public class PacketFurnitureCurModuleArrangeCountNotify extends BasePacket {

	public PacketFurnitureCurModuleArrangeCountNotify() {
		super(PacketOpcodes.FurnitureCurModuleArrangeCountNotify);

		var proto = FurnitureCurModuleArrangeCountNotifyOuterClass.FurnitureCurModuleArrangeCountNotify.newBuilder();

		// TODO

		this.setData(proto);
	}
}
