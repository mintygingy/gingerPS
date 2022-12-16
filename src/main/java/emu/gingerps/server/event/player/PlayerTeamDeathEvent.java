package emu.gingerps.server.event.player;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.types.PlayerEvent;
import lombok.Getter;

/**
 * This event is invoked when the ENTIRE TEAM dies.
 * To listen for one player death, use {@link emu.gingerps.server.event.entity.EntityDeathEvent}.
 */
public final class PlayerTeamDeathEvent extends PlayerEvent {
    @Getter private final EntityAvatar selectedAvatar;

    public PlayerTeamDeathEvent(Player player, EntityAvatar selectedAvatar) {
        super(player);

        this.selectedAvatar = selectedAvatar;
    }
}
