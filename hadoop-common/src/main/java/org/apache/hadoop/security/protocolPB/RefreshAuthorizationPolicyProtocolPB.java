package org.apache.hadoop.security.protocolPB;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;
import org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshAuthorizationPolicyProtocolService;

@KerberosInfo(
    serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
@ProtocolInfo(
    protocolName = "org.apache.hadoop.security.authorize.RefreshAuthorizationPolicyProtocol", 
    protocolVersion = 1)
// MapReduce也可见
public interface RefreshAuthorizationPolicyProtocolPB extends
  RefreshAuthorizationPolicyProtocolService.BlockingInterface {
}
