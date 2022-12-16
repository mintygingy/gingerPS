//package emu.gingerps.server.packet.send;
//
//import emu.gingerps.net.packet.BasePacket;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicBeatmapOuterClass;
//import emu.gingerps.net.proto.MusicBriefInfoOuterClass;
//import emu.gingerps.net.proto.MusicGameGetBeatmapReqOuterClass;
//import emu.gingerps.net.proto.MusicGameGetBeatmapRspOuterClass;
//
//public class PacketMusicGameGetBeatmapRsp extends BasePacket {
//
//    public PacketMusicGameGetBeatmapRsp(MusicBriefInfoOuterClass.MusicBriefInfo briefInfo, MusicBeatmapOuterClass.MusicBeatmap musicRecord, MusicGameGetBeatmapReqOuterClass.MusicGameGetBeatmapReq req) {
//        super(PacketOpcodes.MusicGameGetBeatmapRsp);
//
//        var proto = MusicGameGetBeatmapRspOuterClass.MusicGameGetBeatmapRsp.newBuilder();
//
//        proto.setMusicBriefInfo(briefInfo)
//            .setMusicShareId(briefInfo.getMusicShareId())
//            .setMusicRecord(musicRecord)
//            .setUnknownEnum1(req.getUnknownEnum1())
//            .setReqType(req.getReqType())
//        ;
//
//
//        this.setData(proto);
//    }
//}
