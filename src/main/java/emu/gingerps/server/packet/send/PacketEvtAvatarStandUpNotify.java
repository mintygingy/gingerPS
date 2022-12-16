package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify;

public class PacketEvtAvatarStandUpNotify extends BasePacket {

    public PacketEvtAvatarStandUpNotify(EvtAvatarStandUpNotify notify) {
        super(PacketOpcodes.EvtAvatarStandUpNotify);

        EvtAvatarStandUpNotify proto = EvtAvatarStandUpNotify.newBuilder()
                .setEntityId(notify.getEntityId())
                .setDirection(notify.getDirection())
                .setPerformId(notify.getPerformId())
                .setChairId(notify.getChairId())
                .build();

        this.setData(proto);
    }
}
