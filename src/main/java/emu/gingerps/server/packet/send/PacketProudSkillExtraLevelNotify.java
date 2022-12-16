package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify;

public class PacketProudSkillExtraLevelNotify extends BasePacket {

	public PacketProudSkillExtraLevelNotify(Avatar avatar, int talentIndex) {
		super(PacketOpcodes.ProudSkillExtraLevelNotify);

		ProudSkillExtraLevelNotify proto = ProudSkillExtraLevelNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
//				.setTalentType(3) // Talent type = 3
//				.setTalentIndex(talentIndex)
//				.setExtraLevel(3)
				.build();

		this.setData(proto);
	}
}
