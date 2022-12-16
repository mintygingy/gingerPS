package emu.gingerps.game.activity;

import emu.gingerps.game.props.WatcherTriggerType;

@ActivityWatcherType(WatcherTriggerType.TRIGGER_NONE)
public class DefaultWatcher extends ActivityWatcher{
    @Override
    protected boolean isMeet(String... param) {
        return false;
    }
}
