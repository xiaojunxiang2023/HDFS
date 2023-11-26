package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.hdfs.BlockReader;
import org.apache.hadoop.hdfs.ReadStatistics;
import org.slf4j.Logger;

import java.io.IOException;

public class IOUtilsClient {
  /**
   * Close the Closeable objects and <b>ignore</b> any {@link IOException} or
   * null pointers. Must only be used for cleanup in exception handlers.
   *
   * @param log the log to record problems to at debug level. Can be null.
   * @param closeables the objects to close
   */
  public static void cleanupWithLogger(Logger log,
                                       java.io.Closeable... closeables) {
    for (java.io.Closeable c : closeables) {
      if (c != null) {
        try {
          c.close();
        } catch(Throwable e) {
          if (log != null && log.isDebugEnabled()) {
            log.debug("Exception in closing " + c, e);
          }
        }
      }
    }
  }

  public static void updateReadStatistics(ReadStatistics readStatistics,
                                      int nRead, BlockReader blockReader) {
    updateReadStatistics(readStatistics, nRead, blockReader.isShortCircuit(),
        blockReader.getNetworkDistance());
  }

  public static void updateReadStatistics(ReadStatistics readStatistics,
      int nRead, boolean isShortCircuit, int networkDistance) {
    if (nRead <= 0) {
      return;
    }

    if (isShortCircuit) {
      readStatistics.addShortCircuitBytes(nRead);
    } else if (networkDistance == 0) {
      readStatistics.addLocalBytes(nRead);
    } else {
      readStatistics.addRemoteBytes(nRead);
    }
  }
}
