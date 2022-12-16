package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetChatEmojiCollectionReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetChatEmojiCollectionRsp;

@Opcodes(PacketOpcodes.SetChatEmojiCollectionReq)
public class HandlerSetChatEmojiCollectionReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = SetChatEmojiCollectionReqOuterClass.SetChatEmojiCollectionReq.parseFrom(payload);

        session.getPlayer().setChatEmojiIdList(req.getChatEmojiCollectionData().getEmojiIdListList());
        session.send(new PacketSetChatEmojiCollectionRsp());
    }
}
