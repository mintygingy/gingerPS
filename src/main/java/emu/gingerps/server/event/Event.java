package emu.gingerps.server.event;

import emu.gingerps.gingerps;

/**
 * A generic server event.
 */
public abstract class Event {
    private boolean cancelled = false;

    /**
     * Return the cancelled state of the event.
     */
    public boolean isCanceled() {
        return this.cancelled;
    }

    /**
     * Cancels the event if possible.
     */
    public void cancel() {
        if(this instanceof Cancellable)
            this.cancelled = true;
    }

    /**
     * Pushes this event to all listeners.
     */
    public void call() {
        gingerps.getPluginManager().invokeEvent(this);
    }
}
