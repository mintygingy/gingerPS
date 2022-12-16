package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.TowerEnterLevelReq)
public class HandlerTowerEnterLevelReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		TowerEnterLevelReq req = TowerEnterLevelReq.parseFrom(payload);

		//session.send(new PacketTowerCurLevelRecordChangeNotify());
		session.getPlayer().getTowerManager().enterLevel(req.getEnterPointId());

		//session.send(new PacketTowerLevelStarCondNotify());
	}
}
