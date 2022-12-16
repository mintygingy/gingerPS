package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp;

public class PacketAvatarSkillUpgradeRsp extends BasePacket {
	
	public PacketAvatarSkillUpgradeRsp(Avatar avatar, int skillId, int oldLevel, int newLevel) {
		super(PacketOpcodes.AvatarSkillUpgradeRsp);

		AvatarSkillUpgradeRsp proto = AvatarSkillUpgradeRsp.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setAvatarSkillId(skillId)
				.setOldLevel(oldLevel)
				.setCurLevel(newLevel)
				.build();
		
		this.setData(proto);
	}
}
