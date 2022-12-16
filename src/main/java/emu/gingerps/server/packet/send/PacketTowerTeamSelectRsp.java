package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerTeamSelectRspOuterClass.TowerTeamSelectRsp;

public class PacketTowerTeamSelectRsp extends BasePacket {

	public PacketTowerTeamSelectRsp() {
		super(PacketOpcodes.TowerTeamSelectRsp);

		TowerTeamSelectRsp proto = TowerTeamSelectRsp.newBuilder()
				.build();
		
		this.setData(proto);
	}
}
