package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerPropRspOuterClass;
import emu.gingerps.net.proto.SetPlayerPropRspOuterClass.SetPlayerPropRsp;

public class PacketSetPlayerPropRsp extends BasePacket {

	public PacketSetPlayerPropRsp(int retCode) {
		super(PacketOpcodes.SetPlayerPropRsp);
		SetPlayerPropRspOuterClass.SetPlayerPropRsp.Builder proto = SetPlayerPropRspOuterClass.SetPlayerPropRsp.newBuilder();
		if (retCode != 0) {
			proto.setRetcode(retCode);
		}
		this.setData(proto.build());
	}
}
