package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify;

public class PacketPlayerApplyEnterMpNotify extends BasePacket {
	
	public PacketPlayerApplyEnterMpNotify(Player srcPlayer) {
		super(PacketOpcodes.PlayerApplyEnterMpNotify);

		PlayerApplyEnterMpNotify proto = PlayerApplyEnterMpNotify.newBuilder()
				.setSrcPlayerInfo(srcPlayer.getOnlinePlayerInfo())
				.build();
		
		this.setData(proto);
	}
}
