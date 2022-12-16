package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ItemParamOuterClass.ItemParam;
import emu.gingerps.net.proto.WeaponUpgradeRspOuterClass.WeaponUpgradeRsp;

public class PacketWeaponUpgradeRsp extends BasePacket {
	
	public PacketWeaponUpgradeRsp(GameItem item, int oldLevel, List<ItemParam> leftoverOres) {
		super(PacketOpcodes.WeaponUpgradeRsp);
		
		WeaponUpgradeRsp proto = WeaponUpgradeRsp.newBuilder()
				.setTargetWeaponGuid(item.getGuid())
				.setCurLevel(item.getLevel())
				.setOldLevel(oldLevel)
				.addAllItemParamList(leftoverOres)
				.build();
		
		this.setData(proto);
	}
}
