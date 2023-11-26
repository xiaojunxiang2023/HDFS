package org.apache.hadoop.ha.protocolPB;

import java.io.IOException;
import org.apache.hadoop.ha.fc.ZKFCProtocol;
import org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto;
import org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto;
import org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto;
import org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto;
import org.apache.hadoop.ipc.ProtocolSignature;
import org.apache.hadoop.ipc.RPC;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;
public class ZKFCProtocolServerSideTranslatorPB implements
    ZKFCProtocolPB {
  private final ZKFCProtocol server;
  
  public ZKFCProtocolServerSideTranslatorPB(ZKFCProtocol server) {
    this.server = server;
  }

  @Override
  public CedeActiveResponseProto cedeActive(RpcController controller,
      CedeActiveRequestProto request) throws ServiceException {
    try {
      server.cedeActive(request.getMillisToCede());
      return CedeActiveResponseProto.getDefaultInstance();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public GracefulFailoverResponseProto gracefulFailover(
      RpcController controller, GracefulFailoverRequestProto request)
      throws ServiceException {
    try {
      server.gracefulFailover();
      return GracefulFailoverResponseProto.getDefaultInstance();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
  }

  @Override
  public long getProtocolVersion(String protocol, long clientVersion)
      throws IOException {
    return RPC.getProtocolVersion(ZKFCProtocolPB.class);
  }

  @Override
  public ProtocolSignature getProtocolSignature(String protocol,
      long clientVersion, int clientMethodsHash) throws IOException {
    if (!protocol.equals(RPC.getProtocolName(ZKFCProtocolPB.class))) {
      throw new IOException("Serverside implements " +
          RPC.getProtocolName(ZKFCProtocolPB.class) +
          ". The following requested protocol is unknown: " + protocol);
    }

    return ProtocolSignature.getProtocolSignature(clientMethodsHash,
        RPC.getProtocolVersion(ZKFCProtocolPB.class),
        HAServiceProtocolPB.class);
  }

}
