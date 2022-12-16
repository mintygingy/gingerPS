package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify;
import emu.gingerps.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry;

public class PacketCombatInvocationsNotify extends BasePacket {
	
	public PacketCombatInvocationsNotify(CombatInvokeEntry entry) {
		super(PacketOpcodes.CombatInvocationsNotify, true);
		
		CombatInvocationsNotify proto = CombatInvocationsNotify.newBuilder()
				.addInvokeList(entry)
				.build();
		
		this.setData(proto);
	}
	
	public PacketCombatInvocationsNotify(List<CombatInvokeEntry> entries) {
		super(PacketOpcodes.CombatInvocationsNotify, true);
	
		CombatInvocationsNotify proto = CombatInvocationsNotify.newBuilder()
				.addAllInvokeList(entries)
				.build();
		
		this.setData(proto);
	}
	
}
