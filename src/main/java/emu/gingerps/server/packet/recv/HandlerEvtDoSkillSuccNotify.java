package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.EvtDoSkillSuccNotify)
public class HandlerEvtDoSkillSuccNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtDoSkillSuccNotify notify = EvtDoSkillSuccNotify.parseFrom(payload);

        var player = session.getPlayer();
        int skillId = notify.getSkillId();
        int casterId = notify.getCasterId();

        // Call skill perform in the player's ability manager.
        player.getAbilityManager().onSkillStart(session.getPlayer(), skillId, casterId);

        // Handle skill notify in other managers.
        player.getStaminaManager().handleEvtDoSkillSuccNotify(session, skillId, casterId);
        player.getEnergyManager().handleEvtDoSkillSuccNotify(session, skillId, casterId);
    }
}
