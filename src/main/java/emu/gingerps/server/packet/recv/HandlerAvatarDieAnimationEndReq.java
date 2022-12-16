package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.AvatarDieAnimationEndReq)
public class HandlerAvatarDieAnimationEndReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		AvatarDieAnimationEndReq req = AvatarDieAnimationEndReq.parseFrom(payload);
		
		session.getPlayer().getTeamManager().onAvatarDie(req.getDieGuid());
	}

}
