package emu.gingerps.game.entity;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ConfigGadget;
import emu.gingerps.data.excels.GadgetData;
import emu.gingerps.game.entity.gadget.*;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.EntityIdType;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo;
import emu.gingerps.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair;
import emu.gingerps.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo;
import emu.gingerps.net.proto.EntityClientDataOuterClass.EntityClientData;
import emu.gingerps.net.proto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo;
import emu.gingerps.net.proto.PropPairOuterClass.PropPair;
import emu.gingerps.net.proto.ProtEntityTypeOuterClass.ProtEntityType;
import emu.gingerps.net.proto.SceneEntityAiInfoOuterClass.SceneEntityAiInfo;
import emu.gingerps.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.gingerps.net.proto.VectorOuterClass.Vector;
import emu.gingerps.scripts.constants.EventType;
import emu.gingerps.scripts.data.SceneGadget;
import emu.gingerps.scripts.data.ScriptArgs;
import emu.gingerps.server.packet.send.PacketGadgetStateNotify;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.ProtoHelper;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

import javax.annotation.Nullable;

@ToString(callSuper = true)
public class EntityGadget extends EntityBaseGadget {
    @Getter private final GadgetData gadgetData;
    @Getter(onMethod = @__(@Override)) @Setter
    private int gadgetId;

    @Getter @Setter private int state;
    @Getter @Setter private int pointType;
    @Getter private GadgetContent content;
    @Getter(onMethod = @__(@Override), lazy = true)
    private final Int2FloatMap fightProperties = new Int2FloatOpenHashMap();
    @Getter @Setter private SceneGadget metaGadget;
    @Nullable @Getter
    private ConfigGadget configGadget;

    public EntityGadget(Scene scene, int gadgetId, Position pos) {
        this(scene, gadgetId, pos, null, null);
    }

    public EntityGadget(Scene scene, int gadgetId, Position pos, Position rot) {
        this(scene, gadgetId, pos, rot, null);
    }

    public EntityGadget(Scene scene, int gadgetId, Position pos, Position rot, GadgetContent content) {
        super(scene, pos, rot);
        this.gadgetData = GameData.getGadgetDataMap().get(gadgetId);
        this.configGadget = Optional.ofNullable(this.gadgetData).map(GadgetData::getJsonName).map(GameData.getGadgetConfigData()::get).orElse(null);
        this.id = this.getScene().getWorld().getNextEntityId(EntityIdType.GADGET);
        this.gadgetId = gadgetId;
        this.content = content;
        fillFightProps(configGadget);
    }

    public void updateState(int state) {
        this.setState(state);
        this.getScene().broadcastPacket(new PacketGadgetStateNotify(this, state));
        getScene().getScriptManager().callEvent(EventType.EVENT_GADGET_STATE_CHANGE, new ScriptArgs(state, this.getConfigId()));
    }

    @Deprecated(forRemoval = true) // Dont use!
    public void setContent(GadgetContent content) {
        this.content = this.content == null ? content : this.content;
    }

    // TODO refactor
    public void buildContent() {
        if (this.getContent() != null || this.getGadgetData() == null || this.getGadgetData().getType() == null) {
            return;
        }

        this.content = switch (this.getGadgetData().getType()) {
            case GatherPoint -> new GadgetGatherPoint(this);
            case GatherObject -> new GadgetGatherObject(this);
            case Worktop -> new GadgetWorktop(this);
            case RewardStatue -> new GadgetRewardStatue(this);
            case Chest -> new GadgetChest(this);
            case Gadget -> new GadgetObject(this);
            default -> null;
        };
    }

    @Override
    public void onInteract(Player player, GadgetInteractReq interactReq) {
        if (this.getContent() == null) {
            return;
        }

        boolean shouldDelete = this.getContent().onInteract(player, interactReq);

        if (shouldDelete) {
            this.getScene().killEntity(this);
        }
    }

    @Override
    public void onCreate() {
        // Lua event
        getScene().getScriptManager().callEvent(EventType.EVENT_GADGET_CREATE, new ScriptArgs(this.getConfigId()));
    }

    @Override
    public void onDeath(int killerId) {
        super.onDeath(killerId); // Invoke super class's onDeath() method.

        if (this.getSpawnEntry() != null) {
            this.getScene().getDeadSpawnedEntities().add(getSpawnEntry());
        }
        if (getScene().getChallenge() != null) {
            getScene().getChallenge().onGadgetDeath(this);
        }
        getScene().getScriptManager().callEvent(EventType.EVENT_ANY_GADGET_DIE, new ScriptArgs(this.getConfigId()));
    }

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

        // We do not use the getter to null check because the getter will create a fight prop map if it is null
        if (this.fightProperties != null) {
            addAllFightPropsToEntityInfo(entityInfo);
        }

        SceneGadgetInfo.Builder gadgetInfo = SceneGadgetInfo.newBuilder()
                .setGadgetId(this.getGadgetId())
                .setGroupId(this.getGroupId())
                .setConfigId(this.getConfigId())
                .setGadgetState(this.getState())
                .setIsEnableInteract(true)
                .setAuthorityPeerId(this.getScene().getWorld().getHostPeerId());

        if (this.metaGadget != null) {
            gadgetInfo.setDraftId(this.metaGadget.draft_id);
        }

        if (this.getContent() != null) {
            this.getContent().onBuildProto(gadgetInfo);
        }

        entityInfo.setGadget(gadgetInfo);

        return entityInfo.build();
    }
}
