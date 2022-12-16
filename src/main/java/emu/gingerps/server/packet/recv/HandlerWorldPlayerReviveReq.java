package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.WorldPlayerDieNotifyOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketWorldPlayerReviveRsp;

@Opcodes(PacketOpcodes.WorldPlayerReviveReq)
public class HandlerWorldPlayerReviveReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		session.getPlayer().getTeamManager().respawnTeam();
		session.send(new PacketWorldPlayerReviveRsp());
	}

}
