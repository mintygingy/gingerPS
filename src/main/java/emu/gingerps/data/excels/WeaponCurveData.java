package emu.gingerps.data.excels;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.common.CurveInfo;

@ResourceType(name = "WeaponCurveExcelConfigData.json")
public class WeaponCurveData extends GameResource {
	private int level;
    private CurveInfo[] curveInfos;
    
    private Map<String, Float> curveInfosMap;
	
	@Override
	public int getId() {
		return level;
	}
	
	public float getMultByProp(String fightProp) {
		return curveInfosMap.getOrDefault(fightProp, 1f);
	}

	@Override
	public void onLoad() {
		this.curveInfosMap = new HashMap<>();
		Stream.of(this.curveInfos).forEach(info -> this.curveInfosMap.put(info.getType(), info.getValue()));
	}
}
