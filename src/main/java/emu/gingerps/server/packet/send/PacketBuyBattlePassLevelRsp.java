package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.BuyBattlePassLevelRspOuterClass.BuyBattlePassLevelRsp;

public class PacketBuyBattlePassLevelRsp extends BasePacket {
	
	public PacketBuyBattlePassLevelRsp(int buyLevel) {
		super(PacketOpcodes.BuyBattlePassLevelRsp);
		
		BuyBattlePassLevelRsp proto = BuyBattlePassLevelRsp.newBuilder()
				.setBuyLevel(buyLevel)
				.build();
		
		this.setData(proto);
	}
}
