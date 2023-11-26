package org.apache.hadoop.tools.protocolPB;

import java.io.Closeable;
import java.io.IOException;
import org.apache.hadoop.ipc.ProtobufHelper;
import org.apache.hadoop.ipc.ProtocolMetaInterface;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RpcClientUtil;
import org.apache.hadoop.tools.GetUserMappingsProtocol;
import org.apache.hadoop.tools.proto.GetUserMappingsProtocolProtos.GetGroupsForUserRequestProto;
import org.apache.hadoop.tools.proto.GetUserMappingsProtocolProtos.GetGroupsForUserResponseProto;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

public class GetUserMappingsProtocolClientSideTranslatorPB implements
    ProtocolMetaInterface, GetUserMappingsProtocol, Closeable {

  /** RpcController is not used and hence is set to null */
  private final static RpcController NULL_CONTROLLER = null;
  private final GetUserMappingsProtocolPB rpcProxy;
  
  public GetUserMappingsProtocolClientSideTranslatorPB(
      GetUserMappingsProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public String[] getGroupsForUser(String user) throws IOException {
    GetGroupsForUserRequestProto request = GetGroupsForUserRequestProto
        .newBuilder().setUser(user).build();
    GetGroupsForUserResponseProto resp;
    try {
      resp = rpcProxy.getGroupsForUser(NULL_CONTROLLER, request);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
    return resp.getGroupsList().toArray(new String[resp.getGroupsCount()]);
  }

  @Override
  public boolean isMethodSupported(String methodName) throws IOException {
    return RpcClientUtil.isMethodSupported(rpcProxy,
        GetUserMappingsProtocolPB.class, RPC.RpcKind.RPC_PROTOCOL_BUFFER,
        RPC.getProtocolVersion(GetUserMappingsProtocolPB.class), methodName);
  }
}
