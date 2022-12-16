package emu.gingerps.server.packet.send;

import java.util.Map;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarUpgradeRspOuterClass.AvatarUpgradeRsp;

public class PacketAvatarUpgradeRsp extends BasePacket {
	
	public PacketAvatarUpgradeRsp(Avatar avatar, int oldLevel, Map<Integer, Float> oldFightPropMap) {
		super(PacketOpcodes.AvatarUpgradeRsp);
		
		this.buildHeader(0);

		AvatarUpgradeRsp proto = AvatarUpgradeRsp.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setOldLevel(oldLevel)
				.setCurLevel(avatar.getLevel())
				.putAllOldFightPropMap(oldFightPropMap)
				.putAllCurFightPropMap(avatar.getFightProperties())
				.build();
		
		this.setData(proto);
	}
}
