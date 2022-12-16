package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.ResourceType.LoadPriority;
import emu.gingerps.game.props.ElementType;
import lombok.Getter;

@ResourceType(name = "AvatarSkillExcelConfigData.json", loadPriority = LoadPriority.HIGHEST)
@Getter
public class AvatarSkillData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private float cdTime;
    private int costElemVal;
    private int maxChargeNum;
    private int triggerID;
    private boolean isAttackCameraLock;
    private int proudSkillGroupId;
    private ElementType costElemType;
    private long nameTextMapHash;
    private long descTextMapHash;
    private String abilityName;
}
