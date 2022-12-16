package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp;
import emu.gingerps.net.proto.ShowAvatarInfoOuterClass.ShowAvatarInfo;

@Opcodes(PacketOpcodes.GetFriendShowAvatarInfoRsp)
public class PacketGetFriendShowAvatarInfoRsp extends BasePacket {

	public PacketGetFriendShowAvatarInfoRsp(int uid, List<ShowAvatarInfo> showAvatarInfoList) {
		super(PacketOpcodes.GetFriendShowAvatarInfoRsp);

		GetFriendShowAvatarInfoRsp.Builder p = GetFriendShowAvatarInfoRsp.newBuilder()
				.setUid(uid)
				.addAllShowAvatarInfoList(showAvatarInfoList);

		this.setData(p.build());
	}

}
