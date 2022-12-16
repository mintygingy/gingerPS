package emu.gingerps.game.battlepass;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Transient;
import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.BattlePassMissionData;
import emu.gingerps.data.excels.BattlePassRewardData;
import emu.gingerps.game.props.BattlePassMissionStatus;
import emu.gingerps.net.proto.BattlePassRewardTagOuterClass.BattlePassRewardTag;
import emu.gingerps.net.proto.BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus;

@Entity
public class BattlePassReward {
	private int level;
	private int rewardId;
	private boolean paid;

	@Transient
	private BattlePassMissionData data;
	
	@Deprecated // Morphia only
	public BattlePassReward() {}
	
	public BattlePassReward(int level, int rewardId, boolean paid) {
		this.level = level;
		this.rewardId = rewardId;
		this.paid = paid;
	}

	public int getLevel() {
		return level;
	}

	public int getRewardId() {
		return rewardId;
	}

	public boolean isPaid() {
		return paid;
	}

	public BattlePassRewardTag toProto() {
		var protoBuilder = BattlePassRewardTag.newBuilder();
		
		protoBuilder
			.setLevel(this.getLevel())
			.setRewardId(this.getRewardId())
			.setUnlockStatus(this.isPaid() ? BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_PAID : BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_FREE);
			
		return protoBuilder.build();
	}
}
