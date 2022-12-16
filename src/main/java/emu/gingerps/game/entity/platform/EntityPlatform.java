package emu.gingerps.game.entity.platform;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ConfigGadget;
import emu.gingerps.data.excels.GadgetData;
import emu.gingerps.game.entity.EntityBaseGadget;
import emu.gingerps.game.entity.EntityClientGadget;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.EntityIdType;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.*;
import emu.gingerps.utils.Position;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;

public class EntityPlatform extends EntityBaseGadget {
    @Getter
    private final Player owner;
    @Getter(onMethod = @__(@Override))
    private final int gadgetId;
    @Getter
    private final EntityClientGadget gadget;
    @Getter(onMethod = @__(@Override))
    private final Int2FloatMap fightProperties;
    @Nullable
    @Getter
    private ConfigGadget configGadget;
    @Getter
    private final MovingPlatformTypeOuterClass.MovingPlatformType movingPlatformType;
    @Getter
    @Setter
    private boolean isStarted;
    @Getter
    @Setter
    private boolean isActive;

    public EntityPlatform(EntityClientGadget gadget, Scene scene, Player player, int gadgetId, Position pos, Position rot, MovingPlatformTypeOuterClass.MovingPlatformType movingPlatformType) {
        super(scene, pos, rot);
        this.gadget = gadget;
        this.owner = player;
        this.id = getScene().getWorld().getNextEntityId(EntityIdType.GADGET);
        this.fightProperties = new Int2FloatOpenHashMap();
        this.movingPlatformType = movingPlatformType;
        this.gadgetId = gadgetId;
        GadgetData data = GameData.getGadgetDataMap().get(gadgetId);
        if (data != null && data.getJsonName() != null) {
            this.configGadget = GameData.getGadgetConfigData().get(data.getJsonName());
        }

        fillFightProps(configGadget);
    }

    @Override
    public SceneEntityInfoOuterClass.SceneEntityInfo toProto() {
        var platform = PlatformInfoOuterClass.PlatformInfo.newBuilder()
            .setMovingPlatformType(movingPlatformType)
            .build();

        var gadgetInfo = SceneGadgetInfoOuterClass.SceneGadgetInfo.newBuilder()
            .setGadgetId(getGadgetId())
            .setAuthorityPeerId(getOwner().getPeerId())
            .setPlatform(platform);

        var entityInfo = SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder()
            .setEntityId(getId())
            .setEntityType(ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_GADGET)
            .setGadget(gadgetInfo)
            .setLifeState(1);

        this.addAllFightPropsToEntityInfo(entityInfo);
        return entityInfo.build();
    }

    public PlatformInfoOuterClass.PlatformInfo onStartRoute() {
        return PlatformInfoOuterClass.PlatformInfo.newBuilder()
            .setStartSceneTime(getScene().getSceneTime())
            .setIsStarted(true)
            .setPosOffset(getPosition().toProto())
            .setMovingPlatformType(getMovingPlatformType())
            .setIsActive(true)
            .build();
    }

    public PlatformInfoOuterClass.PlatformInfo onStopRoute() {
        var sceneTime = getScene().getSceneTime();
        return PlatformInfoOuterClass.PlatformInfo.newBuilder()
            .setStartSceneTime(sceneTime)
            .setStopSceneTime(sceneTime)
            .setPosOffset(getPosition().toProto())
            .setMovingPlatformType(getMovingPlatformType())
            .build();
    }
}
