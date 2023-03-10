package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.player.Player.SceneLoadState;
import emu.gingerps.game.props.EnterReason;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EnterTypeOuterClass.EnterType;
import emu.gingerps.net.proto.PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.Utils;

public class PacketPlayerEnterSceneNotify extends BasePacket {

    // Login
    public PacketPlayerEnterSceneNotify(Player player) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        PlayerEnterSceneNotify.Builder proto = PlayerEnterSceneNotify.newBuilder()
                .setSceneId(player.getSceneId())
                .setPos(player.getPosition().toProto())
                .setSceneBeginTime(System.currentTimeMillis())
                .setType(EnterType.ENTER_TYPE_SELF)
                .setTargetUid(player.getUid())
                .setEnterSceneToken(player.getEnterSceneToken())
                .setWorldLevel(player.getWorldLevel())
                .setEnterReason(EnterReason.Login.getValue())
                .setIsFirstLoginEnterScene(player.isFirstLoginEnterScene())
                .setWorldType(1)
                .setSceneTransaction("3-" + player.getUid() + "-" + (int) (System.currentTimeMillis() / 1000) + "-" + 18402);

        this.setData(proto);
    }

    public PacketPlayerEnterSceneNotify(Player player, EnterType type, EnterReason reason, int newScene, Position newPos) {
        this(player, player, type, reason, newScene, newPos);
    }

    // Teleport or go somewhere
    public PacketPlayerEnterSceneNotify(Player player, Player target, EnterType type, EnterReason reason, int newScene, Position newPos) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        PlayerEnterSceneNotify.Builder proto = PlayerEnterSceneNotify.newBuilder()
                .setPrevSceneId(player.getSceneId())
                .setPrevPos(player.getPosition().toProto())
                .setSceneId(newScene)
                .setPos(newPos.toProto())
                .setSceneBeginTime(System.currentTimeMillis())
                .setType(type)
                .setTargetUid(target.getUid())
                .setEnterSceneToken(player.getEnterSceneToken())
                .setWorldLevel(target.getWorld().getWorldLevel())
                .setEnterReason(reason.getValue())
                .setWorldType(1)
                .setSceneTransaction(newScene + "-" + target.getUid() + "-" + (int) (System.currentTimeMillis() / 1000) + "-" + 18402);

        this.setData(proto);
    }
}
