package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.protocol.proto.DatanodeLifelineProtocolProtos.DatanodeLifelineProtocolService;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol used by a DataNode to send lifeline messages to a NameNode.
 */
@KerberosInfo(
    serverPrincipal = DFSConfigKeys.DFS_NAMENODE_KERBEROS_PRINCIPAL_KEY,
    clientPrincipal = DFSConfigKeys.DFS_DATANODE_KERBEROS_PRINCIPAL_KEY)
@ProtocolInfo(
    protocolName =
        "org.apache.hadoop.hdfs.server.protocol.DatanodeLifelineProtocol",
    protocolVersion = 1)
@InterfaceAudience.Private
public interface DatanodeLifelineProtocolPB extends
    DatanodeLifelineProtocolService.BlockingInterface {
}
