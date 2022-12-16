//package emu.gingerps.server.packet.recv;
//
//import emu.gingerps.net.packet.Opcodes;
//import emu.gingerps.net.packet.PacketHandler;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass;
//import emu.gingerps.server.game.GameSession;
//import emu.gingerps.server.packet.send.PacketMusicGameStartToPlayOthersBeatmapRsp;
//
//@Opcodes(PacketOpcodes.MusicGameStartToPlayOthersBeatmapReq)
//public class HandlerMusicGameStartToPlayOthersBeatmapReq extends PacketHandler {
//
//	@Override
//	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
//        var req = MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.parseFrom(payload);
//
//		session.send(new PacketMusicGameStartToPlayOthersBeatmapRsp(req.getUnknownEnum1()));
//	}
//
//}
