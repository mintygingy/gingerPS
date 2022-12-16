package emu.gingerps.server.event.types;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.server.event.Event;

/**
 * An event that is related to entity interactions.
 */
public abstract class EntityEvent extends Event {
    protected final GameEntity entity;

    public EntityEvent(GameEntity player) {
        this.entity = player;
    }

    public GameEntity getEntity() {
        return this.entity;
    }
}
