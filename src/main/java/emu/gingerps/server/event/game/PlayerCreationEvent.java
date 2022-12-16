package emu.gingerps.server.event.game;

import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.types.GameEvent;
import emu.gingerps.server.game.GameSession;

public final class PlayerCreationEvent extends GameEvent {
    private final GameSession session;
    private Class<? extends Player> playerClass;
    
    public PlayerCreationEvent(GameSession session, Class<? extends Player> playerClass) {
        this.session = session;
        this.playerClass = playerClass;
    }
    
    public GameSession getSession() {
        return this.session;
    }
    
    public void setPlayerClass(Class<? extends Player> playerClass) {
        this.playerClass = playerClass;
    }
    
    public Class<? extends Player> getPlayerClass() {
        return this.playerClass;
    }
}
