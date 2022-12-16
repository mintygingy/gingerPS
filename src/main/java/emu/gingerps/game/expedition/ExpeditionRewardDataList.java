package emu.gingerps.game.expedition;

import java.util.ArrayList;
import java.util.List;

import emu.gingerps.game.inventory.GameItem;
import lombok.Getter;

public class ExpeditionRewardDataList {
    @Getter private int hourTime;
    @Getter private List<ExpeditionRewardData> expeditionRewardData;

    public List<GameItem> getRewards() {
        List<GameItem> rewards = new ArrayList<>();
        if (expeditionRewardData != null) {
            expeditionRewardData.forEach(data -> rewards.add(data.getReward()));
        }
        return rewards;
    }
}
