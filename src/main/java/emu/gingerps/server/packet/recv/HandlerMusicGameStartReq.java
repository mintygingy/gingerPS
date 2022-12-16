package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.MusicGameStartReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketMusicGameStartRsp;

@Opcodes(PacketOpcodes.MusicGameStartReq)
public class HandlerMusicGameStartReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = MusicGameStartReqOuterClass.MusicGameStartReq.parseFrom(payload);

//		session.send(new PacketMusicGameStartRsp(req.getMusicBasicId(), req.getMusicShareId()));
	}

}
