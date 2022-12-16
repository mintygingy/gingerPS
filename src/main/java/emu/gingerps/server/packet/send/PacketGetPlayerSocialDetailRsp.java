package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.net.proto.SocialDetailOuterClass.SocialDetail;

public class PacketGetPlayerSocialDetailRsp extends BasePacket {
	
	public PacketGetPlayerSocialDetailRsp(SocialDetail.Builder detail) {
		super(PacketOpcodes.GetPlayerSocialDetailRsp);

		GetPlayerSocialDetailRsp.Builder proto = GetPlayerSocialDetailRsp.newBuilder();
		
		if (detail != null) {
			proto.setDetailData(detail);
		} else {
			proto.setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE);
		}

		this.setData(proto);
	}
}
