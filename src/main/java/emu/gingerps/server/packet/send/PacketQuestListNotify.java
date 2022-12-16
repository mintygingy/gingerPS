package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.QuestManager;
import emu.gingerps.game.quest.enums.QuestState;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.QuestListNotifyOuterClass.QuestListNotify;

public class PacketQuestListNotify extends BasePacket {

    public PacketQuestListNotify(Player player) {
        super(PacketOpcodes.QuestListNotify, true);

        QuestListNotify.Builder proto = QuestListNotify.newBuilder();

        player.getQuestManager().forEachQuest(quest -> {
            if (quest.getState() != QuestState.QUEST_STATE_UNSTARTED) {
                proto.addQuestList(quest.toProto());
            }
        });

        this.setData(proto);
    }
}
