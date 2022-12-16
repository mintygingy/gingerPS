package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify;

public class PacketSceneTimeNotify extends BasePacket {

    public PacketSceneTimeNotify(Player player) {
        super(PacketOpcodes.SceneTimeNotify);

        SceneTimeNotify proto = SceneTimeNotify.newBuilder()
                .setSceneId(player.getSceneId())
                .setSceneTime(player.getScene().getSceneTime())
                .build();

        this.setData(proto);
    }
}
