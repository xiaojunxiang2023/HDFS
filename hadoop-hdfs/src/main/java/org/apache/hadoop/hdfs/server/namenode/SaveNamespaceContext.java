package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.hdfs.server.common.Storage.StorageDirectory;
import org.apache.hadoop.hdfs.util.Canceler;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Context for an ongoing SaveNamespace operation. This class
 * allows cancellation, and also is responsible for accumulating
 * failed storage directories.
 */
public class SaveNamespaceContext {
  private final FSNamesystem sourceNamesystem;
  private final long txid;
  private final List<StorageDirectory> errorSDs =
      Collections.synchronizedList(new ArrayList<StorageDirectory>());

  private final Canceler canceller;
  private final CountDownLatch completionLatch = new CountDownLatch(1);

  SaveNamespaceContext(
      FSNamesystem sourceNamesystem,
      long txid,
      Canceler canceller) {
    this.sourceNamesystem = sourceNamesystem;
    this.txid = txid;
    this.canceller = canceller;
  }

  FSNamesystem getSourceNamesystem() {
    return sourceNamesystem;
  }

  long getTxId() {
    return txid;
  }

  void reportErrorOnStorageDirectory(StorageDirectory sd) {
    errorSDs.add(sd);
  }

  List<StorageDirectory> getErrorSDs() {
    return errorSDs;
  }

  void markComplete() {
    Preconditions.checkState(completionLatch.getCount() == 1,
        "Context already completed!");
    completionLatch.countDown();
  }

  public void checkCancelled() throws SaveNamespaceCancelledException {
    if (canceller.isCancelled()) {
      throw new SaveNamespaceCancelledException(
          canceller.getCancellationReason());
    }
  }
}
