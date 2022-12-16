package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumRspOuterClass.QueryCodexMonsterBeKilledNumRsp;

import java.util.List;

public class PacketQueryCodexMonsterBeKilledNumRsp extends BasePacket {

    public PacketQueryCodexMonsterBeKilledNumRsp(Player player, List<Integer> codexList) {
        super(PacketOpcodes.QueryCodexMonsterBeKilledNumRsp);
        QueryCodexMonsterBeKilledNumRsp.Builder proto = QueryCodexMonsterBeKilledNumRsp.newBuilder();

        codexList.forEach(animal -> {
            if (player.getCodex().getUnlockedAnimal().containsKey(animal)) {
                proto.addCodexIdList(animal)
                    .addBeKilledNumList(player.getCodex().getUnlockedAnimal().get(animal))
                    .addBeCapturedNumList(0);
            }
        });

        this.setData(proto);
    }
}
