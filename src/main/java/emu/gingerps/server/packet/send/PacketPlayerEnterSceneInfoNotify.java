package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilityControlBlockOuterClass;
import emu.gingerps.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo;
import emu.gingerps.net.proto.AvatarEnterSceneInfoOuterClass.AvatarEnterSceneInfo;
import emu.gingerps.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo;
import emu.gingerps.net.proto.PlayerEnterSceneInfoNotifyOuterClass.PlayerEnterSceneInfoNotify;
import emu.gingerps.net.proto.TeamEnterSceneInfoOuterClass.TeamEnterSceneInfo;

public class PacketPlayerEnterSceneInfoNotify extends BasePacket {
	
	public PacketPlayerEnterSceneInfoNotify(Player player) {
		super(PacketOpcodes.PlayerEnterSceneInfoNotify);
		
		AbilitySyncStateInfo empty = AbilitySyncStateInfo.newBuilder().build();

		PlayerEnterSceneInfoNotify.Builder proto = PlayerEnterSceneInfoNotify.newBuilder()
				.setCurAvatarEntityId(player.getTeamManager().getCurrentAvatarEntity().getId())
				.setEnterSceneToken(player.getEnterSceneToken());
		
		proto.setTeamEnterInfo(
				TeamEnterSceneInfo.newBuilder()
					.setTeamEntityId(player.getTeamManager().getEntityId()) // 150995833
					.setTeamAbilityInfo(empty)
					.setAbilityControlBlock(AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder().build())
		);
		proto.setMpLevelEntityInfo(
				MPLevelEntityInfo.newBuilder()
					.setEntityId(player.getWorld().getLevelEntityId()) // 184550274
					.setAuthorityPeerId(player.getWorld().getHostPeerId())
					.setAbilityInfo(empty)
		);
		
		for (EntityAvatar avatarEntity : player.getTeamManager().getActiveTeam()) {
			GameItem weapon = avatarEntity.getAvatar().getWeapon();
			long weaponGuid = weapon != null ? weapon.getGuid() : 0;
			
			AvatarEnterSceneInfo avatarInfo = AvatarEnterSceneInfo.newBuilder()
					.setAvatarGuid(avatarEntity.getAvatar().getGuid())
					.setAvatarEntityId(avatarEntity.getId())
					.setWeaponGuid(weaponGuid)
					.setWeaponEntityId(avatarEntity.getWeaponEntityId())
					.setAvatarAbilityInfo(empty)
					.setWeaponAbilityInfo(empty)
					.build();
			
			proto.addAvatarEnterInfo(avatarInfo);
		}
		
		this.setData(proto.build());
	}
}
