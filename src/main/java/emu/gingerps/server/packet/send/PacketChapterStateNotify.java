package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChapterStateNotifyOuterClass;
import emu.gingerps.net.proto.ChapterStateOuterClass;

public class PacketChapterStateNotify extends BasePacket {

	public PacketChapterStateNotify(int id, ChapterStateOuterClass.ChapterState state) {
		super(PacketOpcodes.ChapterStateNotify);

        var proto = ChapterStateNotifyOuterClass.ChapterStateNotify.newBuilder();

        proto.setChapterId(id)
            .setChapterState(state);

        this.setData(proto);
	}
}
