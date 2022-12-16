package emu.gingerps.server.packet.send;

import emu.gingerps.game.expedition.ExpeditionInfo;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarExpeditionGetRewardRspOuterClass.AvatarExpeditionGetRewardRsp;

import java.util.Collection;
import java.util.Map;

public class PacketAvatarExpeditionGetRewardRsp extends BasePacket {
    public PacketAvatarExpeditionGetRewardRsp(Map<Long, ExpeditionInfo> expeditionInfo, Collection<GameItem> items) {
        super(PacketOpcodes.AvatarExpeditionGetRewardRsp);

        AvatarExpeditionGetRewardRsp.Builder proto = AvatarExpeditionGetRewardRsp.newBuilder();
        expeditionInfo.forEach((key, e) -> proto.putExpeditionInfoMap(key, e.toProto()));
        items.forEach(item -> proto.addItemList(item.toItemParam()));

        this.setData(proto.build());
    }
}
