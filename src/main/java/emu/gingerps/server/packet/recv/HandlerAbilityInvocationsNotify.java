package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.EntityBaseGadget;
import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AbilityInvocationsNotifyOuterClass.AbilityInvocationsNotify;
import emu.gingerps.net.proto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.proto.SceneEntityInfoOuterClass;
import emu.gingerps.net.proto.VisionTypeOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSceneEntityDisappearNotify;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.Utils;
import it.unimi.dsi.fastutil.ints.Int2FloatOpenHashMap;

@Opcodes(PacketOpcodes.AbilityInvocationsNotify)
public class HandlerAbilityInvocationsNotify extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		AbilityInvocationsNotify notif = AbilityInvocationsNotify.parseFrom(payload);

		Player player = session.getPlayer();
		for (AbilityInvokeEntry entry : notif.getInvokesList()) {
			player.getAbilityManager().onAbilityInvoke(entry);
			player.getAbilityInvokeHandler().addEntry(entry.getForwardType(), entry);
		}
	}

}
