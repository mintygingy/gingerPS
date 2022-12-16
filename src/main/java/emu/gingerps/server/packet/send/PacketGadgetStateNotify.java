package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify;

public class PacketGadgetStateNotify extends BasePacket {
	
	public PacketGadgetStateNotify(EntityGadget gadget, int newState) {
		super(PacketOpcodes.GadgetStateNotify);
		
		GadgetStateNotify proto = GadgetStateNotify.newBuilder()
				.setGadgetEntityId(gadget.getId())
				.setGadgetState(newState)
				.setIsEnableInteract(true)
				.build();
		
		this.setData(proto);
	}
}
