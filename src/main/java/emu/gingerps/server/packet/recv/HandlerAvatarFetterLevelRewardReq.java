package emu.gingerps.server.packet.recv;

import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.RewardData;
import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarDataNotify;
import emu.gingerps.server.packet.send.PacketAvatarFetterDataNotify;
import emu.gingerps.server.packet.send.PacketAvatarFetterLevelRewardRsp;
import emu.gingerps.server.packet.send.PacketItemAddHintNotify;
import emu.gingerps.server.packet.send.PacketUnlockNameCardNotify;
import emu.gingerps.net.packet.PacketHandler;

@Opcodes(PacketOpcodes.AvatarFetterLevelRewardReq)
public class HandlerAvatarFetterLevelRewardReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		AvatarFetterLevelRewardReq req = AvatarFetterLevelRewardReq.parseFrom(payload);
        if (req.getFetterLevel() < 10) {
            // You don't have a full level of fetter level, why do you want to get a divorce certificate?
            session.send(new PacketAvatarFetterLevelRewardRsp(req.getAvatarGuid(), req.getFetterLevel()));
        } else {
            long avatarGuid = req.getAvatarGuid();

            Avatar avatar = session
                .getPlayer()
                .getAvatars()
                .getAvatarByGuid(avatarGuid);

            int rewardId = avatar.getNameCardRewardId();

            RewardData card = GameData.getRewardDataMap().get(rewardId);
            int cardId = card.getRewardItemList().get(0).getItemId();

            if (session.getPlayer().getNameCardList().contains(cardId)) {
                // Already got divorce certificate.
                session.getPlayer().sendPacket(new PacketAvatarFetterLevelRewardRsp(req.getAvatarGuid(), req.getFetterLevel(), rewardId));
                return;
            }

            GameItem item = new GameItem(cardId);
            session.getPlayer().getInventory().addItem(item, ActionReason.FetterLevelReward);
            session.getPlayer().sendPacket(new PacketUnlockNameCardNotify(cardId));
            session.send(new PacketAvatarFetterDataNotify(avatar));
            session.send(new PacketAvatarDataNotify(avatar.getPlayer()));
            session.send(new PacketAvatarFetterLevelRewardRsp(avatarGuid, req.getFetterLevel(), rewardId));
        }
	}
}
