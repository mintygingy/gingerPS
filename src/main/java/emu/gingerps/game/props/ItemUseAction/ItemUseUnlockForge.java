package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseUnlockForge extends ItemUseInt {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_UNLOCK_FORGE;
    }

    public ItemUseUnlockForge(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
        return true;
    }

    @Override
    public boolean postUseItem(UseItemParams params) {
        return params.player.getForgingManager().unlockForgingBlueprint(this.i);
    }
}
