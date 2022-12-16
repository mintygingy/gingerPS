package emu.gingerps.data.excels;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameDepot;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceLoader.AvatarConfig;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.ResourceType.LoadPriority;
import emu.gingerps.data.binout.AbilityEmbryoEntry;
import emu.gingerps.game.props.ElementType;
import emu.gingerps.utils.Utils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import lombok.Getter;

@ResourceType(name = "AvatarSkillDepotExcelConfigData.json", loadPriority = LoadPriority.HIGH)
@Getter
public class AvatarSkillDepotData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private int energySkill;
    private int attackModeSkill;

    private List<Integer> skills;
    private List<Integer> subSkills;
    private List<String> extraAbilities;
    private List<Integer> talents;
    private List<InherentProudSkillOpens> inherentProudSkillOpens;

    private String talentStarName;
    private String skillDepotAbilityGroup;

    // Transient
    private AvatarSkillData energySkillData;
    private ElementType elementType;
    private IntList abilities;
    private int talentCostItemId;

    public void setAbilities(AbilityEmbryoEntry info) {
        this.abilities = new IntArrayList(info.getAbilities().length);
        for (String ability : info.getAbilities()) {
            this.abilities.add(Utils.abilityHash(ability));
        }
    }

    @Override
    public void onLoad() {
        // Set energy skill data
        this.energySkillData = GameData.getAvatarSkillDataMap().get(this.energySkill);
        if (this.energySkillData != null) {
            this.elementType = this.energySkillData.getCostElemType();
        } else {
            this.elementType = ElementType.None;
        }
        // Set embryo abilities (if player skill depot)
        if (getSkillDepotAbilityGroup() != null && getSkillDepotAbilityGroup().length() > 0) {
            AvatarConfig config = GameDepot.getPlayerAbilities().get(getSkillDepotAbilityGroup());

            if (config != null) {
                this.setAbilities(new AbilityEmbryoEntry(getSkillDepotAbilityGroup(), config.abilities.stream().map(Object::toString).toArray(String[]::new)));
            }
        }

        // Get constellation item from GameData
        Optional.ofNullable(this.talents)
            .map(talents -> talents.get(0))
            .map(i -> GameData.getAvatarTalentDataMap().get((int) i))
            .map(talentData -> talentData.getMainCostItemId())
            .ifPresent(itemId -> this.talentCostItemId = itemId);
    }

    @Getter
    public static class InherentProudSkillOpens {
        private int proudSkillGroupId;
        private int needAvatarPromoteLevel;
    }

    public IntStream getSkillsAndEnergySkill() {
        return IntStream.concat(this.skills.stream().mapToInt(i -> i), IntStream.of(this.energySkill))
                        .filter(skillId -> skillId > 0);
    }
}
