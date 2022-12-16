package emu.gingerps.server.packet.recv;

import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketChangeGameTimeRsp;

@Opcodes(PacketOpcodes.ChangeGameTimeReq)
public class HandlerChangeGameTimeReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		ChangeGameTimeReq req = ChangeGameTimeReq.parseFrom(payload);

		session.getPlayer().getScene().changeTime(req.getGameTime());
        session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_GAME_TIME_TICK,
            req.getGameTime() / 60 , // hours
            req.getExtraDays()); //days
		session.getPlayer().sendPacket(new PacketChangeGameTimeRsp(session.getPlayer()));
	}

}
