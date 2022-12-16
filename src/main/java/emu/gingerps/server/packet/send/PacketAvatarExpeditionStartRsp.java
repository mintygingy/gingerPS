package emu.gingerps.server.packet.send;

import java.util.Map;

import emu.gingerps.game.expedition.ExpeditionInfo;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp;

public class PacketAvatarExpeditionStartRsp extends BasePacket {
    public PacketAvatarExpeditionStartRsp(Map<Long, ExpeditionInfo> expeditionInfo) {
        super(PacketOpcodes.AvatarExpeditionStartRsp);

        AvatarExpeditionStartRsp.Builder proto = AvatarExpeditionStartRsp.newBuilder();
        expeditionInfo.forEach((key, e) -> proto.putExpeditionInfoMap(key, e.toProto()));

        this.setData(proto.build());
    }
}
