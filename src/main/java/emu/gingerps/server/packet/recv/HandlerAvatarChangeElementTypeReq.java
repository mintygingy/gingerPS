package emu.gingerps.server.packet.recv;

import emu.gingerps.GameConstants;
import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.AvatarSkillDepotData;
import emu.gingerps.data.excels.WorldAreaData;
import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarChangeElementTypeReqOuterClass.AvatarChangeElementTypeReq;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAbilityChangeNotify;
import emu.gingerps.server.packet.send.PacketAvatarChangeElementTypeRsp;
import emu.gingerps.server.packet.send.PacketAvatarFightPropNotify;
import emu.gingerps.server.packet.send.PacketAvatarSkillDepotChangeNotify;

@Opcodes(PacketOpcodes.AvatarChangeElementTypeReq)
public class HandlerAvatarChangeElementTypeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarChangeElementTypeReq req = AvatarChangeElementTypeReq.parseFrom(payload);

        WorldAreaData area = GameData.getWorldAreaDataMap().get(req.getAreaId());

        if (area == null || area.getElementType() == null || area.getElementType().getDepotValue() <= 0) {
            session.send(new PacketAvatarChangeElementTypeRsp(Retcode.RET_SVR_ERROR_VALUE));
            return;
        }

        // Get current avatar, should be one of the main characters
        EntityAvatar mainCharacterEntity = session.getPlayer().getTeamManager().getCurrentAvatarEntity();
        Avatar mainCharacter = mainCharacterEntity.getAvatar();

        int skillDepotId = area.getElementType().getDepotValue();
        switch (mainCharacter.getAvatarId()) {
            case GameConstants.MAIN_CHARACTER_MALE -> skillDepotId += 500;
            case GameConstants.MAIN_CHARACTER_FEMALE -> skillDepotId += 700;
            default -> {
                session.send(new PacketAvatarChangeElementTypeRsp(Retcode.RET_SVR_ERROR_VALUE));
                return;
            }
        }

        // Sanity checks for skill depots
        AvatarSkillDepotData skillDepot = GameData.getAvatarSkillDepotDataMap().get(skillDepotId);
        if (skillDepot == null || skillDepot.getId() == mainCharacter.getSkillDepotId()) {
            session.send(new PacketAvatarChangeElementTypeRsp(Retcode.RET_SVR_ERROR_VALUE));
            return;
        }

        // Set skill depot
        mainCharacter.setSkillDepotData(skillDepot);

        // Success
        session.send(new PacketAvatarChangeElementTypeRsp());

        // Ability change packet
        session.send(new PacketAvatarSkillDepotChangeNotify(mainCharacter));
        session.send(new PacketAbilityChangeNotify(mainCharacterEntity));
        session.send(new PacketAvatarFightPropNotify(mainCharacter));
    }

}
