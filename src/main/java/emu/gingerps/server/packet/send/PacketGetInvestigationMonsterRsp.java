package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.WorldDataSystem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetActivityInfoRspOuterClass;
import emu.gingerps.net.proto.GetInvestigationMonsterRspOuterClass;

import java.util.List;

public class PacketGetInvestigationMonsterRsp extends BasePacket {

    public PacketGetInvestigationMonsterRsp(Player player, WorldDataSystem worldDataManager, List<Integer> cityIdListList) {

        super(PacketOpcodes.GetInvestigationMonsterRsp);

        var resp = GetInvestigationMonsterRspOuterClass.GetInvestigationMonsterRsp.newBuilder();

        cityIdListList.forEach(id -> resp.addAllMonsterList(worldDataManager.getInvestigationMonstersByCityId(player, id)));


        this.setData(resp.build());
    }
}
