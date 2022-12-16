package emu.gingerps.game.props.ItemUseAction;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.ItemUseTarget;

public class UseItemParams {
    // Don't want to change 40 method signatures when this gets extended!
    public Player player;
    public ItemUseTarget itemUseTarget;
    public Avatar targetAvatar = null;
    public int count = 1;
    public int optionId = 0;
    public boolean isEnterMpDungeonTeam = false;
    public int usedItemId = 0;

    public UseItemParams(Player player, ItemUseTarget itemUseTarget, Avatar targetAvatar, int count, int optionId, boolean isEnterMpDungeonTeam) {
        this.player = player;
        this.itemUseTarget = itemUseTarget;
        this.targetAvatar = targetAvatar;
        this.count = count;
        this.optionId = optionId;
        this.isEnterMpDungeonTeam = isEnterMpDungeonTeam;
    }

    public UseItemParams(Player player, ItemUseTarget itemUseTarget) {
        this.player = player;
        this.itemUseTarget = itemUseTarget;
    }
}
