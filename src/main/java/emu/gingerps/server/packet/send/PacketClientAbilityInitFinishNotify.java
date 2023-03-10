package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry;
import emu.gingerps.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify;

public class PacketClientAbilityInitFinishNotify extends BasePacket {
	
	public PacketClientAbilityInitFinishNotify(List<AbilityInvokeEntry> entries) {
		super(PacketOpcodes.ClientAbilityInitFinishNotify, true);

		int entityId = 0;
		
		if (entries.size() > 0) {
			AbilityInvokeEntry entry = entries.get(0);
			entityId = entry.getEntityId();
		}
		
		ClientAbilityInitFinishNotify proto = ClientAbilityInitFinishNotify.newBuilder()
				.setEntityId(entityId)
				.addAllInvokes(entries)
				.build();
		
		this.setData(proto);
	}
}
