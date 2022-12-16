package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetFriendShowNameCardInfoRspOuterClass;

import java.util.List;

public class PacketGetFriendShowNameCardInfoRsp extends BasePacket {
    public PacketGetFriendShowNameCardInfoRsp(int uid, List<Integer> cardIds) {
        super(PacketOpcodes.GetFriendShowNameCardInfoRsp);

        var rsp = GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.newBuilder()
            .setUid(uid)
            .addAllShowNameCardIdList(cardIds)
            .setRetcode(0)
            .build();

        this.setData(rsp);
    }
}
