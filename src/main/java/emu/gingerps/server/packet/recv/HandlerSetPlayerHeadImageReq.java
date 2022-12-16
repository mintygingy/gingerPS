package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerHeadImageReqOuterClass.SetPlayerHeadImageReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetPlayerHeadImageRsp;

@Opcodes(PacketOpcodes.SetPlayerHeadImageReq)
public class HandlerSetPlayerHeadImageReq extends PacketHandler {
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		SetPlayerHeadImageReq req = SetPlayerHeadImageReq.parseFrom(payload);
		
		int id = req.getAvatarId();
		
		if (session.getPlayer().getAvatars().hasAvatar(id)) {
			session.getPlayer().setHeadImage(id);
			session.send(new PacketSetPlayerHeadImageRsp(session.getPlayer()));
		}
	}
}
