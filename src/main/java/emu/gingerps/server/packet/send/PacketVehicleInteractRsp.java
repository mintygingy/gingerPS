package emu.gingerps.server.packet.send;

import emu.gingerps.gingerps;
import emu.gingerps.game.entity.EntityVehicle;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.entity.GameEntity;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType;
import emu.gingerps.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp;
import emu.gingerps.net.proto.VehicleMemberOuterClass.VehicleMember;

public class PacketVehicleInteractRsp extends BasePacket {

	public PacketVehicleInteractRsp(Player player, int entityId, VehicleInteractType interactType) {
		super(PacketOpcodes.VehicleInteractRsp);
		VehicleInteractRsp.Builder proto = VehicleInteractRsp.newBuilder();

		GameEntity vehicle = player.getScene().getEntityById(entityId);

		if(vehicle instanceof EntityVehicle) {
			proto.setEntityId(vehicle.getId());

			VehicleMember vehicleMember = VehicleMember.newBuilder()
					.setUid(player.getUid())
					.setAvatarGuid(player.getTeamManager().getCurrentCharacterGuid())
					.build();

			proto.setInteractType(interactType);
			proto.setMember(vehicleMember);

			switch(interactType){
				case VEHICLE_INTERACT_TYPE_IN -> {
					((EntityVehicle) vehicle).getVehicleMembers().add(vehicleMember);
				}
				case VEHICLE_INTERACT_TYPE_OUT -> {
					((EntityVehicle) vehicle).getVehicleMembers().remove(vehicleMember);
				}
				default -> {}
			}
		}
		this.setData(proto.build());
	}

	public PacketVehicleInteractRsp(EntityVehicle vehicle, VehicleMember vehicleMember, VehicleInteractType interactType) {
		super(PacketOpcodes.VehicleInteractRsp);
		VehicleInteractRsp.Builder proto = VehicleInteractRsp.newBuilder();

		if(vehicle != null) {
			proto.setEntityId(vehicle.getId());
			proto.setInteractType(interactType);
			proto.setMember(vehicleMember);

			switch(interactType){
				case VEHICLE_INTERACT_TYPE_IN -> {
					vehicle.getVehicleMembers().add(vehicleMember);
				}
				case VEHICLE_INTERACT_TYPE_OUT -> {
					vehicle.getVehicleMembers().remove(vehicleMember);
				}
				default -> {}
			}
		}
		this.setData(proto.build());
	}
}
