package emu.gingerps.game.entity.platform;

import emu.gingerps.gingerps;
import emu.gingerps.data.binout.ConfigGadget;
import emu.gingerps.game.entity.EntitySolarIsotomaClientGadget;
import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.*;
import emu.gingerps.server.packet.send.PacketSceneTimeNotify;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.ProtoHelper;

public class EntitySolarIsotomaElevatorPlatform extends EntityPlatform {
    public EntitySolarIsotomaElevatorPlatform(EntitySolarIsotomaClientGadget isotoma, Scene scene, Player player, int gadgetId, Position pos, Position rot) {
        super(isotoma, scene, player, gadgetId, pos, rot, MovingPlatformTypeOuterClass.MovingPlatformType.MOVING_PLATFORM_TYPE_ABILITY);
    }

    @Override
    protected void fillFightProps(ConfigGadget configGadget) {
        if (configGadget == null || configGadget.getCombat() == null) {
            return;
        }
        var combatData = configGadget.getCombat();
        var combatProperties = combatData.getProperty();

        if (combatProperties.isUseCreatorProperty()) {
            //If useCreatorProperty == true, use owner's property;
            GameEntity ownerAvatar = getScene().getEntityById(getGadget().getOwnerEntityId());
            if (ownerAvatar != null) {
                getFightProperties().putAll(ownerAvatar.getFightProperties());
                return;
            } else {
                gingerps.getLogger().warn("Why gadget owner is null?");
            }
        }

        super.fillFightProps(configGadget);
    }

    @Override
    public SceneEntityInfoOuterClass.SceneEntityInfo toProto() {
        var gadget = SceneGadgetInfoOuterClass.SceneGadgetInfo.newBuilder()
            .setGadgetId(getGadgetId())
            .setOwnerEntityId(getGadget().getId())
            .setAuthorityPeerId(getOwner().getPeerId())
            .setIsEnableInteract(true)
            .setAbilityGadget(AbilityGadgetInfoOuterClass.AbilityGadgetInfo.newBuilder()
                .setCampId(getGadget().getCampId())
                .setCampTargetType(getGadget().getCampType())
                .setTargetEntityId(getGadget().getId())
                .build())
            .setPlatform(PlatformInfoOuterClass.PlatformInfo.newBuilder()
                .setStartRot(MathQuaternionOuterClass.MathQuaternion.newBuilder()
                    .setW(1.0F)
                    .build())
                .setPosOffset(getGadget().getPosition().toProto())
                .setRotOffset(MathQuaternionOuterClass.MathQuaternion.newBuilder()
                    .setW(1.0F)
                    .build())
                .setMovingPlatformType(MovingPlatformTypeOuterClass.MovingPlatformType.MOVING_PLATFORM_TYPE_ABILITY)
                .build())
            .build();

        var authority = EntityAuthorityInfoOuterClass.EntityAuthorityInfo.newBuilder()
            .setAiInfo(SceneEntityAiInfoOuterClass.SceneEntityAiInfo.newBuilder()
                .setIsAiOpen(true)
                .setBornPos(getGadget().getPosition().toProto()))
            .setBornPos(getGadget().getPosition().toProto())
            .build();

        var info = SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder()
            .setEntityType(ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_GADGET)
            .setEntityId(getId())
            .setMotionInfo(MotionInfoOuterClass.MotionInfo.newBuilder()
                .setPos(getGadget().getPosition().toProto())
                .setRot(getGadget().getRotation().toProto())
                .build());

        GameEntity entity = getScene().getEntityById(getGadget().getOwnerEntityId());
        if (entity instanceof EntityAvatar avatar) {
            info.addPropList(PropPairOuterClass.PropPair.newBuilder()
                .setType(PlayerProperty.PROP_LEVEL.getId())
                .setPropValue(ProtoHelper.newPropValue(PlayerProperty.PROP_LEVEL, avatar.getAvatar().getLevel()))
                .build());
        } else {
            gingerps.getLogger().warn("Why gadget owner doesn't exist?");
        }

        this.addAllFightPropsToEntityInfo(info);

        info.setLifeState(1)
            .setGadget(gadget)
            .setEntityAuthorityInfo(authority);

        return info.build();
    }

    @Override
    public PlatformInfoOuterClass.PlatformInfo onStartRoute() {
        setStarted(true);
        setActive(true);

        var sceneTime = getScene().getSceneTime();
        getOwner().sendPacket(new PacketSceneTimeNotify(getOwner()));

        return PlatformInfoOuterClass.PlatformInfo.newBuilder()
            .setStartSceneTime(sceneTime + 300)
            .setIsStarted(true)
            .setPosOffset(getPosition().toProto())
            .setRotOffset(MathQuaternionOuterClass.MathQuaternion.newBuilder()
                .setW(1.0F)
                .build())
            .setMovingPlatformType(getMovingPlatformType())
            .setIsActive(true)
            .build();
    }

    @Override
    public PlatformInfoOuterClass.PlatformInfo onStopRoute() {
        setStarted(false);
        setActive(false);

        return PlatformInfoOuterClass.PlatformInfo.newBuilder()
            .setStartSceneTime(getScene().getSceneTime())
            .setStopSceneTime(getScene().getSceneTime())
            .setPosOffset(getPosition().toProto())
            .setRotOffset(MathQuaternionOuterClass.MathQuaternion.newBuilder()
                .setW(1.0F)
                .build())
            .setMovingPlatformType(getMovingPlatformType())
            .build();
    }
}
