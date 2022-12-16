package emu.gingerps.server.event.game;

import emu.gingerps.server.event.Cancellable;
import emu.gingerps.server.event.types.ServerEvent;
import emu.gingerps.server.game.GameSession;

public final class ReceivePacketEvent extends ServerEvent implements Cancellable {
    private final GameSession gameSession;
    private final int packetId;
    private byte[] packetData;
    
    public ReceivePacketEvent(GameSession gameSession, int packetId, byte[] packetData) {
        super(Type.GAME);
        
        this.gameSession = gameSession;
        this.packetId = packetId;
        this.packetData = packetData;
    }
    
    public GameSession getGameSession() {
        return this.gameSession;
    }
    
    public int getPacketId() {
        return this.packetId;
    }
    
    public void setPacketData(byte[] packetData) {
        this.packetData = packetData;
    }
    
    public byte[] getPacketData() {
        return this.packetData;
    }
}
