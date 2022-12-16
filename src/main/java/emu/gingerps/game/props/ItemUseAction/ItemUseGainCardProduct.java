package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseGainCardProduct extends ItemUseAction {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_GAIN_CARD_PRODUCT;
    }

    public ItemUseGainCardProduct(String[] useParam) {
    }

    @Override
    public boolean useItem(UseItemParams params) {
        return params.player.rechargeMoonCard();
    }
}
