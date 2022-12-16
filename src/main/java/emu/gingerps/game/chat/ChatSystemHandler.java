package emu.gingerps.game.chat;

import emu.gingerps.game.player.Player;
import emu.gingerps.server.game.GameServer;

public interface ChatSystemHandler {
    GameServer getServer();
    void sendPrivateMessage(Player player, int targetUid, String message);
    void sendPrivateMessage(Player player, int targetUid, int emote);
    void sendTeamMessage(Player player, int channel, String message);
    void sendTeamMessage(Player player, int channel, int icon);
    void sendPrivateMessageFromServer(int targetUid, String message);
    void sendPrivateMessageFromServer(int targetUid, int emote);
    void handlePullPrivateChatReq(Player player, int targetUid);
    void clearHistoryOnLogout(Player player);
    void handlePullRecentChatReq(Player player);
}
