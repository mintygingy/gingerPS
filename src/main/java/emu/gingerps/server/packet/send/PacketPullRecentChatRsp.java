package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.GameConstants;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo;
import emu.gingerps.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp;
import emu.gingerps.utils.Utils;

import static emu.gingerps.config.Configuration.*;

import java.util.List;

public class PacketPullRecentChatRsp extends BasePacket {
    public PacketPullRecentChatRsp(List<ChatInfo> messages) {
        super(PacketOpcodes.PullRecentChatRsp);

        PullRecentChatRsp.Builder proto = PullRecentChatRsp.newBuilder()
            .addAllChatInfo(messages);

        this.setData(proto);
    }
}
