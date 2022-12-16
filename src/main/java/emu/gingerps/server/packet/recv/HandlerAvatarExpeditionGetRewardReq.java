package emu.gingerps.server.packet.recv;

import emu.gingerps.game.expedition.ExpeditionInfo;
import emu.gingerps.game.expedition.ExpeditionRewardDataList;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarExpeditionGetRewardReqOuterClass.AvatarExpeditionGetRewardReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarExpeditionGetRewardRsp;
import emu.gingerps.server.packet.send.PacketItemAddHintNotify;

import java.util.ArrayList;
import java.util.List;

@Opcodes(PacketOpcodes.AvatarExpeditionGetRewardReq)
public class HandlerAvatarExpeditionGetRewardReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarExpeditionGetRewardReq req = AvatarExpeditionGetRewardReq.parseFrom(payload);
        var player = session.getPlayer();

        ExpeditionInfo expInfo = player.getExpeditionInfo(req.getAvatarGuid());
        List<GameItem> items = new ArrayList<>();
        List<ExpeditionRewardDataList> expeditionRewardDataLists = session.getServer().getExpeditionSystem().getExpeditionRewardDataList().get(expInfo.getExpId());

        if (expeditionRewardDataLists != null) {
            expeditionRewardDataLists.stream()
                .filter(r -> r.getHourTime() == expInfo.getHourTime())
                .map(ExpeditionRewardDataList::getRewards)
                .forEach(items::addAll);
        }

        player.getInventory().addItems(items);
        player.sendPacket(new PacketItemAddHintNotify(items, ActionReason.ExpeditionReward));

        player.removeExpeditionInfo(req.getAvatarGuid());
        player.save();
        session.send(new PacketAvatarExpeditionGetRewardRsp(player.getExpeditionInfo(), items));
    }
}

