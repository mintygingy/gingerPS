package emu.gingerps.game.activity.musicgame;

import emu.gingerps.game.activity.ActivityWatcher;
import emu.gingerps.game.activity.ActivityWatcherType;
import emu.gingerps.game.props.WatcherTriggerType;

@ActivityWatcherType(WatcherTriggerType.TRIGGER_FLEUR_FAIR_MUSIC_GAME_REACH_SCORE)
public class MusicGameScoreTrigger extends ActivityWatcher {
    @Override
    protected boolean isMeet(String... param) {
        if(param.length != 2){
            return false;
        }
        var paramList = getActivityWatcherData().getTriggerConfig().getParamList();
        if(!paramList.get(0).equals(param[0])){
            return false;
        }

        var score = Integer.parseInt(param[1]);
        var target = Integer.parseInt(paramList.get(1));
        return score >= target;
    }
}
