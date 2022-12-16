package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.platform.EntityPlatform;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlatformStopRouteNotifyOuterClass;

public class PacketPlatformStopRouteNotify extends BasePacket {
    public PacketPlatformStopRouteNotify(EntityPlatform entity, Scene scene) {
        super(PacketOpcodes.PlatformStopRouteNotify);

        var notify = PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.newBuilder()
            .setPlatform(entity.onStopRoute())
            .setSceneTime(scene.getSceneTime())
            .setEntityId(entity.getId())
            .build();

        this.setData(notify);
    }
}
