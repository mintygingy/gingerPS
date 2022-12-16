package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChangeEditModeRspOuterClass;

public class PacketHomeChangeEditModeRsp extends BasePacket {

	public PacketHomeChangeEditModeRsp(boolean enterEditMode) {
		super(PacketOpcodes.HomeChangeEditModeRsp);

		var proto = HomeChangeEditModeRspOuterClass.HomeChangeEditModeRsp.newBuilder();

		proto.setIsEnterEditMode(enterEditMode);

		this.setData(proto);
	}
}
