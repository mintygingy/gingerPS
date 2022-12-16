package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerSignatureRspOuterClass.SetPlayerSignatureRsp;

public class PacketSetPlayerSignatureRsp extends BasePacket {
	
	public PacketSetPlayerSignatureRsp(Player player) {
		super(PacketOpcodes.SetPlayerSignatureRsp);

		SetPlayerSignatureRsp proto = SetPlayerSignatureRsp.newBuilder()
				.setSignature(player.getSignature())
				.build();
		
		this.setData(proto);
	}
}
