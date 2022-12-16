package emu.gingerps.game.entity;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo;
import emu.gingerps.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair;
import emu.gingerps.net.proto.ClientGadgetInfoOuterClass;
import emu.gingerps.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo;
import emu.gingerps.net.proto.EntityClientDataOuterClass.EntityClientData;
import emu.gingerps.net.proto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo;
import emu.gingerps.net.proto.EvtCreateGadgetNotifyOuterClass.EvtCreateGadgetNotify;
import emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo;
import emu.gingerps.net.proto.PropPairOuterClass.PropPair;
import emu.gingerps.net.proto.ProtEntityTypeOuterClass.ProtEntityType;
import emu.gingerps.net.proto.SceneEntityAiInfoOuterClass.SceneEntityAiInfo;
import emu.gingerps.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.gingerps.net.proto.VectorOuterClass.Vector;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.ProtoHelper;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import lombok.Getter;

public class EntityClientGadget extends EntityBaseGadget {
    @Getter private final Player owner;

    @Getter(onMethod = @__(@Override))
    private int gadgetId;

    @Getter private int campId;
    @Getter private int campType;
    @Getter private int ownerEntityId;
    @Getter private int targetEntityId;
    @Getter private boolean asyncLoad;

    @Getter private int originalOwnerEntityId;

    public EntityClientGadget(Scene scene, Player player, EvtCreateGadgetNotify notify) {
        super(scene, new Position(notify.getInitPos()), new Position(notify.getInitEulerAngles()));
        this.owner = player;
        this.id = notify.getEntityId();
        this.gadgetId = notify.getConfigId();
        this.campId = notify.getCampId();
        this.campType = notify.getCampType();
        this.ownerEntityId = notify.getPropOwnerEntityId();
        this.targetEntityId = notify.getTargetEntityId();
//        this.asyncLoad = notify.getIsAsyncLoad();

        GameEntity owner = scene.getEntityById(this.ownerEntityId);
        if (owner instanceof EntityClientGadget ownerGadget) {
            this.originalOwnerEntityId = ownerGadget.getOriginalOwnerEntityId();
        }
        else {
            this.originalOwnerEntityId = this.ownerEntityId;
        }
    }

    @Override
    public void onDeath(int killerId) {
        super.onDeath(killerId); // Invoke super class's onDeath() method.
    }

    @Override public Int2FloatMap getFightProperties() {return null;}

    @Override
    public SceneEntityInfo toProto() {
        EntityAuthorityInfo authority = EntityAuthorityInfo.newBuilder()
                .setAbilityInfo(AbilitySyncStateInfo.newBuilder())
                .setRendererChangedInfo(EntityRendererChangedInfo.newBuilder())
                .setAiInfo(SceneEntityAiInfo.newBuilder().setIsAiOpen(true).setBornPos(Vector.newBuilder()))
                .setBornPos(Vector.newBuilder())
                .build();

        SceneEntityInfo.Builder entityInfo = SceneEntityInfo.newBuilder()
                .setEntityId(getId())
                .setEntityType(ProtEntityType.PROT_ENTITY_TYPE_GADGET)
                .setMotionInfo(MotionInfo.newBuilder().setPos(getPosition().toProto()).setRot(getRotation().toProto()).setSpeed(Vector.newBuilder()))
                .addAnimatorParaList(AnimatorParameterValueInfoPair.newBuilder())
                .setEntityClientData(EntityClientData.newBuilder())
                .setEntityAuthorityInfo(authority)
                .setLifeState(1);

        PropPair pair = PropPair.newBuilder()
                .setType(PlayerProperty.PROP_LEVEL.getId())
                .setPropValue(ProtoHelper.newPropValue(PlayerProperty.PROP_LEVEL, 1))
                .build();
        entityInfo.addPropList(pair);

        ClientGadgetInfoOuterClass.ClientGadgetInfo clientGadget = ClientGadgetInfoOuterClass.ClientGadgetInfo.newBuilder()
                .setCampId(this.getCampId())
                .setCampType(this.getCampType())
                .setOwnerEntityId(this.getOwnerEntityId())
                .setTargetEntityId(this.getTargetEntityId())
                .setAsyncLoad(this.isAsyncLoad())
                .build();

        SceneGadgetInfo.Builder gadgetInfo = SceneGadgetInfo.newBuilder()
                .setGadgetId(this.getGadgetId())
                .setOwnerEntityId(this.getOwnerEntityId())
                .setIsEnableInteract(true)
                .setClientGadget(clientGadget)
                .setPropOwnerEntityId(this.getOwnerEntityId())
                .setAuthorityPeerId(this.getOwner().getPeerId());

        entityInfo.setGadget(gadgetInfo);

        return entityInfo.build();
    }
}
