package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetShopRsp;
import emu.gingerps.server.packet.send.PacketGetWidgetSlotRsp;

@Opcodes(PacketOpcodes.GetWidgetSlotReq)
public class HandlerGetWidgetSlotReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		Player player = session.getPlayer();
		session.send(new PacketGetWidgetSlotRsp(player));
	}
	
}
