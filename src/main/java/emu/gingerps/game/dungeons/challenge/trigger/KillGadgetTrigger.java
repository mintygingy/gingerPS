package emu.gingerps.game.dungeons.challenge.trigger;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.server.packet.send.PacketChallengeDataNotify;

public class KillGadgetTrigger extends ChallengeTrigger{
    @Override
    public void onBegin(WorldChallenge challenge) {
        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, 2, challenge.getScore().get()));
    }

    @Override
    public void onGadgetDeath(WorldChallenge challenge, EntityGadget gadget) {
        var newScore = challenge.increaseScore();
        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, 2, newScore));

        if(newScore >= challenge.getGoal()){
            challenge.done();
        }

    }
}
