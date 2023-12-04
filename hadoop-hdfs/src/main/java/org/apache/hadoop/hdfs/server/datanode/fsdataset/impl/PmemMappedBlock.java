package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.hdfs.ExtendedBlockId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Represents an HDFS block that is mapped to persistent memory by DataNode
 * with mapped byte buffer. PMDK is NOT involved in this implementation.
 */
public class PmemMappedBlock implements MappableBlock {
  private static final Logger LOG =
      LoggerFactory.getLogger(PmemMappedBlock.class);
  private long length;
  private ExtendedBlockId key;

  PmemMappedBlock(long length, ExtendedBlockId key) {
    assert length > 0;
    this.length = length;
    this.key = key;
  }

  @Override
  public long getLength() {
    return length;
  }

  @Override
  public long getAddress() {
    return -1L;
  }

  @Override
  public ExtendedBlockId getKey() {
    return key;
  }

  @Override
  public void close() {
    String cacheFilePath = null;
    try {
      cacheFilePath =
          PmemVolumeManager.getInstance().getCachePath(key);
      FsDatasetUtil.deleteMappedFile(cacheFilePath);
      LOG.info("Successfully uncached one replica:{} from persistent memory"
          + ", [cached path={}, length={}]", key, cacheFilePath, length);
    } catch (IOException e) {
      LOG.warn("Failed to delete the mapped File: {}!", cacheFilePath, e);
    }
  }
}