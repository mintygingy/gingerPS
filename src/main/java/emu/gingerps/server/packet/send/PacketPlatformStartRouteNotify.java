package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.platform.EntityPlatform;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlatformStartRouteNotifyOuterClass;

public class PacketPlatformStartRouteNotify extends BasePacket {
    public PacketPlatformStartRouteNotify(EntityPlatform entity, Scene scene) {
        super(PacketOpcodes.PlatformStartRouteNotify);

        var notify = PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.newBuilder()
            .setEntityId(entity.getId())
            .setSceneTime(scene.getSceneTime())
            .setPlatform(entity.onStartRoute())
            .build();

        this.setData(notify);
    }
}
