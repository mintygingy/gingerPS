package emu.gingerps.data.excels;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.common.CurveInfo;

@ResourceType(name = "AvatarCurveExcelConfigData.json")
public class AvatarCurveData extends GameResource {
	private int level;
	private CurveInfo[] curveInfos;
    
    private Map<String, Float> curveInfoMap;
	
	@Override
	public int getId() {
		return this.level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public Map<String, Float> getCurveInfos() {
		return curveInfoMap;
	}
	
	@Override
	public void onLoad() {
		this.curveInfoMap = new HashMap<>();
		Stream.of(this.curveInfos).forEach(info -> this.curveInfoMap.put(info.getType(), info.getValue()));
	}
}
