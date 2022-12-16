package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify;

public class PacketAvatarUnlockTalentNotify extends BasePacket {
	
	public PacketAvatarUnlockTalentNotify(Avatar avatar, int talentId) {
		super(PacketOpcodes.AvatarUnlockTalentNotify);

		AvatarUnlockTalentNotify proto = AvatarUnlockTalentNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setEntityId(avatar.getEntityId())
				.setTalentId(talentId)
				.setSkillDepotId(avatar.getSkillDepotId())
				.build();
		
		this.setData(proto);
	}
}
