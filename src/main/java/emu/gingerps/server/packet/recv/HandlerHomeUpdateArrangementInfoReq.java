package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeUpdateArrangementInfoReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketHomeUpdateArrangementInfoRsp;

@Opcodes(PacketOpcodes.HomeUpdateArrangementInfoReq)
public class HandlerHomeUpdateArrangementInfoReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = HomeUpdateArrangementInfoReqOuterClass.HomeUpdateArrangementInfoReq.parseFrom(payload);

		var homeScene = session.getPlayer().getHome()
				.getHomeSceneItem(session.getPlayer().getSceneId());

		homeScene.update(req.getSceneArrangementInfo());

		session.getPlayer().getHome().save();

		session.send(new PacketHomeUpdateArrangementInfoRsp());
	}

}
