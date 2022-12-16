package emu.gingerps.utils;

import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.proto.PropValueOuterClass.PropValue;

public final class ProtoHelper {
	public static PropValue newPropValue(PlayerProperty key, int value) {
		return PropValue.newBuilder().setType(key.getId()).setIval(value).setVal(value).build();
	}
}
