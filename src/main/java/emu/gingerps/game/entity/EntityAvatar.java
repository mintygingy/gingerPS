package emu.gingerps.game.entity;

import emu.gingerps.GameConstants;
import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.AvatarData;
import emu.gingerps.data.excels.AvatarSkillDepotData;
import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.inventory.EquipType;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.EntityIdType;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.AbilityControlBlockOuterClass.AbilityControlBlock;
import emu.gingerps.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo;
import emu.gingerps.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo;
import emu.gingerps.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair;
import emu.gingerps.net.proto.ChangeEnergyReasonOuterClass.ChangeEnergyReason;
import emu.gingerps.net.proto.ChangeHpReasonOuterClass.ChangeHpReason;
import emu.gingerps.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo;
import emu.gingerps.net.proto.EntityClientDataOuterClass.EntityClientData;
import emu.gingerps.net.proto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo;
import emu.gingerps.net.proto.PlayerDieTypeOuterClass.PlayerDieType;
import emu.gingerps.net.proto.PropChangeReasonOuterClass.PropChangeReason;
import emu.gingerps.net.proto.PropPairOuterClass.PropPair;
import emu.gingerps.net.proto.ProtEntityTypeOuterClass.ProtEntityType;
import emu.gingerps.net.proto.SceneAvatarInfoOuterClass.SceneAvatarInfo;
import emu.gingerps.net.proto.SceneEntityAiInfoOuterClass.SceneEntityAiInfo;
import emu.gingerps.net.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.gingerps.net.proto.VectorOuterClass.Vector;
import emu.gingerps.server.event.player.PlayerMoveEvent;
import emu.gingerps.server.packet.send.PacketAvatarFightPropUpdateNotify;
import emu.gingerps.server.packet.send.PacketEntityFightPropChangeReasonNotify;
import emu.gingerps.server.packet.send.PacketEntityFightPropUpdateNotify;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.ProtoHelper;
import emu.gingerps.utils.Utils;
import it.unimi.dsi.fastutil.ints.Int2FloatMap;
import lombok.Getter;
import lombok.val;

public class EntityAvatar extends GameEntity {
    @Getter private final Avatar avatar;

    @Getter private PlayerDieType killedType;
    @Getter private int killedBy;

    public EntityAvatar(Avatar avatar) {
        this(null, avatar);
    }

    public EntityAvatar(Scene scene, Avatar avatar) {
        super(scene);
        this.avatar = avatar;
        this.avatar.setCurrentEnergy();
        if (scene != null)
            this.id = getScene().getWorld().getNextEntityId(EntityIdType.AVATAR);

        GameItem weapon = this.getAvatar().getWeapon();
        if (weapon != null) {
            weapon.setWeaponEntityId(getScene().getWorld().getNextEntityId(EntityIdType.WEAPON));
        }
    }

    public Player getPlayer() {return this.avatar.getPlayer();}

    @Override
    public Position getPosition() {return getPlayer().getPosition();}

    @Override
    public Position getRotation() {return getPlayer().getRotation();}

    @Override
    public boolean isAlive() {
        return this.getFightProperty(FightProperty.FIGHT_PROP_CUR_HP) > 0f;
    }

    @Override public Int2FloatMap getFightProperties() {return getAvatar().getFightProperties();}

    public int getWeaponEntityId() {
        if (getAvatar().getWeapon() != null) {
            return getAvatar().getWeapon().getWeaponEntityId();
        }
        return 0;
    }

    @Override
    public void onDeath(int killerId) {
        super.onDeath(killerId); // Invoke super class's onDeath() method.

        this.killedType = PlayerDieType.PLAYER_DIE_TYPE_KILL_BY_MONSTER;
        this.killedBy = killerId;
        clearEnergy(ChangeEnergyReason.CHANGE_ENERGY_REASON_NONE);
    }

    public void onDeath(PlayerDieType dieType, int killerId) {
        super.onDeath(killerId); // Invoke super class's onDeath() method.

        this.killedType = dieType;
        this.killedBy = killerId;
        clearEnergy(ChangeEnergyReason.CHANGE_ENERGY_REASON_NONE);
    }

