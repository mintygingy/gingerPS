package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"HomeworldLevelExcelConfigData.json"})
public class HomeWorldLevelData extends GameResource {

    int level;
    int exp;
    int homeCoinStoreLimit;
    int homeFetterExpStoreLimit;
    int rewardId;
    int furnitureMakeSlotCount;
    int outdoorUnlockBlockCount;
    int freeUnlockModuleCount;
    int deployNpcCount;
    int limitShopGoodsCount;
    List<String> levelFuncs;

    @Override
    public int getId() {
        return level;
    }
}
