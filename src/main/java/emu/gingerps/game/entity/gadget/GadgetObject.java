package emu.gingerps.game.entity.gadget;

import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass;

public class GadgetObject extends GadgetContent{
    public GadgetObject(EntityGadget gadget) {
        super(gadget);
    }

    @Override
    public boolean onInteract(Player player, GadgetInteractReqOuterClass.GadgetInteractReq req) {
        return false;
    }

    @Override
    public void onBuildProto(SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder gadgetInfo) {

    }
}
