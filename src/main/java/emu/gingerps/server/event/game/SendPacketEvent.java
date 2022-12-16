package emu.gingerps.server.event.game;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.server.event.Cancellable;
import emu.gingerps.server.event.types.ServerEvent;
import emu.gingerps.server.game.GameSession;

public final class SendPacketEvent extends ServerEvent implements Cancellable {
    private final GameSession gameSession;
    private BasePacket packet;

    public SendPacketEvent(GameSession gameSession, BasePacket packet) {
        super(Type.GAME);

        this.gameSession = gameSession;
        this.packet = packet;
    }

    public GameSession getGameSession() {
        return this.gameSession;
    }

    public void setPacket(BasePacket packet) {
        this.packet = packet;
    }

    public BasePacket getPacket() {
        return this.packet;
    }
}
