package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.common.ItemParamData;
import lombok.Getter;

import java.util.List;

@ResourceType(name = {"CompoundExcelConfigData.json"},loadPriority = ResourceType.LoadPriority.LOW)
@Getter
public class CompoundData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private int groupId;
    private int rankLevel;
    private boolean isDefaultUnlocked;
    private int costTime;
    private int queueSize;
    private List<ItemParamData> inputVec;
    private List<ItemParamData> outputVec;
}
