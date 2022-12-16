package emu.gingerps.server.event.internal;

import emu.gingerps.server.event.types.ServerEvent;

import java.time.OffsetDateTime;

public final class ServerStartEvent extends ServerEvent {
    private final OffsetDateTime startTime;
    
    public ServerStartEvent(Type type, OffsetDateTime startTime) {
        super(type);
        
        this.startTime = startTime;
    }
    
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }
}
