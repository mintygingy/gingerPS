package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.game.props.ElementType;

@ResourceType(name = "WorldAreaConfigData.json")
public class WorldAreaData extends GameResource {
	private int ID;
	private int AreaID1;
	private int AreaID2;
	private int SceneID;
	private ElementType elementType;
	    
	@Override
	public int getId() {
		return (this.AreaID2 << 16) + this.AreaID1;
	}
	
	public int getSceneID() {
		return this.SceneID;
	}
	
	public ElementType getElementType() {
		return this.elementType;
	}

	@Override
	public void onLoad() {
		
	}
}
