package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AiSyncInfoOuterClass.AiSyncInfo;
import emu.gingerps.net.proto.EntityAiSyncNotifyOuterClass.EntityAiSyncNotify;

public class PacketEntityAiSyncNotify extends BasePacket {

	public PacketEntityAiSyncNotify(EntityAiSyncNotify notify) {
		super(PacketOpcodes.EntityAiSyncNotify, true);

		EntityAiSyncNotify.Builder proto = EntityAiSyncNotify.newBuilder();

		for (int monsterId : notify.getLocalAvatarAlertedMonsterListList()) {
			proto.addInfoList(AiSyncInfo.newBuilder().setEntityId(monsterId)
                //.setHasPathToTarget(true)
            );
        }

		this.setData(proto);
	}
}
