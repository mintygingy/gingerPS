package emu.gingerps.server.event.entity;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.net.proto.MotionStateOuterClass.MotionState;
import emu.gingerps.server.event.types.EntityEvent;
import emu.gingerps.utils.Position;

public final class EntityMoveEvent extends EntityEvent {
    private final Position position, rotation;
    private final MotionState motionState;

    public EntityMoveEvent(GameEntity entity, Position position, Position rotation, MotionState motionState) {
        super(entity);

        this.position = position;
        this.rotation = rotation;
        this.motionState = motionState;
    }

    public Position getPosition() {
        return this.position;
    }

    public Position getRotation() {
        return this.rotation;
    }

    public MotionState getMotionState() {
        return this.motionState;
    }
}
