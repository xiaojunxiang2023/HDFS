package org.apache.hadoop.ipc.protocolPB;

import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.ipc.proto.RefreshCallQueueProtocolProtos.RefreshCallQueueProtocolService;
import org.apache.hadoop.security.KerberosInfo;

@KerberosInfo(
    serverPrincipal = CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
@ProtocolInfo(
    protocolName = "org.apache.hadoop.ipc.RefreshCallQueueProtocol",
    protocolVersion = 1)
public interface RefreshCallQueueProtocolPB extends
    RefreshCallQueueProtocolService.BlockingInterface {
}