    @Override
    public float heal(float amount) {
        // Do not heal character if they are dead
        if (!this.isAlive()) {
            return 0f;
        }

        float healed = super.heal(amount);

        if (healed > 0f) {
            getScene().broadcastPacket(
                new PacketEntityFightPropChangeReasonNotify(this, FightProperty.FIGHT_PROP_CUR_HP, healed, PropChangeReason.PROP_CHANGE_REASON_ABILITY, ChangeHpReason.CHANGE_HP_REASON_ADD_ABILITY)
            );
        }

        return healed;
    }

    public void clearEnergy(ChangeEnergyReason reason) {
        // Fight props.
        val curEnergyProp = this.getAvatar().getSkillDepot().getElementType().getCurEnergyProp();
        float curEnergy = this.getFightProperty(curEnergyProp);

        // Set energy to zero.
        this.avatar.setCurrentEnergy(curEnergyProp, 0);

        // Send packets.
        this.getScene().broadcastPacket(new PacketEntityFightPropUpdateNotify(this, curEnergyProp));

        if (reason == ChangeEnergyReason.CHANGE_ENERGY_REASON_SKILL_START) {
            this.getScene().broadcastPacket(new PacketEntityFightPropChangeReasonNotify(this, curEnergyProp, -curEnergy, reason));
        }
    }

    public void addEnergy(float amount, PropChangeReason reason) {
        this.addEnergy(amount, reason, false);
    }
    public void addEnergy(float amount, PropChangeReason reason, boolean isFlat) {
        // Get current and maximum energy for this avatar.
        val elementType = this.getAvatar().getSkillDepot().getElementType();
        val curEnergyProp = elementType.getCurEnergyProp();
        val maxEnergyProp = elementType.getMaxEnergyProp();

        float curEnergy = this.getFightProperty(curEnergyProp);
        float maxEnergy = this.getFightProperty(maxEnergyProp);

        // Scale amount by energy recharge, if the amount is not flat.
        if (!isFlat) {
            amount *= this.getFightProperty(FightProperty.FIGHT_PROP_CHARGE_EFFICIENCY);
        }

        // Determine the new energy value.
        float newEnergy = Math.min(curEnergy + amount, maxEnergy);

        // Set energy and notify.
        if (newEnergy != curEnergy) {
            this.avatar.setCurrentEnergy(curEnergyProp, newEnergy);

            this.getScene().broadcastPacket(new PacketAvatarFightPropUpdateNotify(this.getAvatar(), curEnergyProp));
            this.getScene().broadcastPacket(new PacketEntityFightPropChangeReasonNotify(this, curEnergyProp, newEnergy, reason));
        }
    }

    public SceneAvatarInfo getSceneAvatarInfo() {
        val avatar = this.getAvatar();
        val player = this.getPlayer();
        SceneAvatarInfo.Builder avatarInfo = SceneAvatarInfo.newBuilder()
                .setUid(player.getUid())
                .setAvatarId(avatar.getAvatarId())
                .setGuid(avatar.getGuid())
                .setPeerId(player.getPeerId())
                .addAllTalentIdList(avatar.getTalentIdList())
                .setCoreProudSkillLevel(avatar.getCoreProudSkillLevel())
                .putAllSkillLevelMap(avatar.getSkillLevelMap())
                .setSkillDepotId(avatar.getSkillDepotId())
                .addAllInherentProudSkillList(avatar.getProudSkillList())
                .putAllProudSkillExtraLevelMap(avatar.getProudSkillBonusMap())
                .addAllTeamResonanceList(player.getTeamManager().getTeamResonances())
                .setWearingFlycloakId(avatar.getFlyCloak())
                .setCostumeId(avatar.getCostume())
                .setBornTime(avatar.getBornTime());

        for (GameItem item : avatar.getEquips().values()) {
            if (item.getItemData().getEquipType() == EquipType.EQUIP_WEAPON) {
                avatarInfo.setWeapon(item.createSceneWeaponInfo());
            } else {
                avatarInfo.addReliquaryList(item.createSceneReliquaryInfo());
            }
            avatarInfo.addEquipIdList(item.getItemId());
        }

        return avatarInfo.build();
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
                .setEntityType(ProtEntityType.PROT_ENTITY_TYPE_AVATAR)
                .addAnimatorParaList(AnimatorParameterValueInfoPair.newBuilder())
                .setEntityClientData(EntityClientData.newBuilder())
                .setEntityAuthorityInfo(authority)
                .setLastMoveSceneTimeMs(this.getLastMoveSceneTimeMs())
                .setLastMoveReliableSeq(this.getLastMoveReliableSeq())
                .setLifeState(this.getLifeState().getValue());

        if (this.getScene() != null) {
            entityInfo.setMotionInfo(this.getMotionInfo());
        }

        this.addAllFightPropsToEntityInfo(entityInfo);

        PropPair pair = PropPair.newBuilder()
                .setType(PlayerProperty.PROP_LEVEL.getId())
                .setPropValue(ProtoHelper.newPropValue(PlayerProperty.PROP_LEVEL, getAvatar().getLevel()))
                .build();
        entityInfo.addPropList(pair);

        entityInfo.setAvatar(this.getSceneAvatarInfo());

        return entityInfo.build();
    }

