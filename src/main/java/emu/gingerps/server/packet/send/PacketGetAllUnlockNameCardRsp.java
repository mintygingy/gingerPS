package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp;

public class PacketGetAllUnlockNameCardRsp extends BasePacket {
	
	public PacketGetAllUnlockNameCardRsp(Player player) {
		super(PacketOpcodes.GetAllUnlockNameCardRsp);
		
		GetAllUnlockNameCardRsp proto = GetAllUnlockNameCardRsp.newBuilder()
				.addAllNameCardList(player.getNameCardList())
				.build();

		this.setData(proto);
	}
}
