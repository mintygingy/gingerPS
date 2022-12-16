package emu.gingerps.server.packet.send;


import emu.gingerps.gingerps;
import emu.gingerps.game.mail.Mail;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.*;

import java.util.ArrayList;
import java.util.List;

public class PacketMailChangeNotify extends BasePacket {

    public PacketMailChangeNotify(Player player, Mail message) {
        this (player, new ArrayList<Mail>() {{add(message);}});
    }

    public PacketMailChangeNotify(Player player, List<Mail> mailList) {
        this(player, mailList, null);
    }

    public PacketMailChangeNotify(Player player, List<Mail> mailList, List<Integer> delMailIdList) {
        super(PacketOpcodes.MailChangeNotify);

        MailChangeNotifyOuterClass.MailChangeNotify.Builder proto = MailChangeNotifyOuterClass.MailChangeNotify.newBuilder();

        if (mailList != null) {
            for (Mail message : mailList) {
                MailTextContentOuterClass.MailTextContent.Builder mailTextContent = MailTextContentOuterClass.MailTextContent.newBuilder();
                mailTextContent.setTitle(message.mailContent.title);
                mailTextContent.setContent(message.mailContent.content);
                mailTextContent.setSender(message.mailContent.sender);

                List<MailItemOuterClass.MailItem> mailItems = new ArrayList<MailItemOuterClass.MailItem>();

                for (Mail.MailItem item : message.itemList) {
                    MailItemOuterClass.MailItem.Builder mailItem = MailItemOuterClass.MailItem.newBuilder();
                    EquipParamOuterClass.EquipParam.Builder itemParam = EquipParamOuterClass.EquipParam.newBuilder();
                    itemParam.setItemId(item.itemId);
                    itemParam.setItemNum(item.itemCount);
                    mailItem.setEquipParam(itemParam.build());

                    mailItems.add(mailItem.build());
                }

                MailDataOuterClass.MailData.Builder mailData = MailDataOuterClass.MailData.newBuilder();
                mailData.setMailId(player.getMailId(message));
                mailData.setMailTextContent(mailTextContent.build());
                mailData.addAllItemList(mailItems);
                mailData.setSendTime((int) message.sendTime);
                mailData.setExpireTime((int) message.expireTime);
                mailData.setImportance(message.importance);
                mailData.setIsRead(message.isRead);
                mailData.setIsAttachmentGot(message.isAttachmentGot);
                mailData.setConfigId(message.stateValue);

                proto.addMailList(mailData.build());
            }
        }

        if (delMailIdList != null) {
            proto.addAllDelMailIdList(delMailIdList);
        }

        this.setData(proto.build());
    }
}
