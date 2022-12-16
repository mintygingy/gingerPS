package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChatEmojiCollectionDataOuterClass;
import emu.gingerps.net.proto.GetChatEmojiCollectionRspOuterClass;

import java.util.List;

public class PacketGetChatEmojiCollectionRsp extends BasePacket {
    public PacketGetChatEmojiCollectionRsp(List<Integer> emojiIds) {
        super(PacketOpcodes.GetChatEmojiCollectionRsp);

        var rsp = GetChatEmojiCollectionRspOuterClass.GetChatEmojiCollectionRsp.newBuilder()
            .setChatEmojiCollectionData(ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.newBuilder()
                .addAllEmojiIdList(emojiIds)
                .build());

        this.setData(rsp);
    }
}
