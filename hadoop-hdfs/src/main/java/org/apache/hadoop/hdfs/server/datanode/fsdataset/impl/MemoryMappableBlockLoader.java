package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.hdfs.ExtendedBlockId;
import org.apache.hadoop.hdfs.server.datanode.DNConf;
import org.apache.hadoop.io.nativeio.NativeIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Maps block to memory.
 */
public class MemoryMappableBlockLoader extends MappableBlockLoader {
  private static final Logger LOG =
      LoggerFactory.getLogger(MemoryMappableBlockLoader.class);
  private CacheStats memCacheStats;

  @Override
  CacheStats initialize(DNConf dnConf) throws IOException {
    LOG.info("Initializing cache loader: MemoryMappableBlockLoader.");
    this.memCacheStats = new CacheStats(dnConf.getMaxLockedMemory());
    return memCacheStats;
  }

  /**
   * Load the block.
   *
   * mmap and mlock the block, and then verify its checksum.
   *
   * @param length         The current length of the block.
   * @param blockIn        The block input stream. Should be positioned at the
   *                       start. The caller must close this.
   * @param metaIn         The meta file input stream. Should be positioned at
   *                       the start. The caller must close this.
   * @param blockFileName  The block file name, for logging purposes.
   * @param key            The extended block ID.
   *
   * @throws IOException   If mapping block to memory fails or checksum fails.

   * @return The Mappable block.
   */
  @Override
  MappableBlock load(long length, FileInputStream blockIn,
                     FileInputStream metaIn, String blockFileName, ExtendedBlockId key)
      throws IOException {
    MemoryMappedBlock mappableBlock = null;
    MappedByteBuffer mmap = null;
    FileChannel blockChannel = null;
    try {
      blockChannel = blockIn.getChannel();
      if (blockChannel == null) {
        throw new IOException("Block InputStream has no FileChannel.");
      }
      mmap = blockChannel.map(FileChannel.MapMode.READ_ONLY, 0, length);
      NativeIO.POSIX.getCacheManipulator().mlock(blockFileName, mmap, length);
      verifyChecksum(length, metaIn, blockChannel, blockFileName);
      mappableBlock = new MemoryMappedBlock(mmap, length);
    } finally {
      IOUtils.closeQuietly(blockChannel);
      if (mappableBlock == null) {
        if (mmap != null) {
          NativeIO.POSIX.munmap(mmap); // unmapping also unlocks
        }
      }
    }
    return mappableBlock;
  }

  @Override
  public long getCacheUsed() {
    return memCacheStats.getCacheUsed();
  }

  @Override
  public long getCacheCapacity() {
    return memCacheStats.getCacheCapacity();
  }

  @Override
  long reserve(ExtendedBlockId key, long bytesCount) {
    return memCacheStats.reserve(bytesCount);
  }

  @Override
  long release(ExtendedBlockId key, long bytesCount) {
    return memCacheStats.release(bytesCount);
  }

  @Override
  public boolean isTransientCache() {
    return true;
  }

  @Override
  public MappableBlock getRecoveredMappableBlock(
      File cacheFile, String bpid, byte volumeIndex) throws IOException {
    return null;
  }

  @Override
  public boolean isNativeLoader() {
    return false;
  }
}
