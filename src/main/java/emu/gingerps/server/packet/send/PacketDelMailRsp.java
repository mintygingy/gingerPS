package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DelMailRspOuterClass.DelMailRsp;

import java.util.ArrayList;
import java.util.List;

public class PacketDelMailRsp  extends BasePacket {

    public PacketDelMailRsp(Player player, List<Integer> toDeleteIds) {
        super(PacketOpcodes.DelMailRsp);

        DelMailRsp proto = DelMailRsp.newBuilder()
        		.addAllMailIdList(toDeleteIds)
        		.build();
        
        this.setData(proto);
    }
}