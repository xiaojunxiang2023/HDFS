package org.apache.hadoop.tools.protocolPB;

import java.io.IOException;

import org.apache.hadoop.tools.GetUserMappingsProtocol;
import org.apache.hadoop.tools.proto.GetUserMappingsProtocolProtos.GetGroupsForUserRequestProto;
import org.apache.hadoop.tools.proto.GetUserMappingsProtocolProtos.GetGroupsForUserResponseProto;

import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

public class GetUserMappingsProtocolServerSideTranslatorPB implements
    GetUserMappingsProtocolPB {

  private final GetUserMappingsProtocol impl;

  public GetUserMappingsProtocolServerSideTranslatorPB(
      GetUserMappingsProtocol impl) {
    this.impl = impl;
  }

  @Override
  public GetGroupsForUserResponseProto getGroupsForUser(
      RpcController controller, GetGroupsForUserRequestProto request)
      throws ServiceException {
    String[] groups;
    try {
      groups = impl.getGroupsForUser(request.getUser());
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    GetGroupsForUserResponseProto.Builder builder = GetGroupsForUserResponseProto
        .newBuilder();
    for (String g : groups) {
      builder.addGroups(g);
    }
    return builder.build();
  }
}
