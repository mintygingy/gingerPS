package emu.gingerps.game.entity.gadget;

import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;

public abstract class GadgetContent {
	private final EntityGadget gadget;

	public GadgetContent(EntityGadget gadget) {
		this.gadget = gadget;
	}

	public EntityGadget getGadget() {
		return gadget;
	}
	
	public abstract boolean onInteract(Player player, GadgetInteractReq req);
	
	public abstract void onBuildProto(SceneGadgetInfo.Builder gadgetInfo);
}
