package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetAuthkeyRspOuterClass.GetAuthkeyRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketGetAuthkeyRsp extends BasePacket {
	
	public PacketGetAuthkeyRsp() {
		super(PacketOpcodes.GetAuthkeyRsp);
		
		GetAuthkeyRsp proto = GetAuthkeyRsp.newBuilder().setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE).build();
		
		this.setData(proto);
	}
}
