package org.apache.hadoop.hdfs.protocolPB;

import org.apache.hadoop.hdfs.client.HdfsClientConfigKeys;
import org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ClientDatanodeProtocolService;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenSelector;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;
import org.apache.hadoop.security.token.TokenInfo;

@KerberosInfo(
    serverPrincipal = HdfsClientConfigKeys.DFS_DATANODE_KERBEROS_PRINCIPAL_KEY)
@TokenInfo(BlockTokenSelector.class)
@ProtocolInfo(protocolName =
    "org.apache.hadoop.hdfs.protocol.ClientDatanodeProtocol",
    protocolVersion = 1)
public interface ClientDatanodeProtocolPB extends
    ClientDatanodeProtocolService.BlockingInterface {
}
