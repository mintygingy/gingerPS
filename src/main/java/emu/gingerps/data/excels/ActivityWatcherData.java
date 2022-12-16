package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.game.props.WatcherTriggerType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@ResourceType(name = "NewActivityWatcherConfigData.json", loadPriority = ResourceType.LoadPriority.HIGH)
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivityWatcherData extends GameResource {
    @Getter(onMethod = @__(@Override))
    int id;
    int rewardID;
    int progress;
    WatcherTrigger triggerConfig;

    @Override
    public void onLoad() {
        triggerConfig.paramList = triggerConfig.paramList.stream().filter(x -> (x != null) && !x.isBlank()).toList();
        triggerConfig.watcherTriggerType = WatcherTriggerType.getTypeByName(triggerConfig.triggerType);
    }

    @Getter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class WatcherTrigger{
        String triggerType;
        List<String> paramList;

        transient WatcherTriggerType watcherTriggerType;
    }

}
