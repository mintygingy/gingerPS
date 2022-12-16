package emu.gingerps.game.dungeons.challenge.trigger;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;

public class InTimeTrigger extends ChallengeTrigger{
    @Override
    public void onCheckTimeout(WorldChallenge challenge) {
        var current = System.currentTimeMillis();
        if(current - challenge.getStartedAt() > challenge.getTimeLimit() * 1000L){
            challenge.fail();
        }
    }
}
