package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.MusicGameStartRspOuterClass;

public class PacketMusicGameStartRsp extends BasePacket {

	public PacketMusicGameStartRsp(int musicBasicId, long musicShareId) {
		super(PacketOpcodes.MusicGameStartRsp);

		var proto = MusicGameStartRspOuterClass.MusicGameStartRsp.newBuilder();

		proto.setMusicBasicId(musicBasicId)
            .setUgcGuid(musicShareId);

		this.setData(proto);
	}
}
