package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry;
import emu.gingerps.net.proto.ClientAbilityInitFinishNotifyOuterClass.ClientAbilityInitFinishNotify;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.utils.Utils;

@Opcodes(PacketOpcodes.ClientAbilityInitFinishNotify)
public class HandlerClientAbilityInitFinishNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ClientAbilityInitFinishNotify notif = ClientAbilityInitFinishNotify.parseFrom(payload);

        Player player = session.getPlayer();

        // Call skill end in the player's ability manager.
        player.getAbilityManager().onSkillEnd(player);

        for (AbilityInvokeEntry entry : notif.getInvokesList()) {
            player.getAbilityManager().onAbilityInvoke(entry);
            player.getClientAbilityInitFinishHandler().addEntry(entry.getForwardType(), entry);
        }

        if (notif.getInvokesList().size() > 0) {
            session.getPlayer().getClientAbilityInitFinishHandler().update(session.getPlayer());
        }
    }
}
