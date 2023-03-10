package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilityInvocationsNotifyOuterClass.AbilityInvocationsNotify;
import emu.gingerps.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry;

public class PacketAbilityInvocationsNotify extends BasePacket {
	
	public PacketAbilityInvocationsNotify(AbilityInvokeEntry entry) {
		super(PacketOpcodes.AbilityInvocationsNotify, true);
		
		AbilityInvocationsNotify proto = AbilityInvocationsNotify.newBuilder()
				.addInvokes(entry)
				.build();

		this.setData(proto);
	}
	
	public PacketAbilityInvocationsNotify(List<AbilityInvokeEntry> entries) {
		super(PacketOpcodes.AbilityInvocationsNotify, true);
		
		AbilityInvocationsNotify proto = AbilityInvocationsNotify.newBuilder()
				.addAllInvokes(entries)
				.build();
		
		this.setData(proto);
	}
	
}
