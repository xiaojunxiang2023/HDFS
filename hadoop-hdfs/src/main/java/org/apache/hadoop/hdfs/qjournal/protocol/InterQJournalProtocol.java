package org.apache.hadoop.hdfs.qjournal.protocol;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.qjournal.server.JournalNode;
import org.apache.hadoop.hdfs.qjournal.protocol.QJournalProtocolProtos.GetEditLogManifestResponseProto;
import org.apache.hadoop.security.KerberosInfo;

import java.io.IOException;

/**
 * Protocol used to communicate between {@link JournalNode} for journalsync.
 *
 * This is responsible for sending edit log manifest.
 */

@KerberosInfo(
    serverPrincipal = DFSConfigKeys.DFS_JOURNALNODE_KERBEROS_PRINCIPAL_KEY,
    clientPrincipal = DFSConfigKeys.DFS_JOURNALNODE_KERBEROS_PRINCIPAL_KEY)
public interface InterQJournalProtocol {

  long versionID = 1L;

  /**
   * @param jid the journal from which to enumerate edits
   * @param sinceTxId the first transaction which the client cares about
   * @param inProgressOk whether or not to check the in-progress edit log
   *        segment
   * @return a list of edit log segments since the given transaction ID.
   */
  GetEditLogManifestResponseProto getEditLogManifestFromJournal(
      String jid, String nameServiceId, long sinceTxId, boolean inProgressOk)
      throws IOException;

}
