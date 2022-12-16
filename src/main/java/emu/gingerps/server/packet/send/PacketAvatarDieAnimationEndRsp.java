package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp;

public class PacketAvatarDieAnimationEndRsp extends BasePacket {
	
	public PacketAvatarDieAnimationEndRsp(long dieGuid, int skillId) {
		super(PacketOpcodes.AvatarDieAnimationEndRsp);

		AvatarDieAnimationEndRsp proto = AvatarDieAnimationEndRsp.newBuilder()
				.setDieGuid(dieGuid)
				.setSkillId(skillId)
				.build();
		
		this.setData(proto);
	}
}
