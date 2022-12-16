package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify;

public class PacketVehicleStaminaNotify extends BasePacket {

	public PacketVehicleStaminaNotify(int vehicleId, float newStamina) {
		super(PacketOpcodes.VehicleStaminaNotify);
		VehicleStaminaNotify.Builder proto = VehicleStaminaNotify.newBuilder();

		proto.setEntityId(vehicleId);
		proto.setCurStamina(newStamina);

		this.setData(proto.build());
	}
}
