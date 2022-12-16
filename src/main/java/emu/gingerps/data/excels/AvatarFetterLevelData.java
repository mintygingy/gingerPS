package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = "AvatarFettersLevelExcelConfigData.json")
public class AvatarFetterLevelData extends GameResource {
	private int fetterLevel;
	private int needExp;
	
	@Override
	public int getId() {
		return this.fetterLevel;
	}
	
	public int getLevel() {
		return fetterLevel;
	}
	
	public int getExp() {
		return needExp;
	}
}
