package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

import emu.gingerps.data.GameData;

public class ItemUseGainFlycloak extends ItemUseInt {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_GAIN_FLYCLOAK;
    }

    public ItemUseGainFlycloak(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
        if (GameData.getAvatarFlycloakDataMap().containsKey(this.i)) {
            params.player.addFlycloak(this.i);
        }
        return true;
    }
}
