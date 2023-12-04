package org.apache.hadoop.security.protocolPB;

import org.apache.hadoop.ipc.ProtobufHelper;
import org.apache.hadoop.ipc.ProtocolMetaInterface;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RpcClientUtil;
import org.apache.hadoop.security.authorize.RefreshAuthorizationPolicyProtocol;
import org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.Closeable;
import java.io.IOException;

public class RefreshAuthorizationPolicyProtocolClientSideTranslatorPB implements
    ProtocolMetaInterface, RefreshAuthorizationPolicyProtocol, Closeable {

  /** RpcController is not used and hence is set to null */
  private final static RpcController NULL_CONTROLLER = null;
  private final RefreshAuthorizationPolicyProtocolPB rpcProxy;

  private final static RefreshServiceAclRequestProto
      VOID_REFRESH_SERVICE_ACL_REQUEST =
      RefreshServiceAclRequestProto.newBuilder().build();

  public RefreshAuthorizationPolicyProtocolClientSideTranslatorPB(
      RefreshAuthorizationPolicyProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public void refreshServiceAcl() throws IOException {
    try {
      rpcProxy.refreshServiceAcl(NULL_CONTROLLER,
          VOID_REFRESH_SERVICE_ACL_REQUEST);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public boolean isMethodSupported(String methodName) throws IOException {
    return RpcClientUtil.isMethodSupported(rpcProxy,
        RefreshAuthorizationPolicyProtocolPB.class,
        RPC.RpcKind.RPC_PROTOCOL_BUFFER,
        RPC.getProtocolVersion(RefreshAuthorizationPolicyProtocolPB.class),
        methodName);
  }
}
