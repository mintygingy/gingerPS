package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

import emu.gingerps.data.GameData;

public class ItemUseGainCostume extends ItemUseInt {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_GAIN_COSTUME;
    }

    public ItemUseGainCostume(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
        if (GameData.getAvatarCostumeDataMap().containsKey(this.i)) {
            params.player.addCostume(this.i);
        }
        return true;
    }
}
