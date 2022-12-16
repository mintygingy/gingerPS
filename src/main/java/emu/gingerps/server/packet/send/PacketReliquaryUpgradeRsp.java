package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ReliquaryUpgradeRspOuterClass.ReliquaryUpgradeRsp;

public class PacketReliquaryUpgradeRsp extends BasePacket {
	
	public PacketReliquaryUpgradeRsp(GameItem relic, int rate, int oldLevel, List<Integer> oldAppendPropIdList) {
		super(PacketOpcodes.ReliquaryUpgradeRsp);

		ReliquaryUpgradeRsp proto = ReliquaryUpgradeRsp.newBuilder()
				.setTargetReliquaryGuid(relic.getGuid())
				.setOldLevel(oldLevel)
				.setCurLevel(relic.getLevel())
				.setPowerUpRate(rate)
				.addAllOldAppendPropList(oldAppendPropIdList)
				.addAllCurAppendPropList(relic.getAppendPropIdList())
				.build();
		
		this.setData(proto);
	}
}
