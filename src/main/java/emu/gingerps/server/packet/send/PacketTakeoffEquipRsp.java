package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp;

public class PacketTakeoffEquipRsp extends BasePacket {
	
	public PacketTakeoffEquipRsp(long avatarGuid, int slot) {
		super(PacketOpcodes.TakeoffEquipRsp);

		TakeoffEquipRsp proto = TakeoffEquipRsp.newBuilder()
				.setAvatarGuid(avatarGuid)
				.setSlot(slot)
				.build();
		
		this.setData(proto);
	}
}
