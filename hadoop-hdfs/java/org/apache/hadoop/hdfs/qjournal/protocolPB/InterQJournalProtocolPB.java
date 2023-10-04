package org.apache.hadoop.hdfs.qjournal.protocolPB;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocolProtos.InterQJournalProtocolService;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;
/**
 * Protocol used to communicate between journal nodes for journal sync.
 * Note: This extends the protocolbuffer service based interface to
 * add annotations required for security.
 */
@KerberosInfo(
    serverPrincipal = DFSConfigKeys.DFS_JOURNALNODE_KERBEROS_PRINCIPAL_KEY,
    clientPrincipal = DFSConfigKeys.DFS_JOURNALNODE_KERBEROS_PRINCIPAL_KEY)
@ProtocolInfo(protocolName =
    "org.apache.hadoop.hdfs.qjournal.protocol.InterQJournalProtocol",
    protocolVersion = 1)
@InterfaceAudience.Private
public interface InterQJournalProtocolPB extends
    InterQJournalProtocolService.BlockingInterface {
}