package emu.gingerps.server.event.entity;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.server.event.Cancellable;
import emu.gingerps.server.event.types.EntityEvent;

import javax.annotation.Nullable;

public final class EntityDamageEvent extends EntityEvent implements Cancellable {
    private float damage;
    @Nullable private final GameEntity damager;

    public EntityDamageEvent(GameEntity entity, float damage, @Nullable GameEntity damager) {
        super(entity);

        this.damage = damage;
        this.damager = damager;
    }

    public float getDamage() {
        return this.damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    @Nullable
    public GameEntity getDamager() {
        return this.damager;
    }
}
