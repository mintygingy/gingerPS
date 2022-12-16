package emu.gingerps.data.excels;

import java.util.List;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.common.ItemParamData;

@ResourceType(name = "EnvAnimalGatherExcelConfigData.json", loadPriority = ResourceType.LoadPriority.LOW)
public class EnvAnimalGatherConfigData extends GameResource {
    private int animalId;
    private String entityType;
    private List<ItemParamData> gatherItemId;
    private String excludeWeathers;
    private int aliveTime;
    private int escapeTime;
    private int escapeRadius;

    @Override
    public int getId() {
        return animalId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getEntityType() {
        return entityType;
    }

    public ItemParamData getGatherItem() {
        return gatherItemId.size() > 0 ? gatherItemId.get(0) : null;
    }
}
