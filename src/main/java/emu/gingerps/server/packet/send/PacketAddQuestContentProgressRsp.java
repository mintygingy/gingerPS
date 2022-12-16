package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AddQuestContentProgressRspOuterClass;

public class PacketAddQuestContentProgressRsp extends BasePacket {

	public PacketAddQuestContentProgressRsp(int contentType) {
		super(PacketOpcodes.AddQuestContentProgressRsp);

        var proto = AddQuestContentProgressRspOuterClass.AddQuestContentProgressRsp.newBuilder();

        proto.setContentType(contentType);

        this.setData(proto);

	}
}
