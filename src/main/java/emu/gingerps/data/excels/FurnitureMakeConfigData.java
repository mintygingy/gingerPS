package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.common.ItemParamData;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"FurnitureMakeExcelConfigData.json"})
public class FurnitureMakeConfigData extends GameResource {

    int configID;
    int furnitureItemID;
    int count;
    int exp;
    List<ItemParamData> materialItems;
    int makeTime;
    int maxAccelerateTime;
    int quickFetchMaterialNum;

    @Override
    public int getId() {
        return configID;
    }

    @Override
    public void onLoad() {
        this.materialItems = materialItems.stream()
                .filter(x -> x.getId() > 0)
                .toList();
    }
}
