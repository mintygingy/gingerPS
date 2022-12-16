package emu.gingerps.server.packet.send;

import emu.gingerps.data.GameData;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PersonalLineAllDataRspOuterClass;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PacketPersonalLineAllDataRsp extends BasePacket {

    public PacketPersonalLineAllDataRsp(Collection<GameMainQuest> gameMainQuestList) {
        super(PacketOpcodes.PersonalLineAllDataRsp);

        var proto = PersonalLineAllDataRspOuterClass.PersonalLineAllDataRsp.newBuilder();

        var questList = gameMainQuestList.stream()
            .map(GameMainQuest::getChildQuests)
            .map(Map::values)
            .flatMap(Collection::stream)
            .map(GameQuest::getSubQuestId)
            .collect(Collectors.toSet());

        GameData.getPersonalLineDataMap().values().stream()
            .filter(i -> !questList.contains(i.getStartQuestId()))
            .forEach(i -> proto.addCanBeUnlockedPersonalLineList(i.getId()));

        this.setData(proto);
    }
}
