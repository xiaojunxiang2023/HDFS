package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

/**
 * Exception object that is thrown when the block metadata file is corrupt.
 */
public class CorruptMetaHeaderException extends IOException {

  CorruptMetaHeaderException(String msg) {
    super(msg);
  }

  CorruptMetaHeaderException(String msg, Throwable cause) {
    super(msg, cause);
  }

}
