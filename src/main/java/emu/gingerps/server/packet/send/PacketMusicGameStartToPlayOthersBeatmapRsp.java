//package emu.gingerps.server.packet.send;
//
//import emu.gingerps.net.packet.BasePacket;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicGameStartToPlayOthersBeatmapRspOuterClass;
//import emu.gingerps.net.proto.MusicGameUnknown1EnumOuterClass;
//
//public class PacketMusicGameStartToPlayOthersBeatmapRsp extends BasePacket {
//
//	public PacketMusicGameStartToPlayOthersBeatmapRsp(MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum unknownEnum1) {
//		super(PacketOpcodes.MusicGameStartToPlayOthersBeatmapRsp);
//
//        var proto = MusicGameStartToPlayOthersBeatmapRspOuterClass.MusicGameStartToPlayOthersBeatmapRsp.newBuilder();
//
//        proto.setUnknownEnum1(unknownEnum1);
//
//        this.setData(proto);
//	}
//}
