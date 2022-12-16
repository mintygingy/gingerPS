package emu.gingerps.task.tasks;

import emu.gingerps.gingerps;
import emu.gingerps.game.systems.AnnouncementSystem;
import emu.gingerps.task.Task;
import emu.gingerps.task.TaskHandler;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Task(taskName = "Announcement", taskCronExpression = "0 * * * * ?", triggerName = "AnnouncementTrigger")
public final class AnnouncementTask extends TaskHandler {

    static Map<Integer, Integer> intervalMap = new ConcurrentHashMap<>();
    @Override
    public void onEnable() {
        gingerps.getLogger().debug("[Task] Announcement task enabled.");
    }

    @Override
    public void onDisable() {
        gingerps.getLogger().debug("[Task] Announcement task disabled.");
    }

    @Override
    public synchronized void execute(JobExecutionContext context) throws JobExecutionException {
        var current = new Date();
        var announceConfigItems = gingerps.getGameServer().getAnnouncementSystem().getAnnounceConfigItemMap().values().stream()
            .filter(AnnouncementSystem.AnnounceConfigItem::isTick)
            .filter(i -> current.after(i.getBeginTime()))
            .filter(i -> current.before(i.getEndTime()))
            .collect(Collectors.toMap(AnnouncementSystem.AnnounceConfigItem::getTemplateId, y -> y));

        announceConfigItems.values().forEach(i -> intervalMap.compute(i.getTemplateId(), (k,v) -> v == null ? 1 : v + 1));

        var toSend = intervalMap.entrySet().stream()
            .filter(i -> announceConfigItems.containsKey(i.getKey()))
            .filter(i -> i.getValue() >= announceConfigItems.get(i.getKey()).getInterval())
            .map(i -> announceConfigItems.get(i.getKey()))
            .toList();

        gingerps.getGameServer().getAnnouncementSystem().broadcast(toSend);
        gingerps.getLogger().debug("Broadcast {} announcement(s) to all online players", toSend.size());

        // clear the interval count
        toSend.forEach(i -> intervalMap.put(i.getTemplateId(), 0));
    }
}
