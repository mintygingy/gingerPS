package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TowerTeamOuterClass;
import emu.gingerps.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketTowerTeamSelectRsp;

@Opcodes(PacketOpcodes.TowerTeamSelectReq)
public class HandlerTowerTeamSelectReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		TowerTeamSelectReq req = TowerTeamSelectReq.parseFrom(payload);

		var towerTeams = req.getTowerTeamListList().stream()
				.map(TowerTeamOuterClass.TowerTeam::getAvatarGuidListList)
				.toList();

		session.getPlayer().getTowerManager().teamSelect(req.getFloorId(), towerTeams);

		session.send(new PacketTowerTeamSelectRsp());
	}
}
