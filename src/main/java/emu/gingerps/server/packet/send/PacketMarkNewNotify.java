package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.*;

import java.util.ArrayList;
import java.util.List;

public class PacketMarkNewNotify extends BasePacket {

    public PacketMarkNewNotify(Player player, int markNewType, ArrayList<Integer> idList) {
        super(PacketOpcodes.MarkNewNotify);

        MarkNewNotifyOuterClass.MarkNewNotify.Builder proto = MarkNewNotifyOuterClass.MarkNewNotify.newBuilder();
        proto.setMarkNewType(markNewType);
        for (Integer id: idList) {
            proto.addIdList(id);
        }

        MarkNewNotifyOuterClass.MarkNewNotify data = proto.build();
        this.setData(data);
    }
}