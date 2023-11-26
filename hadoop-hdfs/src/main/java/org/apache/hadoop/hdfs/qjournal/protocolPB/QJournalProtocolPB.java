package org.apache.hadoop.hdfs.qjournal.protocolPB;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.QJournalProtocolService;
import org.apache.hadoop.ipc.ProtocolInfo;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol used to journal edits to a JournalNode participating
 * in the quorum journal.
 * Note: This extends the protocolbuffer service based interface to
 * add annotations required for security.
 */
@KerberosInfo(
    serverPrincipal = DFSConfigKeys.DFS_JOURNALNODE_KERBEROS_PRINCIPAL_KEY,
    clientPrincipal = DFSConfigKeys.DFS_NAMENODE_KERBEROS_PRINCIPAL_KEY)
@ProtocolInfo(protocolName = 
    "org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocol",
    protocolVersion = 1)
public interface QJournalProtocolPB extends
    QJournalProtocolService.BlockingInterface {
}
