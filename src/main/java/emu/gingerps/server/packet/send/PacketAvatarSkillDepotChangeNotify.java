package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarSkillDepotChangeNotifyOuterClass.AvatarSkillDepotChangeNotify;

public class PacketAvatarSkillDepotChangeNotify extends BasePacket {
	
	public PacketAvatarSkillDepotChangeNotify(Avatar avatar) {
		super(PacketOpcodes.AvatarSkillDepotChangeNotify);
		
		AvatarSkillDepotChangeNotify proto = AvatarSkillDepotChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setEntityId(avatar.getEntityId())
				.setSkillDepotId(avatar.getSkillDepotId())
				.setCoreProudSkillLevel(avatar.getCoreProudSkillLevel())
				.addAllTalentIdList(avatar.getTalentIdList())
				.addAllProudSkillList(avatar.getProudSkillList())
				.putAllSkillLevelMap(avatar.getSkillLevelMap())
				.putAllProudSkillExtraLevelMap(avatar.getProudSkillBonusMap())
				.build();
		
		this.setData(proto);
	}
}
