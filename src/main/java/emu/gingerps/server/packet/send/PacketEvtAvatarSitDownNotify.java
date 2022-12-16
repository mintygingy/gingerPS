package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify;

public class PacketEvtAvatarSitDownNotify extends BasePacket {

    public PacketEvtAvatarSitDownNotify(EvtAvatarSitDownNotify notify) {
        super(PacketOpcodes.EvtAvatarSitDownNotify);

        EvtAvatarSitDownNotify proto = EvtAvatarSitDownNotify.newBuilder()
                .setEntityId(notify.getEntityId())
                .setPosition(notify.getPosition())
                .setChairId(notify.getChairId())
                .build();

        this.setData(proto);
    }
}
