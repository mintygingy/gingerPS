package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketBuyBattlePassLevelRsp;

@Opcodes(PacketOpcodes.BuyBattlePassLevelReq)
public class HandlerBuyBattlePassLevelReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		BuyBattlePassLevelReq req = BuyBattlePassLevelReq.parseFrom(payload);
		
		int buyLevel = session.getPlayer().getBattlePassManager().buyLevels(req.getBuyLevel());
		
		session.send(new PacketBuyBattlePassLevelRsp(buyLevel));
	}

}
