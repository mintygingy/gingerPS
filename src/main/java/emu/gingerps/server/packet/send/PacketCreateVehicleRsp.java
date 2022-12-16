package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.entity.EntityVehicle;
import emu.gingerps.game.entity.GameEntity;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

import emu.gingerps.net.proto.VehicleInteractTypeOuterClass;
import emu.gingerps.net.proto.VehicleMemberOuterClass.VehicleMember;
import emu.gingerps.net.proto.CreateVehicleRspOuterClass.CreateVehicleRsp;

import emu.gingerps.utils.Position;

import java.util.List;

public class PacketCreateVehicleRsp extends BasePacket {

    public PacketCreateVehicleRsp(Player player, int vehicleId, int pointId, Position pos, Position rot) {
        super(PacketOpcodes.CreateVehicleRsp);
        CreateVehicleRsp.Builder proto = CreateVehicleRsp.newBuilder();

        // Eject vehicle members and Kill previous vehicles if there are any
        List<GameEntity> previousVehicles = player.getScene().getEntities().values().stream()
                .filter(entity -> entity instanceof EntityVehicle
                        && ((EntityVehicle) entity).getGadgetId() == vehicleId
                        && ((EntityVehicle) entity).getOwner().equals(player))
                .toList();

        previousVehicles.stream().forEach(entity -> {
            List<VehicleMember> vehicleMembers = ((EntityVehicle) entity).getVehicleMembers().stream().toList();

            vehicleMembers.stream().forEach(vehicleMember -> {
                player.getScene().broadcastPacket(new PacketVehicleInteractRsp(((EntityVehicle) entity), vehicleMember, VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_OUT));
            });

            player.getScene().killEntity(entity, 0);
        });

        EntityVehicle vehicle = new EntityVehicle(player.getScene(), player, vehicleId, pointId, pos, rot);
        player.getScene().addEntity(vehicle);

        proto.setVehicleId(vehicleId);
        proto.setEntityId(vehicle.getId());

        this.setData(proto.build());
    }
}
