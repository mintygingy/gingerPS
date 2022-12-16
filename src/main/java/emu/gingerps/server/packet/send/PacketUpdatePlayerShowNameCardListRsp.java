package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UpdatePlayerShowNameCardListRspOuterClass;

import java.util.List;

public class PacketUpdatePlayerShowNameCardListRsp extends BasePacket {
    public PacketUpdatePlayerShowNameCardListRsp(List<Integer> cardIds) {
        super(PacketOpcodes.UpdatePlayerShowNameCardListRsp);

        var rsp = UpdatePlayerShowNameCardListRspOuterClass.UpdatePlayerShowNameCardListRsp.newBuilder()
            .addAllShowNameCardIdList(cardIds)
            .setRetcode(0)
            .build();

        this.setData(rsp);
    }
}
