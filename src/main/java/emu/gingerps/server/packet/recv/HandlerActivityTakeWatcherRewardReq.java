package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ActivityTakeWatcherRewardReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketActivityTakeWatcherRewardRsp;

import java.util.Optional;

@Opcodes(PacketOpcodes.ActivityTakeWatcherRewardReq)
public class HandlerActivityTakeWatcherRewardReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		var req = ActivityTakeWatcherRewardReqOuterClass.ActivityTakeWatcherRewardReq.parseFrom(payload);

        Optional.ofNullable(session.getPlayer().getActivityManager().getPlayerActivityDataMap().get(req.getActivityId()))
            .ifPresent(x -> x.takeWatcherReward(req.getWatcherId()));

        session.send(new PacketActivityTakeWatcherRewardRsp(req.getActivityId(), req.getWatcherId()));
	}

}
