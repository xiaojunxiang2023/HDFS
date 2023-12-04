package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.hdfs.protocol.proto.ReconfigurationProtocolProtos.ReconfigurationProtocolService;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol that clients use to communicate with the NN/DN to do
 * reconfiguration on the fly.
 *
 * Note: This extends the protocolbuffer service based interface to
 * add annotations required for security.
 */
@KerberosInfo(serverPrincipal =
    CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
@ProtocolInfo(
    protocolName = "org.apache.hadoop.hdfs.protocol.ReconfigurationProtocol",
    protocolVersion = 1)
public interface ReconfigurationProtocolPB extends
    ReconfigurationProtocolService.BlockingInterface {
}
