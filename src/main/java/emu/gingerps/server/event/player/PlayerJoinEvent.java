package emu.gingerps.server.event.player;

import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.Cancellable;
import emu.gingerps.server.event.types.PlayerEvent;

public final class PlayerJoinEvent extends PlayerEvent implements Cancellable {
    public PlayerJoinEvent(Player player) {
        super(player);
    }
}
