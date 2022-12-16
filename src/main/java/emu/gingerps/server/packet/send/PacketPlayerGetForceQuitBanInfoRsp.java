package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerGetForceQuitBanInfoRspOuterClass.PlayerGetForceQuitBanInfoRsp;

public class PacketPlayerGetForceQuitBanInfoRsp extends BasePacket {
	
	public PacketPlayerGetForceQuitBanInfoRsp(int retcode) {
		super(PacketOpcodes.PlayerGetForceQuitBanInfoRsp);

		PlayerGetForceQuitBanInfoRsp proto = PlayerGetForceQuitBanInfoRsp.newBuilder()
				.setRetcode(retcode)
				.build();
		
		this.setData(proto);
	}
}
