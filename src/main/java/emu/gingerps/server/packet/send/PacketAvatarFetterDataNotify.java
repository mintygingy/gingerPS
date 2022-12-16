package emu.gingerps.server.packet.send;

import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.props.FetterState;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarFetterDataNotifyOuterClass.AvatarFetterDataNotify;
import emu.gingerps.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo;
import emu.gingerps.net.proto.FetterDataOuterClass.FetterData;

public class PacketAvatarFetterDataNotify extends BasePacket {
	
	public PacketAvatarFetterDataNotify(Avatar avatar) {
		super(PacketOpcodes.AvatarFetterDataNotify);

		int fetterLevel = avatar.getFetterLevel();

		AvatarFetterInfo.Builder avatarFetter = AvatarFetterInfo.newBuilder()
				.setExpLevel(avatar.getFetterLevel());
		
		if (fetterLevel != 10) {
			avatarFetter.setExpNumber(avatar.getFetterExp());
		}
		
		if (avatar.getFetterList() != null) {
			for (int i = 0; i < avatar.getFetterList().size(); i++) {
				avatarFetter.addFetterList(
					FetterData.newBuilder()
						.setFetterId(avatar.getFetterList().get(i))
						.setFetterState(FetterState.FINISH.getValue())
				);
			}
		}
		
		int cardId = avatar.getNameCardId();

		if (avatar.getPlayer().getNameCardList().contains(cardId)) {
			avatarFetter.addRewardedFetterLevelList(10);
		}

		AvatarFetterInfo avatarFetterInfo = avatarFetter.build();
		
		AvatarFetterDataNotify proto = AvatarFetterDataNotify.newBuilder()
            .putFetterInfoMap(avatar.getGuid(), avatarFetterInfo)
            .build();
		
		this.setData(proto);
	}
}
