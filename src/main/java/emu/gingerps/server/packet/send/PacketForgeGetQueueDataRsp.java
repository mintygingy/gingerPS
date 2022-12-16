package emu.gingerps.server.packet.send;

import java.util.Map;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ForgeGetQueueDataRspOuterClass.ForgeGetQueueDataRsp;
import emu.gingerps.net.proto.ForgeQueueDataOuterClass.ForgeQueueData;
import emu.gingerps.net.proto.RetcodeOuterClass.Retcode;

public class PacketForgeGetQueueDataRsp extends BasePacket {
	
	public PacketForgeGetQueueDataRsp(Retcode retcode, int numQueues, Map<Integer, ForgeQueueData> queueData) {
		super(PacketOpcodes.ForgeGetQueueDataRsp);

		ForgeGetQueueDataRsp.Builder builder = ForgeGetQueueDataRsp.newBuilder()
			.setRetcode(retcode.getNumber())
			.setMaxQueueNum(numQueues);

			for (int queueId : queueData.keySet()) {
				var data = queueData.get(queueId);
				builder.putForgeQueueMap(queueId, data);
			}

		this.setData(builder.build());
	}
}
