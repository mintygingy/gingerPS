package emu.gingerps.server.packet.recv;

import emu.gingerps.game.props.SceneType;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPostEnterSceneRsp;

@Opcodes(PacketOpcodes.PostEnterSceneReq)
public class HandlerPostEnterSceneReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        if (session.getPlayer().getScene().getSceneType() == SceneType.SCENE_ROOM) {
            session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_ENTER_ROOM, session.getPlayer().getSceneId(),0);
        }

        session.send(new PacketPostEnterSceneRsp(session.getPlayer()));
    }

}
