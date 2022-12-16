package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseAddReliquaryExp extends ItemUseAddExp {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_ADD_RELIQUARY_EXP;
    }

    public ItemUseAddReliquaryExp(String[] useParam) {
        super(useParam);
    }
}
