package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEnterScenePeerNotify;
import emu.gingerps.server.packet.send.PacketEnterSceneReadyRsp;

@Opcodes(PacketOpcodes.EnterSceneReadyReq)
public class HandlerEnterSceneReadyReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) {
		session.send(new PacketEnterScenePeerNotify(session.getPlayer()));
		session.send(new PacketEnterSceneReadyRsp(session.getPlayer()));
	}

}
