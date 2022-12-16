package emu.gingerps.data.excels;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@ResourceType(name = "InvestigationMonsterConfigData.json", loadPriority = ResourceType.LoadPriority.LOW)
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InvestigationMonsterData extends GameResource {
    @Getter(onMethod = @__(@Override))
    int id;
    int cityId;
    List<Integer> monsterIdList;
    List<Integer> groupIdList;
    int rewardPreviewId;
    String mapMarkCreateType;
    String monsterCategory;

    CityData cityData;

    @Override
    public void onLoad() {
        this.cityData = GameData.getCityDataMap().get(cityId);
    }
}
