package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.inventory.EquipType;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarEquipChangeNotifyOuterClass.AvatarEquipChangeNotify;

public class PacketAvatarEquipChangeNotify extends BasePacket {
	
	public PacketAvatarEquipChangeNotify(Avatar avatar, GameItem item) {
		super(PacketOpcodes.AvatarEquipChangeNotify);

		AvatarEquipChangeNotify.Builder proto = AvatarEquipChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setEquipType(item.getEquipSlot())
				.setItemId(item.getItemId())
				.setEquipGuid(item.getGuid());
		
		if (item.getItemData().getEquipType() == EquipType.EQUIP_WEAPON) {
			proto.setWeapon(item.createSceneWeaponInfo());
		} else {
			proto.setReliquary(item.createSceneReliquaryInfo());
		}

		this.setData(proto);
	}
	
	public PacketAvatarEquipChangeNotify(Avatar avatar, EquipType slot) {
		super(PacketOpcodes.AvatarEquipChangeNotify);

		AvatarEquipChangeNotify.Builder proto = AvatarEquipChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setEquipType(slot.getValue());

		this.setData(proto);
	}
}
