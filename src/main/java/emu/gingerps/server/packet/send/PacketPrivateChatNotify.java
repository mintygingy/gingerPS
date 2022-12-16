package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo;
import emu.gingerps.net.proto.PrivateChatNotifyOuterClass.PrivateChatNotify;

public class PacketPrivateChatNotify extends BasePacket {
    private ChatInfo info;

    public PacketPrivateChatNotify(int senderId, int recvId, String message) {
        super(PacketOpcodes.PrivateChatNotify);

        ChatInfo info = ChatInfo.newBuilder()
                .setTime((int) (System.currentTimeMillis() / 1000))
                .setUid(senderId)
                .setToUid(recvId)
                .setText(message)
                .build();
        this.info = info;

        PrivateChatNotify proto = PrivateChatNotify.newBuilder()
                .setChatInfo(info)
                .build();

        this.setData(proto);
    }

    public PacketPrivateChatNotify(int senderId, int recvId, int emote) {
        super(PacketOpcodes.PrivateChatNotify);

        ChatInfo info = ChatInfo.newBuilder()
                .setTime((int) (System.currentTimeMillis() / 1000))
                .setUid(senderId)
                .setToUid(recvId)
                .setIcon(emote)
                .build();
        this.info = info;

        PrivateChatNotify proto = PrivateChatNotify.newBuilder()
                .setChatInfo(info)
                .build();

        this.setData(proto);
    }

    public ChatInfo getChatInfo() {
        return this.info;
    }
}