    public AbilityControlBlock getAbilityControlBlock() {
        AvatarData data = this.getAvatar().getAvatarData();
        AbilityControlBlock.Builder abilityControlBlock = AbilityControlBlock.newBuilder();
        int embryoId = 0;

        // Add avatar abilities
        if (data.getAbilities() != null) {
            for (int id : data.getAbilities()) {
                AbilityEmbryo emb = AbilityEmbryo.newBuilder()
                        .setAbilityId(++embryoId)
                        .setAbilityNameHash(id)
                        .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_NAME)
                        .build();
                abilityControlBlock.addAbilityEmbryoList(emb);
            }
        }
        // Add default abilities
        for (int id : GameConstants.DEFAULT_ABILITY_HASHES) {
            AbilityEmbryo emb = AbilityEmbryo.newBuilder()
                    .setAbilityId(++embryoId)
                    .setAbilityNameHash(id)
                    .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_NAME)
                    .build();
            abilityControlBlock.addAbilityEmbryoList(emb);
        }
        // Add team resonances
        for (int id : this.getPlayer().getTeamManager().getTeamResonancesConfig()) {
            AbilityEmbryo emb = AbilityEmbryo.newBuilder()
                    .setAbilityId(++embryoId)
                    .setAbilityNameHash(id)
                    .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_NAME)
                    .build();
            abilityControlBlock.addAbilityEmbryoList(emb);
        }
        // Add skill depot abilities
        AvatarSkillDepotData skillDepot = GameData.getAvatarSkillDepotDataMap().get(this.getAvatar().getSkillDepotId());
        if (skillDepot != null && skillDepot.getAbilities() != null) {
            for (int id : skillDepot.getAbilities()) {
                AbilityEmbryo emb = AbilityEmbryo.newBuilder()
                        .setAbilityId(++embryoId)
                        .setAbilityNameHash(id)
                        .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_NAME)
                        .build();
                abilityControlBlock.addAbilityEmbryoList(emb);
            }
        }
        // Add equip abilities
        if (this.getAvatar().getExtraAbilityEmbryos().size() > 0) {
            for (String skill : this.getAvatar().getExtraAbilityEmbryos()) {
                AbilityEmbryo emb = AbilityEmbryo.newBuilder()
                        .setAbilityId(++embryoId)
                        .setAbilityNameHash(Utils.abilityHash(skill))
                        .setAbilityOverrideNameHash(GameConstants.DEFAULT_ABILITY_NAME)
                        .build();
                abilityControlBlock.addAbilityEmbryoList(emb);
            }
        }

        //
        return abilityControlBlock.build();
    }

    /**
     * Move this entity to a new position.
     * Additionally invoke player move event.
     * @param newPosition The new position.
     * @param rotation The new rotation.
     */
    @Override public void move(Position newPosition, Position rotation) {
        // Invoke player move event.
        PlayerMoveEvent event = new PlayerMoveEvent(
            this.getPlayer(), PlayerMoveEvent.MoveType.PLAYER,
            this.getPosition(), newPosition
        ); event.call();

        // Set position and rotation.
        super.move(event.getDestination(), rotation);
    }
}
