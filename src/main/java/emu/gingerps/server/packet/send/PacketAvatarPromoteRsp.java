package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarPromoteRspOuterClass.AvatarPromoteRsp;

public class PacketAvatarPromoteRsp extends BasePacket {
	
	public PacketAvatarPromoteRsp(Avatar avatar) {
		super(PacketOpcodes.AvatarPromoteRsp);

		AvatarPromoteRsp proto = AvatarPromoteRsp.newBuilder()
				.setGuid(avatar.getGuid())
				.build();

		this.setData(proto);
	}
}
