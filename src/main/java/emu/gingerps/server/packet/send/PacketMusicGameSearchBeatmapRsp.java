//package emu.gingerps.server.packet.send;
//
//import emu.gingerps.net.packet.BasePacket;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicBriefInfoOuterClass;
//import emu.gingerps.net.proto.MusicGameSearchBeatmapRspOuterClass;
//import emu.gingerps.net.proto.MusicGameUnknown1EnumOuterClass;
//
//public class PacketMusicGameSearchBeatmapRsp extends BasePacket {
//
//	public PacketMusicGameSearchBeatmapRsp(int ret, MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum unknownEnum1) {
//		super(PacketOpcodes.MusicGameSearchBeatmapRsp);
//
//        var proto = MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.newBuilder();
//
//        proto.setRetcode(ret)
//            .setUnknownEnum1(unknownEnum1);
//
//        this.setData(proto);
//	}
//
//    public PacketMusicGameSearchBeatmapRsp(MusicBriefInfoOuterClass.MusicBriefInfo briefInfo, MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum unknownEnum1) {
//        super(PacketOpcodes.MusicGameSearchBeatmapRsp);
//
//        var proto = MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.newBuilder();
//
//        proto.setMusicBriefInfo(briefInfo)
//            .setUnknownEnum1(unknownEnum1);
//
//        this.setData(proto);
//    }
//
//
//}
