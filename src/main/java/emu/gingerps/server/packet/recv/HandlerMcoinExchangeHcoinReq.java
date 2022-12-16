package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.McoinExchangeHcoinReqOuterClass;
import emu.gingerps.net.proto.RetcodeOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketMcoinExchangeHcoinRsp;

@Opcodes(PacketOpcodes.McoinExchangeHcoinReq)
public class HandlerMcoinExchangeHcoinReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq exchangeReq = McoinExchangeHcoinReqOuterClass.McoinExchangeHcoinReq.parseFrom(payload);
        
        if (session.getPlayer().getCrystals() < exchangeReq.getMcoinCost() && exchangeReq.getMcoinCost() == exchangeReq.getHcoin()) {
            session.send(new PacketMcoinExchangeHcoinRsp(RetcodeOuterClass.Retcode.RET_UNKNOWN_ERROR_VALUE));
            return;
        }
        
        session.getPlayer().setCrystals(session.getPlayer().getCrystals() - exchangeReq.getMcoinCost());
        session.getPlayer().setPrimogems(session.getPlayer().getPrimogems() + exchangeReq.getHcoin());
        session.getPlayer().save();
        session.send(new PacketMcoinExchangeHcoinRsp(RetcodeOuterClass.Retcode.RET_SUCC_VALUE));
    }
}
