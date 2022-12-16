package emu.gingerps.server.packet.recv;

import java.util.List;
import java.util.Set;

import emu.gingerps.data.GameData;
import emu.gingerps.data.common.ItemParamData;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakePlayerLevelRewardReqOuterClass.TakePlayerLevelRewardReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketTakePlayerLevelRewardRsp;

@Opcodes(PacketOpcodes.TakePlayerLevelRewardReq)
public class HandlerTakePlayerLevelRewardReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        Player pl = session.getPlayer();
        synchronized (pl) {
            TakePlayerLevelRewardReq req = TakePlayerLevelRewardReq.parseFrom(payload);
            int level = req.getLevel();
            Set<Integer> rewardedLevels = session.getPlayer().getRewardedLevels();
            if (!rewardedLevels.contains(level)) {// No duplicated reward
                int rewardId = GameData.getPlayerLevelDataMap().get(level).getRewardId();
                if (rewardId != 0) {
                    List<ItemParamData> rewardItems = GameData.getRewardDataMap().get(rewardId).getRewardItemList();
                    pl.getInventory().addItemParamDatas(rewardItems, ActionReason.PlayerUpgradeReward);
                    rewardedLevels.add(level);
                    pl.setRewardedLevels(rewardedLevels);
                    pl.save();
                    session.send(new PacketTakePlayerLevelRewardRsp(level, rewardId));
                }
            }
        }
    }
}
