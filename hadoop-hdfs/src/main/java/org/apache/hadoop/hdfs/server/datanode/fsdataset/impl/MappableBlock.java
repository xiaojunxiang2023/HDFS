package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.hdfs.ExtendedBlockId;

import java.io.Closeable;

/**
 * Represents an HDFS block that is mapped by the DataNode.
 */
public interface MappableBlock extends Closeable {

  /**
   * Get the number of bytes that have been cached.
   * @return the number of bytes that have been cached.
   */
  long getLength();

  /**
   * Get cache address if applicable.
   * Return -1 if not applicable.
   */
  long getAddress();

  /**
   * Get cached block's ExtendedBlockId.
   * @return cached block's ExtendedBlockId..
   */
  ExtendedBlockId getKey();
}
