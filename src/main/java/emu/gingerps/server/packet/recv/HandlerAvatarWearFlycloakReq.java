package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarWearFlycloakReqOuterClass.AvatarWearFlycloakReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarWearFlycloakRsp;

@Opcodes(PacketOpcodes.AvatarWearFlycloakReq)
public class HandlerAvatarWearFlycloakReq extends PacketHandler {
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		AvatarWearFlycloakReq req = AvatarWearFlycloakReq.parseFrom(payload);
		
		boolean success = session.getPlayer().getAvatars().wearFlycloak(req.getAvatarGuid(), req.getFlycloakId());
		
		if (success) {
			session.getPlayer().sendPacket(new PacketAvatarWearFlycloakRsp(req.getAvatarGuid(), req.getFlycloakId()));
		} else {
			session.getPlayer().sendPacket(new PacketAvatarWearFlycloakRsp());
		}
	}
}
