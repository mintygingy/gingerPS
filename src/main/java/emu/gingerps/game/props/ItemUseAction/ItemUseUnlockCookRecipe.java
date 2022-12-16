package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseUnlockCookRecipe extends ItemUseInt {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_UNLOCK_COOK_RECIPE;
    }

    public ItemUseUnlockCookRecipe(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
        return true;
    }

    @Override
    public boolean postUseItem(UseItemParams params) {
        return params.player.getCookingManager().unlockRecipe(this.i);
    }
}
