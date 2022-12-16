package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify;

public class PacketForgeFormulaDataNotify extends BasePacket {
	
	public PacketForgeFormulaDataNotify(int itemId) {
		super(PacketOpcodes.ForgeFormulaDataNotify);

		ForgeFormulaDataNotify proto = ForgeFormulaDataNotify.newBuilder()
				.setForgeId(itemId)
				.setIsLocked(false)
				.build();
		
		this.setData(proto);
	}
}
