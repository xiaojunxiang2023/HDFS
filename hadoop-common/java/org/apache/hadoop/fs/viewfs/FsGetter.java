package org.apache.hadoop.fs.viewfs;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.classification.InterfaceAudience.Private;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

/**
 * File system instance getter.
 */
@Private
class FsGetter {

  /**
   * Gets new file system instance of given uri.
   */
  public FileSystem getNewInstance(URI uri, Configuration conf)
      throws IOException {
    return FileSystem.newInstance(uri, conf);
  }

  /**
   * Gets file system instance of given uri.
   */
  public FileSystem get(URI uri, Configuration conf) throws IOException {
    return FileSystem.get(uri, conf);
  }
}