package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify;

public class PacketProudSkillChangeNotify extends BasePacket {
	
	public PacketProudSkillChangeNotify(Avatar avatar) {
		super(PacketOpcodes.ProudSkillChangeNotify);
		
		ProudSkillChangeNotify proto = ProudSkillChangeNotify.newBuilder()
				.setAvatarGuid(avatar.getGuid())
				.setEntityId(avatar.getEntityId())
				.setSkillDepotId(avatar.getSkillDepotId())
				.addAllProudSkillList(avatar.getProudSkillList())
				.build();
		
		this.setData(proto);
	}
}
