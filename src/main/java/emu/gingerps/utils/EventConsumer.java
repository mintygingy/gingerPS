package emu.gingerps.utils;

import emu.gingerps.server.event.Event;

public interface EventConsumer<T extends Event> {
    void consume(T event);
}
