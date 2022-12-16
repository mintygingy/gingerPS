package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player.SceneLoadState;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketHostPlayerNotify;
import emu.gingerps.server.packet.send.PacketPlayerEnterSceneInfoNotify;
import emu.gingerps.server.packet.send.PacketPlayerGameTimeNotify;
import emu.gingerps.server.packet.send.PacketPlayerWorldSceneInfoListNotify;
import emu.gingerps.server.packet.send.PacketSceneAreaWeatherNotify;
import emu.gingerps.server.packet.send.PacketSceneInitFinishRsp;
import emu.gingerps.server.packet.send.PacketScenePlayerInfoNotify;
import emu.gingerps.server.packet.send.PacketSceneTeamUpdateNotify;
import emu.gingerps.server.packet.send.PacketSceneTimeNotify;
import emu.gingerps.server.packet.send.PacketServerTimeNotify;
import emu.gingerps.server.packet.send.PacketSyncScenePlayTeamEntityNotify;
import emu.gingerps.server.packet.send.PacketSyncTeamEntityNotify;
import emu.gingerps.server.packet.send.PacketWorldDataNotify;
import emu.gingerps.server.packet.send.PacketWorldPlayerInfoNotify;

@Opcodes(PacketOpcodes.SceneInitFinishReq)
public class HandlerSceneInitFinishReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// Info packets
		session.send(new PacketServerTimeNotify());
		session.send(new PacketWorldPlayerInfoNotify(session.getPlayer().getWorld()));
		session.send(new PacketWorldDataNotify(session.getPlayer().getWorld()));
		session.send(new PacketPlayerWorldSceneInfoListNotify());
		session.send(new BasePacket(PacketOpcodes.SceneForceUnlockNotify));
		session.send(new PacketHostPlayerNotify(session.getPlayer().getWorld()));
		
		session.send(new PacketSceneTimeNotify(session.getPlayer()));
		session.send(new PacketPlayerGameTimeNotify(session.getPlayer()));
		session.send(new PacketPlayerEnterSceneInfoNotify(session.getPlayer()));
		session.send(new PacketSceneAreaWeatherNotify(session.getPlayer()));
		session.send(new PacketScenePlayerInfoNotify(session.getPlayer().getWorld()));
		session.send(new PacketSceneTeamUpdateNotify(session.getPlayer()));
		
		session.send(new PacketSyncTeamEntityNotify(session.getPlayer()));
		session.send(new PacketSyncScenePlayTeamEntityNotify(session.getPlayer()));
		
		// Done Packet
		session.send(new PacketSceneInitFinishRsp(session.getPlayer()));
		
		// Set state
		session.getPlayer().setSceneLoadState(SceneLoadState.INIT);
	}
}
