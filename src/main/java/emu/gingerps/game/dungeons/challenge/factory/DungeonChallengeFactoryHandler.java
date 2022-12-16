package emu.gingerps.game.dungeons.challenge.factory;

import emu.gingerps.game.dungeons.challenge.DungeonChallenge;
import emu.gingerps.game.dungeons.challenge.trigger.InTimeTrigger;
import emu.gingerps.game.dungeons.challenge.trigger.KillMonsterTrigger;
import emu.gingerps.game.props.SceneType;
import emu.gingerps.game.world.Scene;
import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.scripts.data.SceneGroup;

import java.util.List;

public class DungeonChallengeFactoryHandler implements ChallengeFactoryHandler{
    @Override
    public boolean isThisType(int challengeIndex, int challengeId, int param3, int param4, int param5, int param6, Scene scene, SceneGroup group) {
        // ActiveChallenge with 1,1000,300,233101003,15,0
        return scene.getSceneType() == SceneType.SCENE_DUNGEON
                && param4 == group.id;
    }

    @Override
    public WorldChallenge build(int challengeIndex, int challengeId, int param3, int param4, int param5, int param6, Scene scene, SceneGroup group) {
        var realGroup = scene.getScriptManager().getGroupById(param4);
        return new DungeonChallenge(
                scene, realGroup,
                challengeId, // Id
                challengeIndex, // Index
                List.of(param5, param3),
                param3, // Limit
                param5,  // Goal
                List.of(new InTimeTrigger(), new KillMonsterTrigger()));
    }
}
