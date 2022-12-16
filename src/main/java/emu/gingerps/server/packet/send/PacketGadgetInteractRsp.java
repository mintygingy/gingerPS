package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityBaseGadget;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GadgetInteractRspOuterClass.GadgetInteractRsp;
import emu.gingerps.net.proto.InterOpTypeOuterClass;
import emu.gingerps.net.proto.InterOpTypeOuterClass.InterOpType;
import emu.gingerps.net.proto.InteractTypeOuterClass.InteractType;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketGadgetInteractRsp extends BasePacket {
	public PacketGadgetInteractRsp(EntityBaseGadget gadget, InteractType interact) {
		this(gadget, interact, null);
	}
	
	public PacketGadgetInteractRsp(EntityBaseGadget gadget, InteractType interact, InterOpType opType) {
		super(PacketOpcodes.GadgetInteractRsp);

		var proto = GadgetInteractRsp.newBuilder()
				.setGadgetEntityId(gadget.getId())
				.setInteractType(interact)
				.setGadgetId(gadget.getGadgetId());

		if (opType != null) {
			proto.setOpType(opType);
		}
		
		this.setData(proto.build());
	}
	
	public PacketGadgetInteractRsp() {
		super(PacketOpcodes.GadgetInteractRsp);

		GadgetInteractRsp proto = GadgetInteractRsp.newBuilder()
				.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE)
				.build();
		
		this.setData(proto);
	}
}
