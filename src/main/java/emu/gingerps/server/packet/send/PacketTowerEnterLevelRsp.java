package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp;

public class PacketTowerEnterLevelRsp extends BasePacket {

	public PacketTowerEnterLevelRsp(int floorId, int levelIndex) {
		super(PacketOpcodes.TowerEnterLevelRsp);

		TowerEnterLevelRsp proto = TowerEnterLevelRsp.newBuilder()
				.setFloorId(floorId)
				.setLevelIndex(levelIndex)
				.addTowerBuffIdList(4)
				.addTowerBuffIdList(28)
				.addTowerBuffIdList(18)
				.build();
		
		this.setData(proto);
	}
}
