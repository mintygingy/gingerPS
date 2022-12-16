package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EntityAiSyncNotifyOuterClass.EntityAiSyncNotify;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEntityAiSyncNotify;

@Opcodes(PacketOpcodes.EntityAiSyncNotify)
public class HandlerEntityAiSyncNotify extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		EntityAiSyncNotify notify = EntityAiSyncNotify.parseFrom(payload);
		
		if (notify.getLocalAvatarAlertedMonsterListCount() > 0) {
			session.getPlayer().getScene().broadcastPacket(new PacketEntityAiSyncNotify(notify));
		}
	}

}
