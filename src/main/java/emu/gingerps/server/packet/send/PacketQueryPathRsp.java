package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.QueryPathReqOuterClass;
import emu.gingerps.net.proto.QueryPathRspOuterClass;

public class PacketQueryPathRsp extends BasePacket {

	public PacketQueryPathRsp(QueryPathReqOuterClass.QueryPathReq req) {
		super(PacketOpcodes.QueryPathRsp);

        var proto = QueryPathRspOuterClass.QueryPathRsp.newBuilder();

        proto.addCorners(req.getSourcePos())
            .addCorners(req.getDestinationPos(0))
            .setQueryId(req.getQueryId())
            .setQueryStatus(QueryPathRspOuterClass.QueryPathRsp.PathStatusType.PATH_STATUS_TYPE_SUCC);

        this.setData(proto);
	}
}
