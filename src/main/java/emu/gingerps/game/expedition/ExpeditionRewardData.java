package emu.gingerps.game.expedition;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.utils.Utils;
import lombok.Getter;

public class ExpeditionRewardData {
    @Getter private int itemId;
    @Getter private int minCount;
    @Getter private int maxCount;

    public GameItem getReward() {
        return new GameItem(itemId, Utils.randomRange(minCount, maxCount));
    }
}
