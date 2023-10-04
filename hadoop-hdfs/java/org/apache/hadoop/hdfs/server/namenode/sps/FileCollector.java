package org.apache.hadoop.hdfs.server.namenode.sps;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * An interface for scanning the directory recursively and collect files
 * under the given directory.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface FileCollector {

  /**
   * This method can be used to scan and collects the files under that
   * directory and adds to the given BlockStorageMovementNeeded.
   *
   * @param path
   *          - file path id
   */
  void scanAndCollectFiles(long path)
      throws IOException, InterruptedException;
}