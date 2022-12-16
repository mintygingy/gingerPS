package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WeaponAwakenRspOuterClass.WeaponAwakenRsp;

public class PacketWeaponAwakenRsp extends BasePacket {
	
	public PacketWeaponAwakenRsp(Avatar avatar, GameItem item, GameItem feedWeapon, int oldRefineLevel) {
		super(PacketOpcodes.WeaponAwakenRsp);

		WeaponAwakenRsp.Builder proto = WeaponAwakenRsp.newBuilder()
				.setTargetWeaponGuid(item.getGuid())
				.setTargetWeaponAwakenLevel(item.getRefinement());
		
		for (int affixId : item.getAffixes()) {
			proto.putOldAffixLevelMap(affixId, oldRefineLevel);
			proto.putCurAffixLevelMap(affixId, item.getRefinement());
		}
		
		if (avatar != null) {
			proto.setAvatarGuid(avatar.getGuid());
		}
		
		this.setData(proto);
	}
}
