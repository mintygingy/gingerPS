package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerApplyEnterMpResultNotifyOuterClass;
import emu.gingerps.net.proto.PlayerApplyEnterMpResultNotifyOuterClass.PlayerApplyEnterMpResultNotify;

public class PacketPlayerApplyEnterMpResultNotify extends BasePacket {

	public PacketPlayerApplyEnterMpResultNotify(Player target, boolean isAgreed, PlayerApplyEnterMpResultNotifyOuterClass.PlayerApplyEnterMpResultNotify.Reason reason) {
		super(PacketOpcodes.PlayerApplyEnterMpResultNotify);

		PlayerApplyEnterMpResultNotify proto = PlayerApplyEnterMpResultNotify.newBuilder()
				.setTargetUid(target.getUid())
				.setTargetNickname(target.getNickname())
				.setIsAgreed(isAgreed)
				.setReason(reason)
				.build();

		this.setData(proto);
	}

	public PacketPlayerApplyEnterMpResultNotify(int targetId, String targetName, boolean isAgreed, PlayerApplyEnterMpResultNotify.Reason reason) {
		super(PacketOpcodes.PlayerApplyEnterMpResultNotify);

		PlayerApplyEnterMpResultNotify proto = PlayerApplyEnterMpResultNotify.newBuilder()
				.setTargetUid(targetId)
				.setTargetNickname(targetName)
				.setIsAgreed(isAgreed)
				.setReason(reason)
				.build();

		this.setData(proto);
	}
}
