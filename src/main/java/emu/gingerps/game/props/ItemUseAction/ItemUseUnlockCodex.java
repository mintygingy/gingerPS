package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseUnlockCodex extends ItemUseInt {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_UNLOCK_CODEX;
    }

    public ItemUseUnlockCodex(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
        return false;
    }
}
