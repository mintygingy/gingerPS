package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify;

public class PacketAvatarSkillMaxChargeCountNotify extends BasePacket {
	
	public PacketAvatarSkillMaxChargeCountNotify(Avatar avatar, int skillId, int maxCharges) {
		super(PacketOpcodes.AvatarSkillMaxChargeCountNotify);

		AvatarSkillMaxChargeCountNotify proto = AvatarSkillMaxChargeCountNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setSkillId(skillId)
				.setMaxChargeCount(maxCharges)
				.build();
		
		this.setData(proto);
	}
}
