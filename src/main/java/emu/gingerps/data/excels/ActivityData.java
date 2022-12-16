package emu.gingerps.data.excels;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Objects;

@ResourceType(name = "NewActivityExcelConfigData.json", loadPriority = ResourceType.LoadPriority.LOW)
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivityData extends GameResource {
    int activityId;
    String activityType;
    List<Integer> condGroupId;
    List<Integer> watcherId;
    List<ActivityWatcherData> watcherDataList;

    @Override
    public int getId() {
        return this.activityId;
    }
    @Override
    public void onLoad() {
        this.watcherDataList = watcherId.stream().map(item -> GameData.getActivityWatcherDataMap().get(item.intValue()))
            .filter(Objects::nonNull)
            .toList();
    }

}
