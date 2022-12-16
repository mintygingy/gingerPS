package emu.gingerps.server.packet.send;

import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption;
import emu.gingerps.net.proto.ItemParamOuterClass.ItemParam;
import emu.gingerps.net.proto.TakeBattlePassRewardRspOuterClass.TakeBattlePassRewardRsp;
import emu.gingerps.server.game.GameSession;

import java.util.List;

public class PacketTakeBattlePassRewardRsp extends BasePacket {
    public PacketTakeBattlePassRewardRsp(List<BattlePassRewardTakeOption> takeOptionList, List<GameItem> rewardItems) {
        super(PacketOpcodes.TakeBattlePassRewardRsp);

        var proto = TakeBattlePassRewardRsp.newBuilder()
        		.addAllTakeOptionList(takeOptionList);
        
        if (rewardItems != null) {
        	for (var item : rewardItems) {
            	proto.addItemList(ItemParam.newBuilder().setItemId(item.getItemId()).setCount(item.getCount()));
            }
        }

        setData(proto);
    }
}
