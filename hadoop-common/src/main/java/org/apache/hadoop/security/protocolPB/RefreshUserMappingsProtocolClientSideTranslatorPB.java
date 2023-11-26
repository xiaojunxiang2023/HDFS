package org.apache.hadoop.security.protocolPB;

import java.io.Closeable;
import java.io.IOException;

import org.apache.hadoop.ipc.ProtobufHelper;
import org.apache.hadoop.ipc.ProtocolMetaInterface;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RpcClientUtil;
import org.apache.hadoop.security.RefreshUserMappingsProtocol;
import org.apache.hadoop.security.proto.RefreshUserMappingsProtocolProtos.RefreshSuperUserGroupsConfigurationRequestProto;
import org.apache.hadoop.security.proto.RefreshUserMappingsProtocolProtos.RefreshUserToGroupsMappingsRequestProto;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

public class RefreshUserMappingsProtocolClientSideTranslatorPB implements
    ProtocolMetaInterface, RefreshUserMappingsProtocol, Closeable {

  /** RpcController is not used and hence is set to null */
  private final static RpcController NULL_CONTROLLER = null;
  private final RefreshUserMappingsProtocolPB rpcProxy;
  
  private final static RefreshUserToGroupsMappingsRequestProto 
  VOID_REFRESH_USER_TO_GROUPS_MAPPING_REQUEST = 
      RefreshUserToGroupsMappingsRequestProto.newBuilder().build();

  private final static RefreshSuperUserGroupsConfigurationRequestProto
  VOID_REFRESH_SUPERUSER_GROUPS_CONFIGURATION_REQUEST = 
      RefreshSuperUserGroupsConfigurationRequestProto.newBuilder().build();

  public RefreshUserMappingsProtocolClientSideTranslatorPB(
      RefreshUserMappingsProtocolPB rpcProxy) {
    this.rpcProxy = rpcProxy;
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(rpcProxy);
  }

  @Override
  public void refreshUserToGroupsMappings() throws IOException {
    try {
      rpcProxy.refreshUserToGroupsMappings(NULL_CONTROLLER,
          VOID_REFRESH_USER_TO_GROUPS_MAPPING_REQUEST);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public void refreshSuperUserGroupsConfiguration() throws IOException {
    try {
      rpcProxy.refreshSuperUserGroupsConfiguration(NULL_CONTROLLER,
          VOID_REFRESH_SUPERUSER_GROUPS_CONFIGURATION_REQUEST);
    } catch (ServiceException se) {
      throw ProtobufHelper.getRemoteException(se);
    }
  }

  @Override
  public boolean isMethodSupported(String methodName) throws IOException {
    return RpcClientUtil
        .isMethodSupported(rpcProxy, RefreshUserMappingsProtocolPB.class,
            RPC.RpcKind.RPC_PROTOCOL_BUFFER,
            RPC.getProtocolVersion(RefreshUserMappingsProtocolPB.class),
            methodName);
  }
}
