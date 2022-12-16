package emu.gingerps.server.event.entity;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.server.event.types.EntityEvent;
import emu.gingerps.utils.Location;
import lombok.Getter;

import javax.annotation.Nullable;

public final class EntityDeathEvent extends EntityEvent {
    @Getter private final Location deathLocation;
    @Getter @Nullable private final GameEntity killer;

    public EntityDeathEvent(GameEntity entity, int killerId) {
        super(entity);

        this.deathLocation = new Location(entity.getScene(), entity.getPosition());
        this.killer = entity.getScene().getEntityById(killerId);
    }
}
