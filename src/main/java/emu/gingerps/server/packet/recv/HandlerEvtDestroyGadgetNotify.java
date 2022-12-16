package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtDestroyGadgetNotifyOuterClass.EvtDestroyGadgetNotify;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.EvtDestroyGadgetNotify)
public class HandlerEvtDestroyGadgetNotify extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		EvtDestroyGadgetNotify notify = EvtDestroyGadgetNotify.parseFrom(payload);

		session.getPlayer().getScene().onPlayerDestroyGadget(notify.getEntityId());
	}

}
