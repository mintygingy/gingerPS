package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.MusicGameSettleRspOuterClass;

public class PacketMusicGameSettleRsp extends BasePacket {

    public PacketMusicGameSettleRsp(int musicBasicId, long musicShareId, boolean isNewRecord) {
        super(PacketOpcodes.MusicGameSettleRsp);

        var proto = MusicGameSettleRspOuterClass.MusicGameSettleRsp.newBuilder();

        proto.setMusicBasicId(musicBasicId)
            .setUgcGuid(musicShareId)
            .setIsNewRecord(isNewRecord);

        this.setData(proto);
    }
}
