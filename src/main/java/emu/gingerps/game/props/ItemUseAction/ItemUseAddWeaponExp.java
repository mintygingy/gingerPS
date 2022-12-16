package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseAddWeaponExp extends ItemUseAddExp {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_ADD_WEAPON_EXP;
    }

    public ItemUseAddWeaponExp(String[] useParam) {
        super(useParam);
    }
}
