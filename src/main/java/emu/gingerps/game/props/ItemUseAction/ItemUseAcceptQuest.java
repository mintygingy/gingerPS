package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.props.ItemUseOp;

public class ItemUseAcceptQuest extends ItemUseInt {
    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_ACCEPT_QUEST;
    }

    public ItemUseAcceptQuest(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
        return (params.player.getQuestManager().addQuest(this.i) != null);
    }
}
