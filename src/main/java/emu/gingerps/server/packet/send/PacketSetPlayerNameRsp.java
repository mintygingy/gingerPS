package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerNameRspOuterClass.SetPlayerNameRsp;

public class PacketSetPlayerNameRsp extends BasePacket {
	
	public PacketSetPlayerNameRsp(Player player) {
		super(PacketOpcodes.SetPlayerNameRsp);

		SetPlayerNameRsp proto = SetPlayerNameRsp.newBuilder()
				.setNickName(player.getNickname())
				.build();
		
		this.setData(proto);
	}
}
