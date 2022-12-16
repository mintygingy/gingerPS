package emu.gingerps.data.excels;

import java.util.Arrays;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

import lombok.Getter;
import emu.gingerps.data.ResourceType.LoadPriority;
import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.data.common.ItemParamStringData;

@ResourceType(name = "RewardPreviewExcelConfigData.json", loadPriority = LoadPriority.HIGH)
public class RewardPreviewData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private ItemParamStringData[] previewItems;
    private ItemParamData[] previewItemsArray;

    public ItemParamData[] getPreviewItems() {
        return previewItemsArray;
    }

    @Override
    public void onLoad() {
        if (this.previewItems != null && this.previewItems.length > 0) {
            this.previewItemsArray = Arrays.stream(this.previewItems)
                    .filter(d -> d.getId() > 0 && d.getCount() != null && !d.getCount().isEmpty())
                    .map(ItemParamStringData::toItemParamData)
                    .toArray(size -> new ItemParamData[size]);
        } else {
            this.previewItemsArray = new ItemParamData[0];
        }
    }
}
