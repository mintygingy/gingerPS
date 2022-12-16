package emu.gingerps.game.entity;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ConfigGadget;
import emu.gingerps.data.excels.GadgetData;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.EntityIdType;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo;
import emu.gingerps.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair;
import emu.gingerps.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo;
import emu.gingerps.net.proto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo;
import emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo;
import emu.gingerps.net.proto.PropPairOuterClass.PropPair;
import emu.gingerps.net.proto.ProtEntityTypeOuterClass.ProtEntityType;
import emu.gingerps.net.proto.SceneEntityAiInfoOuterClass.SceneEntityAiInfo;
import emu.gingerps.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.gingerps.net.proto.VectorOuterClass.Vector;
import emu.gingerps.net.proto.VehicleInfoOuterClass.VehicleInfo;
import emu.gingerps.net.proto.VehicleMemberOuterClass.VehicleMember;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.ProtoHelper;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class EntityVehicle extends EntityBaseGadget {

    @Getter private final Player owner;
    @Getter(onMethod = @__(@Override))
    private final Int2FloatMap fightProperties;

    @Getter private final int pointId;
    @Getter private final int gadgetId;

    @Getter @Setter private float curStamina;
    @Getter private List<VehicleMember> vehicleMembers;
    @Nullable @Getter private ConfigGadget configGadget;

    public EntityVehicle(Scene scene, Player player, int gadgetId, int pointId, Position pos, Position rot) {
        super(scene, pos, rot);
        this.owner = player;
        this.id = getScene().getWorld().getNextEntityId(EntityIdType.GADGET);
        this.fightProperties = new Int2FloatOpenHashMap();
        this.gadgetId = gadgetId;
        this.pointId = pointId;
        this.curStamina = 240; // might be in configGadget.GCALKECLLLP.JBAKBEFIMBN.ANBMPHPOALP
        this.vehicleMembers = new ArrayList<>();
        GadgetData data = GameData.getGadgetDataMap().get(gadgetId);
        if (data != null && data.getJsonName() != null) {
            this.configGadget = GameData.getGadgetConfigData().get(data.getJsonName());
        }

        fillFightProps(configGadget);
    }

    @Override
    protected void fillFightProps(ConfigGadget configGadget) {
        super.fillFightProps(configGadget);
        this.addFightProperty(FightProperty.FIGHT_PROP_CUR_SPEED, 0);
        this.addFightProperty(FightProperty.FIGHT_PROP_CHARGE_EFFICIENCY, 0);
    }

    @Override
    public SceneEntityInfo toProto() {

        VehicleInfo vehicle = VehicleInfo.newBuilder()
                .setOwnerUid(this.owner.getUid())
                .setCurStamina(getCurStamina())
                .build();

        EntityAuthorityInfo authority = EntityAuthorityInfo.newBuilder()
                .setAbilityInfo(AbilitySyncStateInfo.newBuilder())
                .setRendererChangedInfo(EntityRendererChangedInfo.newBuilder())
                .setAiInfo(SceneEntityAiInfo.newBuilder().setIsAiOpen(true).setBornPos(getPosition().toProto()))
                .setBornPos(getPosition().toProto())
                .build();

        SceneGadgetInfo.Builder gadgetInfo = SceneGadgetInfo.newBuilder()
                .setGadgetId(this.getGadgetId())
                .setAuthorityPeerId(this.getOwner().getPeerId())
                .setIsEnableInteract(true)
                .setVehicleInfo(vehicle);

        SceneEntityInfo.Builder entityInfo = SceneEntityInfo.newBuilder()
                .setEntityId(getId())
                .setEntityType(ProtEntityType.PROT_ENTITY_TYPE_GADGET)
                .setMotionInfo(MotionInfo.newBuilder().setPos(getPosition().toProto()).setRot(getRotation().toProto()).setSpeed(Vector.newBuilder()))
                .addAnimatorParaList(AnimatorParameterValueInfoPair.newBuilder())
                .setGadget(gadgetInfo)
                .setEntityAuthorityInfo(authority)
                .setLifeState(1);

        PropPair pair = PropPair.newBuilder()
                .setType(PlayerProperty.PROP_LEVEL.getId())
                .setPropValue(ProtoHelper.newPropValue(PlayerProperty.PROP_LEVEL, 47))
                .build();

        this.addAllFightPropsToEntityInfo(entityInfo);
        entityInfo.addPropList(pair);

        return entityInfo.build();
    }
}
