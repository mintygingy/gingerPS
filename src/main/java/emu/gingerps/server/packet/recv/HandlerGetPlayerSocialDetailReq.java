package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetPlayerSocialDetailReqOuterClass.GetPlayerSocialDetailReq;
import emu.gingerps.net.proto.SocialDetailOuterClass.SocialDetail;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetPlayerSocialDetailRsp;

@Opcodes(PacketOpcodes.GetPlayerSocialDetailReq)
public class HandlerGetPlayerSocialDetailReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GetPlayerSocialDetailReq req = GetPlayerSocialDetailReq.parseFrom(payload);
		
		SocialDetail.Builder detail = session.getServer().getSocialDetailByUid(req.getUid());

		if (detail != null) {
			detail.setIsFriend(session.getPlayer().getFriendsList().isFriendsWith(req.getUid()));
		}

		session.send(new PacketGetPlayerSocialDetailRsp(detail));
	}
}
