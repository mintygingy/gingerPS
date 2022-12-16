package emu.gingerps.server.event.player;

import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.types.GameEvent;
import emu.gingerps.server.event.types.PlayerEvent;

public final class PlayerQuitEvent extends PlayerEvent {
    public PlayerQuitEvent(Player player) {
        super(player);
    }
}
