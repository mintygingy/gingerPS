package emu.gingerps.server.event.internal;

import emu.gingerps.server.event.types.ServerEvent;

import java.time.OffsetDateTime;

public final class ServerStopEvent extends ServerEvent {
    private final OffsetDateTime stopTime;

    public ServerStopEvent(Type type, OffsetDateTime stopTime) {
        super(type);

        this.stopTime = stopTime;
    }

    public OffsetDateTime getStopTime() {
        return this.stopTime;
    }
}
