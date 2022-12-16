//package emu.gingerps.server.packet.recv;
//
//import emu.gingerps.game.activity.musicgame.MusicGameBeatmap;
//import emu.gingerps.net.packet.Opcodes;
//import emu.gingerps.net.packet.PacketHandler;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicGameGetBeatmapReqOuterClass;
//import emu.gingerps.server.game.GameSession;
//import emu.gingerps.server.packet.send.PacketMusicGameGetBeatmapRsp;
//
//@Opcodes(PacketOpcodes.MusicGameGetBeatmapReq)
//public class HandlerMusicGameGetBeatmapReq extends PacketHandler {
//
//	@Override
//	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
//		var req = MusicGameGetBeatmapReqOuterClass.MusicGameGetBeatmapReq.parseFrom(payload);
//
//		var musicGameBeatmap = MusicGameBeatmap.getByShareId(req.getMusicShareId());
//
//		if(musicGameBeatmap == null){
//			return;
//		}
//
//        session.send(new PacketMusicGameGetBeatmapRsp(
//            musicGameBeatmap.toBriefProto().build(),
//            musicGameBeatmap.toProto(),
//            req
//        ));
//	}
//
//}
