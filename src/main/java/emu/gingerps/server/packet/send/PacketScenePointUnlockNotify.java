package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ScenePointUnlockNotifyOuterClass.ScenePointUnlockNotify;

public class PacketScenePointUnlockNotify extends BasePacket {
    public PacketScenePointUnlockNotify(int sceneId, int pointId) {
        super(PacketOpcodes.ScenePointUnlockNotify);

        ScenePointUnlockNotify.Builder p = ScenePointUnlockNotify.newBuilder()
                .setSceneId(sceneId)
                .addPointList(pointId);

        this.setData(p);
    }

    public PacketScenePointUnlockNotify(int sceneId, Iterable<Integer> pointIds) {
        super(PacketOpcodes.ScenePointUnlockNotify);

        ScenePointUnlockNotify.Builder p = ScenePointUnlockNotify.newBuilder()
                .setSceneId(sceneId)
                .addAllPointList(pointIds);

        this.setData(p);
    }
}
