package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerMiddleLevelChangeTeamNotifyOuterClass;

public class PacketTowerMiddleLevelChangeTeamNotify extends BasePacket {

	public PacketTowerMiddleLevelChangeTeamNotify() {
		super(PacketOpcodes.TowerMiddleLevelChangeTeamNotify);

		TowerMiddleLevelChangeTeamNotifyOuterClass.TowerMiddleLevelChangeTeamNotify proto =
				TowerMiddleLevelChangeTeamNotifyOuterClass.TowerMiddleLevelChangeTeamNotify.newBuilder()
				.build();
		
		this.setData(proto);
	}
}
