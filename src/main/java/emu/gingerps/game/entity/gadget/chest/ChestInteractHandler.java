package emu.gingerps.game.entity.gadget.chest;

import emu.gingerps.game.entity.gadget.GadgetChest;
import emu.gingerps.game.player.Player;

public interface ChestInteractHandler {

    boolean isTwoStep();

    boolean onInteract(GadgetChest chest, Player player);
}
