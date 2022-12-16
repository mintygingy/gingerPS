package emu.gingerps.command;

import emu.gingerps.game.player.Player;

public interface PermissionHandler {
    public boolean EnablePermissionCommand();
    public boolean checkPermission(Player player, Player targetPlayer, String permissionNode, String permissionNodeTargeted);
}
