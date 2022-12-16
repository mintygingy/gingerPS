package emu.gingerps.server.packet.recv;

import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.data.excels.CombineData;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CombineReqOuterClass;
import emu.gingerps.net.proto.ItemParamOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketCombineRsp;

import java.util.List;
import java.util.stream.Collectors;

@Opcodes(PacketOpcodes.CombineReq)
public class HandlerCombineReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {

        CombineReqOuterClass.CombineReq req = CombineReqOuterClass.CombineReq.parseFrom(payload);

        var result = session.getServer().getCombineSystem()
                .combineItem(session.getPlayer(), req.getCombineId(), req.getCombineCount());

        if (result == null) {
            return;
        }

        session.send(new PacketCombineRsp(req,
                toItemParamList(result.getMaterial()),
                toItemParamList(result.getResult()),
                toItemParamList(result.getExtra()),
                toItemParamList(result.getBack()),
                toItemParamList(result.getBack())));
    }

    private List<ItemParamOuterClass.ItemParam> toItemParamList(List<ItemParamData> list) {
        return list.stream()
                .map(item -> ItemParamOuterClass.ItemParam.newBuilder()
                        .setItemId(item.getId())
                        .setCount(item.getCount())
                        .build())
                .collect(Collectors.toList());
    }
}

