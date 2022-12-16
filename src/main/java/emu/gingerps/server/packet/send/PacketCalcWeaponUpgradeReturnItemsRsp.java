package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CalcWeaponUpgradeReturnItemsRspOuterClass.CalcWeaponUpgradeReturnItemsRsp;
import emu.gingerps.net.proto.ItemParamOuterClass.ItemParam;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketCalcWeaponUpgradeReturnItemsRsp extends BasePacket {
	
	public PacketCalcWeaponUpgradeReturnItemsRsp(long itemGuid, List<ItemParam> returnItems) {
		super(PacketOpcodes.CalcWeaponUpgradeReturnItemsRsp);
		
		CalcWeaponUpgradeReturnItemsRsp proto = CalcWeaponUpgradeReturnItemsRsp.newBuilder()
				.setTargetWeaponGuid(itemGuid)
				.addAllItemParamList(returnItems)
				.build();
		
		this.setData(proto);
	}
	
	public PacketCalcWeaponUpgradeReturnItemsRsp() {
		super(PacketOpcodes.CalcWeaponUpgradeReturnItemsRsp);
		
		CalcWeaponUpgradeReturnItemsRsp proto = CalcWeaponUpgradeReturnItemsRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
				.build();
		
		this.setData(proto);
	}
}
