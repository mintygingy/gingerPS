package emu.gingerps.server.packet.send;

import java.util.Map;

import emu.gingerps.game.expedition.ExpeditionInfo;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarExpeditionCallBackRspOuterClass.AvatarExpeditionCallBackRsp;

public class PacketAvatarExpeditionCallBackRsp extends BasePacket {
    public PacketAvatarExpeditionCallBackRsp(Map<Long, ExpeditionInfo> expeditionInfo) {
        super(PacketOpcodes.AvatarExpeditionCallBackRsp);

        AvatarExpeditionCallBackRsp.Builder proto = AvatarExpeditionCallBackRsp.newBuilder();
        expeditionInfo.forEach((key, e) -> proto.putExpeditionInfoMap(key, e.toProto()));

        this.setData(proto.build());
    }
}
