package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.server.protocol.BlockRecoveryCommand.RecoveringBlock;
import org.apache.hadoop.security.KerberosInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/** An inter-datanode protocol for updating generation stamp
 */
@KerberosInfo(
    serverPrincipal = DFSConfigKeys.DFS_DATANODE_KERBEROS_PRINCIPAL_KEY,
    clientPrincipal = DFSConfigKeys.DFS_DATANODE_KERBEROS_PRINCIPAL_KEY)
public interface InterDatanodeProtocol {
  Logger LOG = LoggerFactory.getLogger(InterDatanodeProtocol.class.getName());

  /**
   * Until version 9, this class InterDatanodeProtocol served as both
   * the interface to the DN AND the RPC protocol used to communicate with the 
   * DN.
   *
   * This class is used by both the DN to insulate from the protocol 
   * serialization.
   *
   * If you are adding/changing DN's interface then you need to 
   * change both this class and ALSO related protocol buffer
   * wire protocol definition in InterDatanodeProtocol.proto.
   *
   * For more details on protocol buffer wire protocol, please see 
   * .../org/apache/hadoop/hdfs/protocolPB/overview.html
   */
  public static final long versionID = 6L;

  /**
   * Initialize a replica recovery.
   *
   * @return actual state of the replica on this data-node or 
   * null if data-node does not have the replica.
   */
  ReplicaRecoveryInfo initReplicaRecovery(RecoveringBlock rBlock)
      throws IOException;

  /**
   * Update replica with the new generation stamp and length.  
   */
  String updateReplicaUnderRecovery(ExtendedBlock oldBlock, long recoveryId,
                                    long newBlockId, long newLength)
      throws IOException;
}
