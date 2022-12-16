package emu.gingerps.server.packet.send;

import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify;

public class PacketQuestProgressUpdateNotify extends BasePacket {

    public PacketQuestProgressUpdateNotify(GameQuest quest) {
        super(PacketOpcodes.QuestProgressUpdateNotify);

        QuestProgressUpdateNotify.Builder proto = QuestProgressUpdateNotify.newBuilder().setQuestId(quest.getSubQuestId());

        if (quest.getFinishProgressList() != null) {
            for (int i : quest.getFinishProgressList()) {
                proto.addFinishProgressList(i);
            }
        }

        if (quest.getFailProgressList() != null) {
            for (int i : quest.getFailProgressList()) {
                proto.addFailProgressList(i);
            }
        }

        this.setData(proto);
    }
}
