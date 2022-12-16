package emu.gingerps.server.packet.send;

import emu.gingerps.data.GameData;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify;

public class PacketCodexDataUpdateNotify extends BasePacket {
    public PacketCodexDataUpdateNotify(GameMainQuest quest) {
        super(PacketOpcodes.CodexDataUpdateNotify, true);
        var codexQuest = GameData.getCodexQuestDataIdMap().get(quest.getParentQuestId());
        if(codexQuest != null){
            CodexDataUpdateNotify proto = CodexDataUpdateNotify.newBuilder()
                    .setTypeValue(1)
                    .setId(codexQuest.getId())
                    .build();
            this.setData(proto);
        }
    }

    public PacketCodexDataUpdateNotify(int typeValue, int codexId){
        super(PacketOpcodes.CodexDataUpdateNotify, true);
        CodexDataUpdateNotify proto = CodexDataUpdateNotify.newBuilder()
                .setTypeValue(typeValue)
                .setId(codexId)
                .build();
        this.setData(proto);
    }
}
