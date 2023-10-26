package org.apache.hadoop.hdfs.server.protocol;

import java.io.IOException;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.io.retry.Idempotent;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol used by a DataNode to send lifeline messages to a NameNode.
 */
@KerberosInfo(
    serverPrincipal = DFSConfigKeys.DFS_NAMENODE_KERBEROS_PRINCIPAL_KEY,
    clientPrincipal = DFSConfigKeys.DFS_DATANODE_KERBEROS_PRINCIPAL_KEY)
public interface DatanodeLifelineProtocol {

  @Idempotent
  void sendLifeline(DatanodeRegistration registration, StorageReport[] reports,
      long dnCacheCapacity, long dnCacheUsed, int xmitsInProgress,
      int xceiverCount, int failedVolumes,
      VolumeFailureSummary volumeFailureSummary) throws IOException;
}
