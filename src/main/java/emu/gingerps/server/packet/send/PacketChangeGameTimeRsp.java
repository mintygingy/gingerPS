package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp;

public class PacketChangeGameTimeRsp extends BasePacket {
	
	public PacketChangeGameTimeRsp(Player player) {
		super(PacketOpcodes.ChangeGameTimeRsp);
		
		ChangeGameTimeRsp proto = ChangeGameTimeRsp.newBuilder()
				.setCurGameTime(player.getScene().getTime())
				.build();
		
		this.setData(proto);
	}
}
