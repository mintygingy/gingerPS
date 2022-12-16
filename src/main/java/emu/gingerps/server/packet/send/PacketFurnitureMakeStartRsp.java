package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FurnitureMakeDataOuterClass;
import emu.gingerps.net.proto.FurnitureMakeSlotOuterClass;
import emu.gingerps.net.proto.FurnitureMakeStartRspOuterClass;

import java.util.List;

public class PacketFurnitureMakeStartRsp extends BasePacket {

	public PacketFurnitureMakeStartRsp(int ret, List<FurnitureMakeDataOuterClass.FurnitureMakeData> furnitureMakeData) {
		super(PacketOpcodes.FurnitureMakeStartRsp);

		var proto = FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.newBuilder();

		proto.setRetcode(ret);

		if(furnitureMakeData != null){
			proto.setFurnitureMakeSlot(FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder()
					.addAllFurnitureMakeDataList(furnitureMakeData)
					.build());
		}

		this.setData(proto);
	}
}
