package org.apache.hadoop.ha.protocolPB;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;

import javax.net.SocketFactory;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ha.ZKFCProtocol;
import org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto;
import org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto;
import org.apache.hadoop.ipc.ProtobufHelper;
import org.apache.hadoop.ipc.ProtobufRpcEngine2;
import org.apache.hadoop.ipc.ProtocolTranslator;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.security.AccessControlException;
import org.apache.hadoop.security.UserGroupInformation;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;


public class ZKFCProtocolClientSideTranslatorPB implements
  ZKFCProtocol, Closeable, ProtocolTranslator {

  private final static RpcController NULL_CONTROLLER = null;
  private final ZKFCProtocolPB rpcProxy;

  public ZKFCProtocolClientSideTranslatorPB(
      InetSocketAddress addr, Configuration conf,
      SocketFactory socketFactory, int timeout) throws IOException {
    RPC.setProtocolEngine(conf, ZKFCProtocolPB.class,
        ProtobufRpcEngine2.class);
    rpcProxy = RPC.getProxy(ZKFCProtocolPB.class,
        RPC.getProtocolVersion(ZKFCProtocolPB.class), addr,
        UserGroupInformation.getCurrentUser(), conf, socketFactory, timeout);
  }

  @Override
  public void cedeActive(int millisToCede) throws IOException,
      AccessControlException {
    try {
      CedeActiveRequestProto req = CedeActiveRequestProto.newBuilder()
          .setMillisToCede(millisToCede)
          .build();
      rpcProxy.cedeActive(NULL_CONTROLLER, req);      
    } catch (ServiceException e) {
      throw ProtobufHelper.getRemoteException(e);
    }
  }

  @Override
  public void gracefulFailover() throws IOException, AccessControlException {
    try {
      rpcProxy.gracefulFailover(NULL_CONTROLLER,
          GracefulFailoverRequestProto.getDefaultInstance());
    } catch (ServiceException e) {
      throw ProtobufHelper.getRemoteException(e);
    }
  }


  @Override
  public void close() {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public Object getUnderlyingProxyObject() {
    return rpcProxy;
  }
}
