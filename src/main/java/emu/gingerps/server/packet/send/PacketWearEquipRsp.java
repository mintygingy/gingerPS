package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WearEquipRspOuterClass.WearEquipRsp;

public class PacketWearEquipRsp extends BasePacket {

	public PacketWearEquipRsp(long avatarGuid, long equipGuid) {
		super(PacketOpcodes.WearEquipRsp);

		WearEquipRsp proto = WearEquipRsp.newBuilder()
				.setAvatarGuid(avatarGuid)
				.setEquipGuid(equipGuid)
				.build();

		this.setData(proto);
	}
}
