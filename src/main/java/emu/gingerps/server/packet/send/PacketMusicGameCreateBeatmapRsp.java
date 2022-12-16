//package emu.gingerps.server.packet.send;
//
//import emu.gingerps.net.packet.BasePacket;
//import emu.gingerps.net.packet.PacketOpcodes;
//import emu.gingerps.net.proto.MusicGameCreateBeatmapRspOuterClass;
//import emu.gingerps.net.proto.MusicGameUnknown1EnumOuterClass;
//
//public class PacketMusicGameCreateBeatmapRsp extends BasePacket {
//
//	public PacketMusicGameCreateBeatmapRsp(long musicShareId, MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum unknownEnum1) {
//		super(PacketOpcodes.MusicGameCreateBeatmapRsp);
//
//        var proto = MusicGameCreateBeatmapRspOuterClass.MusicGameCreateBeatmapRsp.newBuilder();
//
//        proto.setMusicShareId(musicShareId)
//            .setUnknownEnum1(unknownEnum1);
//
//        this.setData(proto);
//	}
//}
