//package emu.gingerps.server.packet.recv;
//
//import emu.gingerps.game.activity.musicgame.MusicGameBeatmap;
//import emu.gingerps.net.packet.Opcodes;
//import emu.gingerps.net.packet.PacketHandler;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicGameSearchBeatmapReqOuterClass;
//import emu.gingerps.server.game.GameSession;
//import emu.gingerps.server.packet.send.PacketMusicGameSearchBeatmapRsp;
//
//@Opcodes(PacketOpcodes.MusicGameSearchBeatmapReq)
//public class HandlerMusicGameSearchBeatmapReq extends PacketHandler {
//
//	@Override
//	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
//		var req = MusicGameSearchBeatmapReqOuterClass.MusicGameSearchBeatmapReq.parseFrom(payload);
//
//		var musicGameBeatmap = MusicGameBeatmap.getByShareId(req.getMusicShareId());
//
//		if(musicGameBeatmap == null){
//			session.send(new PacketMusicGameSearchBeatmapRsp(11153, req.getUnknownEnum1()));
//			return;
//		}
//
//        session.send(new PacketMusicGameSearchBeatmapRsp(musicGameBeatmap.toBriefProto().build(), req.getUnknownEnum1()));
//	}
//
//}
