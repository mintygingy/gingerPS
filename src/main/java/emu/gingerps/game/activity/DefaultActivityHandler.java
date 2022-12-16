package emu.gingerps.game.activity;

import emu.gingerps.game.props.ActivityType;
import emu.gingerps.net.proto.ActivityInfoOuterClass;

@GameActivity(ActivityType.NONE)
public class DefaultActivityHandler extends ActivityHandler{
    @Override
    public void onProtoBuild(PlayerActivityData playerActivityData, ActivityInfoOuterClass.ActivityInfo.Builder activityInfo) {

    }

    @Override
    public void onInitPlayerActivityData(PlayerActivityData playerActivityData) {

    }
}
