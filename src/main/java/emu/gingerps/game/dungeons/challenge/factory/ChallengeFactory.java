package emu.gingerps.game.dungeons.challenge.factory;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.game.world.Scene;
import emu.gingerps.scripts.data.SceneGroup;

import java.util.ArrayList;
import java.util.List;

public class ChallengeFactory {

    private static final List<ChallengeFactoryHandler> challengeFactoryHandlers = new ArrayList<>();

    static {
        challengeFactoryHandlers.add(new DungeonChallengeFactoryHandler());
        challengeFactoryHandlers.add(new DungeonGuardChallengeFactoryHandler());
        challengeFactoryHandlers.add(new KillGadgetChallengeFactoryHandler());
        challengeFactoryHandlers.add(new KillMonsterChallengeFactoryHandler());
    }

    public static WorldChallenge getChallenge(int param1, int param2, int param3, int param4, int param5, int param6, Scene scene, SceneGroup group){
        for(var handler : challengeFactoryHandlers){
            if(!handler.isThisType(param1, param2, param3, param4, param5, param6, scene, group)){
                continue;
            }
            return handler.build(param1, param2, param3, param4, param5, param6, scene, group);
        }
        return null;
    }
}
