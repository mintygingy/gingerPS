package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.enums.ParentQuestState;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FinishedParentQuestNotifyOuterClass.FinishedParentQuestNotify;

public class PacketFinishedParentQuestNotify extends BasePacket {

    public PacketFinishedParentQuestNotify(Player player) {
        super(PacketOpcodes.FinishedParentQuestNotify, true);

        FinishedParentQuestNotify.Builder proto = FinishedParentQuestNotify.newBuilder();

        for (GameMainQuest mainQuest : player.getQuestManager().getMainQuests().values()) {
            //Canceled Quests do not appear in this packet
            if (mainQuest.getState() != ParentQuestState.PARENT_QUEST_STATE_CANCELED) {
                proto.addParentQuestList(mainQuest.toProto());
            }
        }

        this.setData(proto);
    }
}
