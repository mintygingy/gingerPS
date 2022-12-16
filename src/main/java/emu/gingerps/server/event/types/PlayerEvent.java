package emu.gingerps.server.event.types;

import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.Event;

/**
 * An event that is related to player interactions.
 */
public abstract class PlayerEvent extends Event {
    protected final Player player;

    public PlayerEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }
}
