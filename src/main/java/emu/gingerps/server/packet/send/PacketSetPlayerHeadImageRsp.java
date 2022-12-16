package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ProfilePictureOuterClass.ProfilePicture;
import emu.gingerps.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp;

public class PacketSetPlayerHeadImageRsp extends BasePacket {
	
	public PacketSetPlayerHeadImageRsp(Player player) {
		super(PacketOpcodes.SetPlayerHeadImageRsp);
		
		SetPlayerHeadImageRsp proto = SetPlayerHeadImageRsp.newBuilder()
				.setProfilePicture(ProfilePicture.newBuilder().setAvatarId(player.getHeadImage()))
				.build();
		
		this.setData(proto);
	}
}
