package emu.gingerps.server.packet.send;

import com.google.protobuf.ByteString;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify;
import emu.gingerps.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify.AreaNotify;
import emu.gingerps.utils.FileUtils;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class PacketWindSeedClientNotify extends BasePacket {
   public PacketWindSeedClientNotify(String givenPath) {
	  super(1157);
	  final Path path = Paths.get(givenPath, new String[0]);
	  byte[] data;
	  try {
	  	data = Files.readAllBytes(path);
	  }
	  catch (Exception e) {
	  	data = FileUtils.readResource("/keys/no.luac");
	  }
      WindSeedClientNotify proto = WindSeedClientNotify.newBuilder().setAreaNotify(AreaNotify.newBuilder().setAreaId(1).setAreaType(1).setAreaCode(ByteString.copyFrom(data)).build()).build();
      this.setData(proto);
   }
}