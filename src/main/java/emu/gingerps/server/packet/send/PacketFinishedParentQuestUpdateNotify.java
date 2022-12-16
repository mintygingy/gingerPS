package emu.gingerps.server.packet.send;

import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify;

import java.util.List;

public class PacketFinishedParentQuestUpdateNotify extends BasePacket {

    public PacketFinishedParentQuestUpdateNotify(GameMainQuest quest) {
        super(PacketOpcodes.FinishedParentQuestUpdateNotify);

        FinishedParentQuestUpdateNotify proto = FinishedParentQuestUpdateNotify.newBuilder()
                .addParentQuestList(quest.toProto())
                .build();

        this.setData(proto);
    }

    public PacketFinishedParentQuestUpdateNotify(List<GameMainQuest> quests) {
        super(PacketOpcodes.FinishedParentQuestUpdateNotify);

        var proto = FinishedParentQuestUpdateNotify.newBuilder();

        for (GameMainQuest mainQuest : quests) {
            proto.addParentQuestList(mainQuest.toProto());
        }
        proto.build();
        this.setData(proto);
    }
}
