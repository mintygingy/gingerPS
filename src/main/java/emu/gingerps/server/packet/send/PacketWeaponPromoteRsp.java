package emu.gingerps.server.packet.send;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp;

public class PacketWeaponPromoteRsp extends BasePacket {
	
	public PacketWeaponPromoteRsp(GameItem item, int oldPromoteLevel) {
		super(PacketOpcodes.WeaponPromoteRsp);

		WeaponPromoteRsp proto = WeaponPromoteRsp.newBuilder()
				.setTargetWeaponGuid(item.getGuid())
				.setCurPromoteLevel(item.getPromoteLevel())
				.setOldPromoteLevel(oldPromoteLevel)
				.build();
		
		this.setData(proto);
	}
}
