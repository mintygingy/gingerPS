package emu.gingerps.data.excels;

import java.util.List;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.ResourceType.LoadPriority;
import emu.gingerps.data.common.ItemParamData;
import lombok.Getter;

@ResourceType(name = {"ForgeExcelConfigData.json"}, loadPriority = LoadPriority.HIGHEST)
@Getter
public class ForgeData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private int playerLevel;
    private int forgeType;
    private int showItemId;
    private int resultItemId;
    private int resultItemCount;
    private int forgeTime;
    private int queueNum;
    private int scoinCost;
    private int priority;
    private int forgePoint;
    private List<ItemParamData> materialItems;
}
