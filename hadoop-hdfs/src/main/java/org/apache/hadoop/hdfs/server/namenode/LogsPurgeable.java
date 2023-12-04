package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;
import java.util.Collection;

/**
 * Interface used to abstract over classes which manage edit logs that may need
 * to be purged.
 */
interface LogsPurgeable {

  /**
   * Remove all edit logs with transaction IDs lower than the given transaction
   * ID.
   *
   * @param minTxIdToKeep the lowest transaction ID that should be retained
   * @throws IOException in the event of error
   */
  public void purgeLogsOlderThan(long minTxIdToKeep) throws IOException;

  /**
   * Get a list of edit log input streams.  The list will start with the
   * stream that contains fromTxnId, and continue until the end of the journal
   * being managed.
   *
   * @param fromTxId the first transaction id we want to read
   * @param inProgressOk whether or not in-progress streams should be returned
   * @param onlyDurableTxns whether or not streams should be bounded by durable
   *                        TxId. A durable TxId is the committed txid in QJM
   *                        or the largest txid written into file in FJM
   * @throws IOException if the underlying storage has an error or is otherwise
   * inaccessible
   */
  void selectInputStreams(Collection<EditLogInputStream> streams,
                          long fromTxId, boolean inProgressOk, boolean onlyDurableTxns)
      throws IOException;

}
