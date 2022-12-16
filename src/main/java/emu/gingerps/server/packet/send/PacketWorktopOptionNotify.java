package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.entity.gadget.GadgetWorktop;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WorktopOptionNotifyOuterClass.WorktopOptionNotify;

public class PacketWorktopOptionNotify extends BasePacket {
	
	public PacketWorktopOptionNotify(EntityGadget gadget) {
		super(PacketOpcodes.WorktopOptionNotify);
		
		WorktopOptionNotify.Builder proto = WorktopOptionNotify.newBuilder()
				.setGadgetEntityId(gadget.getId());
		
		if (gadget.getContent() instanceof GadgetWorktop worktop) {
			proto.addAllOptionList(worktop.getWorktopOptions());
		}
		
		this.setData(proto);
	}
}
