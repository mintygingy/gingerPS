package emu.gingerps.server.event.player;

import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.types.PlayerEvent;
import emu.gingerps.utils.Position;

/**
 * TODO: Allow plugins to change the position of the player.
 */
public final class PlayerMoveEvent extends PlayerEvent {
    private final MoveType type;
    private final Position from;
    private final Position to;

    public PlayerMoveEvent(Player player, MoveType type, Position from, Position to) {
        super(player);

        this.type = type;
        this.from = from;
        this.to = to;
    }

    public MoveType getMoveType() {
        return this.type;
    }

    public Position getSource() {
        return this.from;
    }

    public Position getDestination() {
        return this.to;
    }

    public enum MoveType {
        /**
         * The player has sent a combat invocation to move.
         */
        PLAYER,

        /**
         * The server has requested that the player moves.
         */
        SERVER
    }
}
