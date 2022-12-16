package emu.gingerps.server.packet.send;

import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FurnitureMakeDataOuterClass;
import emu.gingerps.net.proto.FurnitureMakeSlotOuterClass;
import emu.gingerps.net.proto.ItemParamOuterClass;
import emu.gingerps.net.proto.TakeFurnitureMakeRspOuterClass;

import java.util.List;

public class PacketTakeFurnitureMakeRsp extends BasePacket {

	public PacketTakeFurnitureMakeRsp(int ret,
									  int makeId,
									  List<ItemParamOuterClass.ItemParam> output,
									  List<FurnitureMakeDataOuterClass.FurnitureMakeData> others) {
		super(PacketOpcodes.TakeFurnitureMakeRsp);

		var proto = TakeFurnitureMakeRspOuterClass.TakeFurnitureMakeRsp.newBuilder();

		proto.setRetcode(ret)
				.setMakeId(makeId);

		if(output != null){
			proto.addAllOutputItemList(output);
		}

		if(others != null){
			proto.setFurnitureMakeSlot(FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder()
					.addAllFurnitureMakeDataList(others)
					.build());
		}

		this.setData(proto);
	}
}
