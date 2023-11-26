package org.apache.hadoop.ipc.protocolPB;

import java.io.Closeable;
import java.io.IOException;

import org.apache.hadoop.ipc.ProtobufHelper;
import org.apache.hadoop.ipc.ProtocolMetaInterface;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RpcClientUtil;
import org.apache.hadoop.ipc.RefreshCallQueueProtocol;
import org.apache.hadoop.ipc.proto.RefreshCallQueueProtocolProtos.RefreshCallQueueRequestProto;
import org.apache.hadoop.ipc.protocolPB.RefreshCallQueueProtocolPB;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

public class RefreshCallQueueProtocolClientSideTranslatorPB implements
    ProtocolMetaInterface, RefreshCallQueueProtocol, Closeable {

  /** RpcController is not used and hence is set to null */
  private final static RpcController NULL_CONTROLLER = null;
  private final RefreshCallQueueProtocolPB rpcProxy;
  
  private final static RefreshCallQueueRequestProto
  VOID_REFRESH_CALL_QUEUE_REQUEST =
      RefreshCallQueueRequestProto.newBuilder().build();

  public RefreshCallQueueProtocolClientSideTranslatorPB(
      RefreshCallQueueProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public void refreshCallQueue() throws IOException {
    try {
      rpcProxy.refreshCallQueue(NULL_CONTROLLER,
          VOID_REFRESH_CALL_QUEUE_REQUEST);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public boolean isMethodSupported(String methodName) throws IOException {
    return RpcClientUtil.isMethodSupported(rpcProxy,
        RefreshCallQueueProtocolPB.class,
        RPC.RpcKind.RPC_PROTOCOL_BUFFER,
        RPC.getProtocolVersion(RefreshCallQueueProtocolPB.class),
        methodName);
  }
}
