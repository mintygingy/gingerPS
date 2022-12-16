package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockNameCardNotifyOuterClass.UnlockNameCardNotify;

public class PacketUnlockNameCardNotify extends BasePacket {
	
	public PacketUnlockNameCardNotify(int nameCard) {
		super(PacketOpcodes.UnlockNameCardNotify);

		UnlockNameCardNotify proto = UnlockNameCardNotify.newBuilder()
				.setNameCardId(nameCard)
				.build();
		
		this.setData(proto);
	}
}
