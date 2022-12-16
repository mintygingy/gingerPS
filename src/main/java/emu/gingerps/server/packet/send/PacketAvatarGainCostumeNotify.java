package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarGainCostumeNotifyOuterClass.AvatarGainCostumeNotify;

public class PacketAvatarGainCostumeNotify extends BasePacket {
	
	public PacketAvatarGainCostumeNotify(int costumeId) {
		super(PacketOpcodes.AvatarGainCostumeNotify);

		AvatarGainCostumeNotify proto = AvatarGainCostumeNotify.newBuilder()
				.setCostumeId(costumeId)
				.build();
		
		this.setData(proto);
	}
}
