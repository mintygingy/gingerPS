package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.game.player.Player.SceneLoadState;
import emu.gingerps.game.quest.QuestGroupSuite;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.*;

@Opcodes(PacketOpcodes.EnterSceneDoneReq)
public class HandlerEnterSceneDoneReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // Finished loading
        session.getPlayer().setSceneLoadState(SceneLoadState.LOADED);

        // Done

        session.send(new PacketPlayerTimeNotify(session.getPlayer())); // Probably not the right place

        // Spawn player in world
        session.getPlayer().getScene().spawnPlayer(session.getPlayer());

        // Spawn other entites already in world
        session.getPlayer().getScene().showOtherEntities(session.getPlayer());

        // Locations
        session.send(new PacketWorldPlayerLocationNotify(session.getPlayer().getWorld()));
        session.send(new PacketScenePlayerLocationNotify(session.getPlayer().getScene()));
        session.send(new PacketWorldPlayerRTTNotify(session.getPlayer().getWorld()));

        // spawn NPC
        session.getPlayer().getScene().loadNpcForPlayerEnter(session.getPlayer());

        // notify client to load the npc for quest
        var questGroupSuites = session.getPlayer().getQuestManager().getSceneGroupSuite(session.getPlayer().getSceneId());

        session.getPlayer().getScene().loadGroupForQuest(questGroupSuites);
        gingerps.getLogger().debug("Loaded Scene {} Quest(s) Groupsuite(s): {}", session.getPlayer().getSceneId(), questGroupSuites);
        session.send(new PacketGroupSuiteNotify(questGroupSuites));

        // Reset timer for sending player locations
        session.getPlayer().resetSendPlayerLocTime();
        //Rsp
        session.send(new PacketEnterSceneDoneRsp(session.getPlayer()));
    }

}
