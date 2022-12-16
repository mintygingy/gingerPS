package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WorldPlayerReviveRspOuterClass.WorldPlayerReviveRsp;

public class PacketWorldPlayerReviveRsp extends BasePacket {

	public PacketWorldPlayerReviveRsp() {
		super(PacketOpcodes.WorldPlayerReviveRsp);

		WorldPlayerReviveRsp.Builder proto = WorldPlayerReviveRsp.newBuilder();
		
		this.setData(proto.build());
	}
}
