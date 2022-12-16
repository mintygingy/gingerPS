package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PacketHeadOuterClass.PacketHead;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPathfindingEnterSceneRsp;

@Opcodes(PacketOpcodes.PathfindingEnterSceneReq)
public class HandlerPathfindingEnterSceneReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		PacketHead head = PacketHead.parseFrom(header);
		session.send(new PacketPathfindingEnterSceneRsp(head.getClientSequenceId()));
	}

}
