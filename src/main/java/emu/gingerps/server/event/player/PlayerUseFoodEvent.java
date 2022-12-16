package emu.gingerps.server.event.player;

import emu.gingerps.data.excels.ItemData;
import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.Cancellable;
import emu.gingerps.server.event.types.PlayerEvent;
import lombok.Getter;
import lombok.Setter;

/**
 * This event is invoked when the player uses food on an avatar.
 */
public final class PlayerUseFoodEvent extends PlayerEvent implements Cancellable {
    @Getter @Setter private ItemData foodUsed;
    @Getter private final EntityAvatar selectedAvatar;

    public PlayerUseFoodEvent(Player player, ItemData foodUsed, EntityAvatar selectedAvatar) {
        super(player);

        this.foodUsed = foodUsed;
        this.selectedAvatar = selectedAvatar;
    }
}
