package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseGainNameCard extends ItemUseAction {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_GAIN_NAME_CARD;
    }

    public ItemUseGainNameCard(String[] useParam) {
    }

    @Override
    public boolean useItem(UseItemParams params) {
        params.player.addNameCard(params.usedItemId);
        return true;
    }
}
