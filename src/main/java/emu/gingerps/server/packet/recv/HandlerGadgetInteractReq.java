package emu.gingerps.server.packet.recv;

import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.GadgetInteractReq)
public class HandlerGadgetInteractReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		GadgetInteractReq req = GadgetInteractReq.parseFrom(payload);

        session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_INTERACT_GADGET, req.getGadgetId());
		session.getPlayer().interactWith(req.getGadgetEntityId(), req);
	}

}
