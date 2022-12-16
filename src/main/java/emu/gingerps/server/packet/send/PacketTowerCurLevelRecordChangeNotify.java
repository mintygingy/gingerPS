package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerCurLevelRecordChangeNotifyOuterClass.TowerCurLevelRecordChangeNotify;
import emu.gingerps.net.proto.TowerCurLevelRecordOuterClass.TowerCurLevelRecord;

public class PacketTowerCurLevelRecordChangeNotify extends BasePacket {

	public PacketTowerCurLevelRecordChangeNotify(int curFloorId, int curLevelIndex) {
		super(PacketOpcodes.TowerCurLevelRecordChangeNotify);

		TowerCurLevelRecordChangeNotify proto = TowerCurLevelRecordChangeNotify.newBuilder()
				.setCurLevelRecord(TowerCurLevelRecord.newBuilder()
						.setCurFloorId(curFloorId)
						.setCurLevelIndex(curLevelIndex)
						// TODO team info
						.build())
				.build();

		this.setData(proto);
	}
}
