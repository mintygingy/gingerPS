package emu.gingerps.server.packet.send;

import emu.gingerps.game.home.FurnitureMakeSlotItem;
import emu.gingerps.game.home.GameHome;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FurnitureMakeRspOuterClass;
import emu.gingerps.net.proto.FurnitureMakeSlotOuterClass;

public class PacketFurnitureMakeRsp extends BasePacket {

	public PacketFurnitureMakeRsp(GameHome home) {
		super(PacketOpcodes.FurnitureMakeRsp);

		var proto = FurnitureMakeRspOuterClass.FurnitureMakeRsp.newBuilder();

		proto.setFurnitureMakeSlot(FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder()
				.addAllFurnitureMakeDataList(home.getFurnitureMakeSlotItemList().stream()
						.map(FurnitureMakeSlotItem::toProto)
						.toList())
				.build());

		this.setData(proto);
	}
}
