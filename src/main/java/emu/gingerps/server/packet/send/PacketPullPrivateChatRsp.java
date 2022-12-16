package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo;
import emu.gingerps.net.proto.PullPrivateChatRspOuterClass.PullPrivateChatRsp;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;

public class PacketPullPrivateChatRsp extends BasePacket {

    public PacketPullPrivateChatRsp(List<ChatInfo> history) {
        super(PacketOpcodes.PullPrivateChatRsp);

        PullPrivateChatRsp.Builder builder = PullPrivateChatRsp.newBuilder();

        if (history == null) {
            builder.setRetcode(Retcode.RET_FAIL_VALUE);
        }
        else {
            for (var info : history) {
                builder.addChatInfo(info);
            }
        }

        this.setData(builder.build());
    }
}
