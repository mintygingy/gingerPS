package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockPersonalLineRspOuterClass;

public class PacketUnlockPersonalLineRsp extends BasePacket {

	public PacketUnlockPersonalLineRsp(int id, int level, int chapterId) {
		super(PacketOpcodes.UnlockPersonalLineRsp);

        var proto = UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.newBuilder();

        proto.setPersonalLineId(id)
            .setLevel(level)
            .setChapterId(chapterId);

        this.setData(proto);
	}
}
