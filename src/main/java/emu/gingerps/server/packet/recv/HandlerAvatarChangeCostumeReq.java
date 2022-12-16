package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarChangeCostumeRsp;

@Opcodes(PacketOpcodes.AvatarChangeCostumeReq)
public class HandlerAvatarChangeCostumeReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		AvatarChangeCostumeReq req = AvatarChangeCostumeReq.parseFrom(payload);
		
		boolean success = session.getPlayer().getAvatars().changeCostume(req.getAvatarGuid(), req.getCostumeId());
		
		if (success) {
			session.getPlayer().sendPacket(new PacketAvatarChangeCostumeRsp(req.getAvatarGuid(), req.getCostumeId()));
		} else {
			session.getPlayer().sendPacket(new PacketAvatarChangeCostumeRsp());
		}
	}

}
