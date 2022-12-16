package emu.gingerps.task.tasks;

import emu.gingerps.gingerps;
import emu.gingerps.task.Task;
import emu.gingerps.task.TaskHandler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@Task(taskName = "MoonCard", taskCronExpression = "0 0 0 * * ?", triggerName = "MoonCardTrigger")
// taskCronExpression: Fixed time period: 0:0:0 every day (twenty-four hour system)
public final class MoonCard extends TaskHandler {

    @Override
    public void onEnable() {
        gingerps.getLogger().debug("[Task] MoonCard task enabled.");
    }

    @Override
    public void onDisable() {
        gingerps.getLogger().debug("[Task] MoonCard task disabled.");
    }

    @Override
    public synchronized void execute(JobExecutionContext context) throws JobExecutionException {
        gingerps.getGameServer().getPlayers().forEach((uid, player) -> {
            if (player.isOnline()) {
                if (player.inMoonCard()) {
                    player.getTodayMoonCard();
                }
            }
        });
    }
}
