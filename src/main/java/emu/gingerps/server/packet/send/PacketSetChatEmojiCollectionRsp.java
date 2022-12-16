package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketSetChatEmojiCollectionRsp extends BasePacket {
    public PacketSetChatEmojiCollectionRsp() {
        super(PacketOpcodes.SetChatEmojiCollectionRsp);
    }
}
