package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = "AvatarLevelExcelConfigData.json")
public class AvatarLevelData extends GameResource {
	private int level;
	private int exp;
	
	@Override
	public int getId() {
		return this.level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExp() {
		return exp;
	}
}
