package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp;

import java.util.List;

public class PacketUpdatePlayerShowAvatarListRsp extends BasePacket {

    public PacketUpdatePlayerShowAvatarListRsp(boolean isShowAvatar, List<Integer> avatarIds) {
        super(PacketOpcodes.UpdatePlayerShowAvatarListRsp);

        UpdatePlayerShowAvatarListRsp proto = UpdatePlayerShowAvatarListRsp.newBuilder()
                .setIsShowAvatar(isShowAvatar)
                .addAllShowAvatarIdList(avatarIds)
                .setRetcode(0)
                .build();

        this.setData(proto);
    }
}
