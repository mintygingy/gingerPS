package emu.gingerps.server.packet.recv;

import emu.gingerps.data.GameData;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UnlockPersonalLineReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketUnlockPersonalLineRsp;

@Opcodes(PacketOpcodes.UnlockPersonalLineReq)
public class HandlerUnlockPersonalLineReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = UnlockPersonalLineReqOuterClass.UnlockPersonalLineReq.parseFrom(payload);
        var data = GameData.getPersonalLineDataMap().get(req.getPersonalLineId());
        if(data == null){
            return;
        }

        session.getPlayer().getQuestManager().addQuest(data.getStartQuestId());
        session.getPlayer().useLegendaryKey(1);

        session.send(new PacketUnlockPersonalLineRsp(data.getId(), 1, data.getChapterId()));
	}

}
