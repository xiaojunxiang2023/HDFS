package org.apache.hadoop.security.protocolPB;

import org.apache.hadoop.security.authorize.RefreshAuthorizationPolicyProtocol;
import org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto;
import org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto;
import org.apache.hadoop.thirdparty.protobuf.RpcController;
import org.apache.hadoop.thirdparty.protobuf.ServiceException;

import java.io.IOException;

public class RefreshAuthorizationPolicyProtocolServerSideTranslatorPB implements
    RefreshAuthorizationPolicyProtocolPB {

  private final RefreshAuthorizationPolicyProtocol impl;

  private final static RefreshServiceAclResponseProto
      VOID_REFRESH_SERVICE_ACL_RESPONSE = RefreshServiceAclResponseProto
      .newBuilder().build();

  public RefreshAuthorizationPolicyProtocolServerSideTranslatorPB(
      RefreshAuthorizationPolicyProtocol impl) {
    this.impl = impl;
  }

  @Override
  public RefreshServiceAclResponseProto refreshServiceAcl(
      RpcController controller, RefreshServiceAclRequestProto request)
      throws ServiceException {
    try {
      impl.refreshServiceAcl();
    } catch (IOException e) {
      throw new ServiceException(e);
    }
    return VOID_REFRESH_SERVICE_ACL_RESPONSE;
  }
}
