package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData;
import emu.gingerps.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify;

public class PacketTowerLevelStarCondNotify extends BasePacket {

	public PacketTowerLevelStarCondNotify(int floorId, int levelIndex) {
		super(PacketOpcodes.TowerLevelStarCondNotify);

		TowerLevelStarCondNotify proto = TowerLevelStarCondNotify.newBuilder()
				.setFloorId(floorId)
				.setLevelIndex(levelIndex)
				.addCondDataList(TowerLevelStarCondData.newBuilder()
						.setCondValue(1)
						.build()
				)
				.addCondDataList(TowerLevelStarCondData.newBuilder()
						.setCondValue(2)
						.build()
				)
				.addCondDataList(TowerLevelStarCondData.newBuilder()
						.setCondValue(3)
						.build()
				)
				.build();

		this.setData(proto);
	}
}
