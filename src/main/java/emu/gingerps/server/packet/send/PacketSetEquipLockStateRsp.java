package emu.gingerps.server.packet.send;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetEquipLockStateRspOuterClass.SetEquipLockStateRsp;

public class PacketSetEquipLockStateRsp extends BasePacket {
	
	public PacketSetEquipLockStateRsp(GameItem equip) {
		super(PacketOpcodes.SetEquipLockStateRsp);
		
		this.buildHeader(0);

		SetEquipLockStateRsp proto = SetEquipLockStateRsp.newBuilder()
				.setTargetEquipGuid(equip.getGuid())
				.setIsLocked(equip.isLocked())
				.build();
		
		this.setData(proto);
	}
}
