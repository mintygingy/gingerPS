package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetEntityClientDataNotifyOuterClass.SetEntityClientDataNotify;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.SetEntityClientDataNotify)
public class HandlerSetEntityClientDataNotify extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// Skip if there is no one to broadcast it too
		if (session.getPlayer().getScene().getPlayerCount() <= 1) {
			return;
		}
		
		// Make sure packet is a valid proto before replaying it to the other players
		SetEntityClientDataNotify notif = SetEntityClientDataNotify.parseFrom(payload);
		
		BasePacket packet = new BasePacket(PacketOpcodes.SetEntityClientDataNotify, true);
		packet.setData(notif);
		
		session.getPlayer().getScene().broadcastPacket(packet);
	}

}
