package emu.gingerps.game.dungeons;

import emu.gingerps.game.world.Scene;
import emu.gingerps.server.packet.send.PacketDungeonSettleNotify;
import emu.gingerps.utils.Utils;

public class BasicDungeonSettleListener implements DungeonSettleListener {

    @Override
    public void onDungeonSettle(Scene scene) {
        scene.setAutoCloseTime(Utils.getCurrentSeconds() + 1000);
        scene.broadcastPacket(new PacketDungeonSettleNotify(scene.getChallenge()));
    }
}
