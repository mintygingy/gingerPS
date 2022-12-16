package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetFriendShowAvatarInfoReqOuterClass.GetFriendShowAvatarInfoReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetFriendShowAvatarInfoRsp;

@Opcodes(PacketOpcodes.GetFriendShowAvatarInfoReq)
public class HandlerGetFriendShowAvatarInfoReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GetFriendShowAvatarInfoReq req = GetFriendShowAvatarInfoReq.parseFrom(payload);

		int targetUid = req.getUid();
		Player targetPlayer = session.getServer().getPlayerByUid(targetUid, true);

		if (targetPlayer.isShowAvatars()) {
			session.send(new PacketGetFriendShowAvatarInfoRsp(targetUid, targetPlayer.getShowAvatarInfoList()));
		}
	}

}
