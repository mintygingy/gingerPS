package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify;

import java.util.List;
import java.util.Set;

public class PacketServerCondMeetQuestListUpdateNotify extends BasePacket {

    public PacketServerCondMeetQuestListUpdateNotify(Player player) {
        super(PacketOpcodes.ServerCondMeetQuestListUpdateNotify);

        ServerCondMeetQuestListUpdateNotify.Builder proto = ServerCondMeetQuestListUpdateNotify.newBuilder();

        /*
        player.getQuestManager().forEachQuest(quest -> {
            if (quest.getState().getValue() <= 2) {
                proto.addAddQuestIdList(quest.getQuestId());
            }
        });
        */

        this.setData(proto);
    }

    public PacketServerCondMeetQuestListUpdateNotify(List<GameQuest> quests) {
        super(PacketOpcodes.ServerCondMeetQuestListUpdateNotify);

        ServerCondMeetQuestListUpdateNotify.Builder proto = ServerCondMeetQuestListUpdateNotify.newBuilder();
        for (GameQuest quest : quests) {
            proto.addAddQuestIdList(quest.getSubQuestId());
        }
        proto.build();

        this.setData(proto);
    }

    public PacketServerCondMeetQuestListUpdateNotify() {
        super(PacketOpcodes.ServerCondMeetQuestListUpdateNotify);

        ServerCondMeetQuestListUpdateNotify.Builder proto = ServerCondMeetQuestListUpdateNotify.newBuilder();
        proto.build();

        this.setData(proto);
    }
}
