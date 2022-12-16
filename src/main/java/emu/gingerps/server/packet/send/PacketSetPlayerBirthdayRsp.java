package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp;
import emu.gingerps.net.proto.SetPlayerBornDataReqOuterClass;

public class PacketSetPlayerBirthdayRsp extends BasePacket {

	public PacketSetPlayerBirthdayRsp(int retCode) {
		super(PacketOpcodes.SetPlayerBirthdayRsp);

		SetPlayerBirthdayRsp proto = SetPlayerBirthdayRsp.newBuilder()
				.setRetcode(retCode)
				.build();

		this.setData(proto);
	}

	public PacketSetPlayerBirthdayRsp(Player player) {
		super(PacketOpcodes.SetPlayerBirthdayRsp);

		SetPlayerBirthdayRsp proto = SetPlayerBirthdayRsp.newBuilder()
				.setBirthday(player.getBirthday().toProto())
				.build();

		this.setData(proto);
	}
}
