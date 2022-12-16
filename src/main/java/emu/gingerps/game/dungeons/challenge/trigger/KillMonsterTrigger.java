package emu.gingerps.game.dungeons.challenge.trigger;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.game.entity.EntityMonster;
import emu.gingerps.server.packet.send.PacketChallengeDataNotify;

public class KillMonsterTrigger extends ChallengeTrigger{
    @Override
    public void onBegin(WorldChallenge challenge) {
        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, 1, challenge.getScore().get()));
    }

    @Override
    public void onMonsterDeath(WorldChallenge challenge, EntityMonster monster) {
        var newScore = challenge.increaseScore();
        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, 1, newScore));

        if(newScore >= challenge.getGoal()){
            challenge.done();
        }

    }
}
