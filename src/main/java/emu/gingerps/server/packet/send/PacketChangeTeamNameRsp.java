package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeTeamNameRspOuterClass.ChangeTeamNameRsp;

public class PacketChangeTeamNameRsp extends BasePacket {
	
	public PacketChangeTeamNameRsp(int teamId, String teamName) {
		super(PacketOpcodes.ChangeTeamNameRsp);

		ChangeTeamNameRsp proto = ChangeTeamNameRsp.newBuilder()
				.setTeamId(teamId)
				.setTeamName(teamName)
				.build();
		
		this.setData(proto);
	}
}
