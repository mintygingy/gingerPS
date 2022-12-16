package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetShopmallDataRspOuterClass.GetShopmallDataRsp;

import java.util.List;

public class PacketGetShopmallDataRsp extends BasePacket {
	
	public PacketGetShopmallDataRsp() {
		super(PacketOpcodes.GetShopmallDataRsp);

		List<Integer> shop_malls = List.of(900, 1052, 902, 1001, 903);

		GetShopmallDataRsp proto = GetShopmallDataRsp.newBuilder()
				.addAllShopTypeList(shop_malls)
				.build();

		this.setData(proto);
	}
}
