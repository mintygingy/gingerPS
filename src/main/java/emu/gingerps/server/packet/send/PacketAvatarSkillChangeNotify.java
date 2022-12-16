package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarSkillChangeNotifyOuterClass.AvatarSkillChangeNotify;

public class PacketAvatarSkillChangeNotify extends BasePacket {
	
	public PacketAvatarSkillChangeNotify(Avatar avatar, int skillId, int oldLevel, int curLevel) {
		super(PacketOpcodes.AvatarSkillChangeNotify);
		
		AvatarSkillChangeNotify proto = AvatarSkillChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setEntityId(avatar.getEntityId())
				.setSkillDepotId(avatar.getSkillDepotId())
				.setAvatarSkillId(skillId)
				.setOldLevel(oldLevel)
				.setCurLevel(curLevel)
				.build();
		
		this.setData(proto);
	}
}
