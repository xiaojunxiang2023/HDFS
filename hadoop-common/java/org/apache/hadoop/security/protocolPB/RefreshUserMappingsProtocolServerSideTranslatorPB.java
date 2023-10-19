package org.apache.hadoop.security.protocolPB;

import java.io.IOException;

import org.apache.hadoop.security.RefreshUserMappingsProtocol;
import org.apache.hadoop.security.proto.RefreshUserMappingsProtocolProtos.RefreshSuperUserGroupsConfigurationRequestProto;
import org.apache.hadoop.security.proto.RefreshUserMappingsProtocolProtos.RefreshSuperUserGroupsConfigurationResponseProto;
import org.apache.hadoop.security.proto.RefreshUserMappingsProtocolProtos.RefreshUserToGroupsMappingsRequestProto;
import org.apache.hadoop.security.proto.RefreshUserMappingsProtocolProtos.RefreshUserToGroupsMappingsResponseProto;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

public class RefreshUserMappingsProtocolServerSideTranslatorPB implements RefreshUserMappingsProtocolPB {

  private final RefreshUserMappingsProtocol impl;
  
  private final static RefreshUserToGroupsMappingsResponseProto 
  VOID_REFRESH_USER_GROUPS_MAPPING_RESPONSE =
      RefreshUserToGroupsMappingsResponseProto.newBuilder().build();

  private final static RefreshSuperUserGroupsConfigurationResponseProto
  VOID_REFRESH_SUPERUSER_GROUPS_CONFIGURATION_RESPONSE = 
      RefreshSuperUserGroupsConfigurationResponseProto.newBuilder()
      .build();

  public RefreshUserMappingsProtocolServerSideTranslatorPB(RefreshUserMappingsProtocol impl) {
    this.impl = impl;
  }
  
  @Override
  public RefreshUserToGroupsMappingsResponseProto 
      refreshUserToGroupsMappings(RpcController controller, 
      RefreshUserToGroupsMappingsRequestProto request)
      throws ServiceException {
    try {
      impl.refreshUserToGroupsMappings();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REFRESH_USER_GROUPS_MAPPING_RESPONSE;
  }

  @Override
  public RefreshSuperUserGroupsConfigurationResponseProto 
      refreshSuperUserGroupsConfiguration(RpcController controller,
      RefreshSuperUserGroupsConfigurationRequestProto request)
      throws ServiceException {
    try {
      impl.refreshSuperUserGroupsConfiguration();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REFRESH_SUPERUSER_GROUPS_CONFIGURATION_RESPONSE;
  }
}
