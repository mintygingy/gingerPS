package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = "WorldLevelExcelConfigData.json")
public class WorldLevelData extends GameResource {
	private int level;
	private int monsterLevel;
	    
	@Override
	public int getId() {
		return this.level;
	}

	public int getMonsterLevel() {
		return monsterLevel;
	}

	@Override
	public void onLoad() {
		
	}
}
