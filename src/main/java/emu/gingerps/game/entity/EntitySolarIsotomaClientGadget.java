package emu.gingerps.game.entity;

import emu.gingerps.game.entity.platform.EntityPlatform;
import emu.gingerps.game.entity.platform.EntitySolarIsotomaElevatorPlatform;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.EvtCreateGadgetNotifyOuterClass;
import lombok.Getter;

public class EntitySolarIsotomaClientGadget extends EntityClientGadget {
    public static final int GADGET_ID = 41038001;
    public static final int ELEVATOR_GADGET_ID = 41038002;
    @Getter private EntityPlatform platformGadget;

    public EntitySolarIsotomaClientGadget(Scene scene, Player player, EvtCreateGadgetNotifyOuterClass.EvtCreateGadgetNotify notify) {
        super(scene, player, notify);
    }

    @Override
    public void onCreate() {
        //Create solar isotoma elevator and send to all.
        this.platformGadget = new EntitySolarIsotomaElevatorPlatform(this, getScene(), getOwner(), ELEVATOR_GADGET_ID, getPosition(), getRotation());
        getScene().addEntity(this.platformGadget);
    }

    @Override
    public void onRemoved() {
        //Remove solar isotoma elevator entity.
        getScene().removeEntity(this.platformGadget);
    }
}
