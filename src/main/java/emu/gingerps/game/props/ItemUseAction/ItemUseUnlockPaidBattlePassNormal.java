package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseUnlockPaidBattlePassNormal extends ItemUseAction {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_UNLOCK_PAID_BATTLE_PASS_NORMAL;
    }

    public ItemUseUnlockPaidBattlePassNormal(String[] useParam) {
    }

    @Override
    public boolean useItem(UseItemParams params) {
        // TODO: add paid BP
        //return params.player.getBattlePassManager().setPaid(true);
        return false;
    }
}
