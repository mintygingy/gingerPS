package emu.gingerps.server.packet.send;

import emu.gingerps.data.binout.SceneNpcBornEntry;
import emu.gingerps.game.quest.QuestGroupSuite;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GroupSuiteNotifyOuterClass;

import java.util.Collection;
import java.util.List;

public class PacketGroupSuiteNotify extends BasePacket {

	/**
	 * Real control which npc suite is loaded
     * EntityNPC is useless
	 */
	public PacketGroupSuiteNotify(List<SceneNpcBornEntry> npcBornEntries) {
		super(PacketOpcodes.GroupSuiteNotify);

		var proto = GroupSuiteNotifyOuterClass.GroupSuiteNotify.newBuilder();

        npcBornEntries.stream()
            .filter(x -> x.getGroupId() > 0 && x.getSuiteIdList() != null)
            .forEach(x -> x.getSuiteIdList().forEach(y ->
                proto.putGroupMap(x.getGroupId(), y)
            ));

		this.setData(proto);

	}

    public PacketGroupSuiteNotify(int groupId, int suiteId) {
        super(PacketOpcodes.GroupSuiteNotify);

        var proto = GroupSuiteNotifyOuterClass.GroupSuiteNotify.newBuilder();

        proto.putGroupMap(groupId, suiteId);

        this.setData(proto);
    }

    public PacketGroupSuiteNotify(Collection<QuestGroupSuite> questGroupSuites) {
        super(PacketOpcodes.GroupSuiteNotify);

        var proto = GroupSuiteNotifyOuterClass.GroupSuiteNotify.newBuilder();

        questGroupSuites.forEach(i -> proto.putGroupMap(i.getGroup(), i.getSuite()));

        this.setData(proto);
    }
}
