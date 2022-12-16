package emu.gingerps.game.activity;

import emu.gingerps.game.props.WatcherTriggerType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ActivityWatcherType {
    WatcherTriggerType value();
}
