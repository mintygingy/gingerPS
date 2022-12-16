package emu.gingerps.data.excels;

import java.util.List;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.ResourceType.LoadPriority;
import emu.gingerps.data.common.ItemParamData;
import lombok.Getter;

@ResourceType(name = {"CookRecipeExcelConfigData.json"}, loadPriority = LoadPriority.LOW)
@Getter
public class CookRecipeData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;

    private int rankLevel;
    private boolean isDefaultUnlocked;
    private int maxProficiency;

    private List<ItemParamData> qualityOutputVec;
    private List<ItemParamData> inputVec;
}
