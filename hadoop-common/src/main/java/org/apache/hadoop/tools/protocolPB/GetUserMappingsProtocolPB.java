package org.apache.hadoop.tools.protocolPB;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;
import org.apache.hadoop.tools.proto.GetUserMappingsProtocolProtos.GetUserMappingsProtocolService;

@KerberosInfo(
    serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
@ProtocolInfo(
    protocolName = "org.apache.hadoop.tools.GetUserMappingsProtocol", 
    protocolVersion = 1)
// MapReduce也可见
public interface GetUserMappingsProtocolPB extends
  GetUserMappingsProtocolService.BlockingInterface {
}
