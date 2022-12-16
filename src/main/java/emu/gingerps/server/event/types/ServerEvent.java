package emu.gingerps.server.event.types;

import emu.gingerps.server.event.Event;

/**
 * An event that is related to the internals of the server.
 */
public abstract class ServerEvent extends Event {
    protected final Type type;
    
    public ServerEvent(Type type) {
        this.type = type;
    }
    
    public Type getServerType() {
        return this.type;
    }
    
    public enum Type {
        DISPATCH,
        GAME
    }
}
