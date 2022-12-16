package emu.gingerps.server.packet.recv;

import emu.gingerps.GameConstants;
import emu.gingerps.gingerps;
import emu.gingerps.command.commands.SendMailCommand.MailBuilder;
import emu.gingerps.data.GameData;
import emu.gingerps.database.DatabaseHelper;
import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.mail.Mail;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.event.game.PlayerCreationEvent;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.game.GameSession.SessionState;

import static emu.gingerps.config.Configuration.*;

import java.util.Arrays;

@Opcodes(PacketOpcodes.SetPlayerBornDataReq)
public class HandlerSetPlayerBornDataReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SetPlayerBornDataReq req = SetPlayerBornDataReq.parseFrom(payload);

        // Sanity checks
        int avatarId = req.getAvatarId();
        int startingSkillDepot;
        if (avatarId == GameConstants.MAIN_CHARACTER_MALE) {
            startingSkillDepot = 504;
        } else if (avatarId == GameConstants.MAIN_CHARACTER_FEMALE) {
            startingSkillDepot = 704;
        } else {
            return;
        }

        // Make sure resources folder is set
        if (!GameData.getAvatarDataMap().containsKey(avatarId)) {
            gingerps.getLogger().error("No avatar data found! Please check your ExcelBinOutput folder.");
            session.close();
            return;
        }

        // Get player object
        Player player = session.getPlayer();
        player.setNickname(req.getNickName());

        // Create avatar
        if (player.getAvatars().getAvatarCount() == 0) {
            Avatar mainCharacter = new Avatar(avatarId);
            mainCharacter.setSkillDepotData(GameData.getAvatarSkillDepotDataMap().get(startingSkillDepot));
            // Manually handle adding to team
            player.addAvatar(mainCharacter, false);
            player.setMainCharacterId(avatarId);
            player.setHeadImage(avatarId);
            player.getTeamManager().getCurrentSinglePlayerTeamInfo().getAvatars().add(mainCharacter.getAvatarId());
            player.save(); // TODO save player team in different object
        } else {
            return;
        }

        // Login done
        session.getPlayer().onLogin();

        // Born resp packet
        session.send(new BasePacket(PacketOpcodes.SetPlayerBornDataRsp));

        // Default mail
        var welcomeMail = GAME_INFO.joinOptions.welcomeMail;
        MailBuilder mailBuilder = new MailBuilder(player.getUid(), new Mail());
        mailBuilder.mail.mailContent.title = welcomeMail.title;
        mailBuilder.mail.mailContent.sender = welcomeMail.sender;
        // Please credit gingerps if changing something here. We don't condone commercial use of the project.
        mailBuilder.mail.mailContent.content = welcomeMail.content + "\n<type=\"browser\" text=\"GitHub\" href=\"https://github.com/gingerpss/gingerps\"/>";
        mailBuilder.mail.itemList.addAll(Arrays.asList(welcomeMail.items));
        mailBuilder.mail.importance = 1;
        player.sendMail(mailBuilder.mail);
    }
}
