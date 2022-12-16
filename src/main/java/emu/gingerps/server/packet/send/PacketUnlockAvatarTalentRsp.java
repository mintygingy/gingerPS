package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockAvatarTalentRspOuterClass.UnlockAvatarTalentRsp;

public class PacketUnlockAvatarTalentRsp extends BasePacket {
	
	public PacketUnlockAvatarTalentRsp(Avatar avatar, int talentId) {
		super(PacketOpcodes.UnlockAvatarTalentRsp);

		UnlockAvatarTalentRsp proto = UnlockAvatarTalentRsp.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setTalentId(talentId)
				.build();
		
		this.setData(proto);
	}
}
