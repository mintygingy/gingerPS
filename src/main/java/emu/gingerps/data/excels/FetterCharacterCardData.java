package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.ResourceType.LoadPriority;

@ResourceType(name = "FetterCharacterCardExcelConfigData.json", loadPriority = LoadPriority.HIGHEST)
public class FetterCharacterCardData extends GameResource {
    private int avatarId;
    private int rewardId;

    @Override
	public int getId() {
		return avatarId;
	}

    public int getRewardId() {
        return rewardId;
    }

    @Override
    public void onLoad() {
    }
}
