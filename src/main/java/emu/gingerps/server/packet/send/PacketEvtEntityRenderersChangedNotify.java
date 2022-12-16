package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtEntityRenderersChangedNotifyOuterClass;

public class PacketEvtEntityRenderersChangedNotify extends BasePacket {

	public PacketEvtEntityRenderersChangedNotify(EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify req) {
		super(PacketOpcodes.EvtEntityRenderersChangedNotify, true);

        this.setData(req);
	}
}
