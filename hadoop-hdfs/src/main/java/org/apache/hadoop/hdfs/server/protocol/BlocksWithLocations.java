package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.Block;

/**
 * Maintains an array of blocks and their corresponding storage IDs.
 */
public class BlocksWithLocations {

  /**
   * A class to keep track of a block and its locations
   */
  public static class BlockWithLocations {
    final Block block;
    final String[] datanodeUuids;
    final String[] storageIDs;
    final StorageType[] storageTypes;

    /** constructor */
    public BlockWithLocations(Block block, String[] datanodeUuids,
                              String[] storageIDs, StorageType[] storageTypes) {
      this.block = block;
      this.datanodeUuids = datanodeUuids;
      this.storageIDs = storageIDs;
      this.storageTypes = storageTypes;
    }

    /** get the block */
    public Block getBlock() {
      return block;
    }

    /** get the block's datanode locations */
    public String[] getDatanodeUuids() {
      return datanodeUuids;
    }

    /** get the block's storage locations */
    public String[] getStorageIDs() {
      return storageIDs;
    }

    /** @return the storage types */
    public StorageType[] getStorageTypes() {
      return storageTypes;
    }

    @Override
    public String toString() {
      final StringBuilder b = new StringBuilder();
      b.append(block);
      if (datanodeUuids.length == 0) {
        return b.append("[]").toString();
      }

      appendString(0, b.append("["));
      for (int i = 1; i < datanodeUuids.length; i++) {
        appendString(i, b.append(","));
      }
      return b.append("]").toString();
    }

    private StringBuilder appendString(int i, StringBuilder b) {
      return b.append("[").append(storageTypes[i]).append("]")
          .append(storageIDs[i])
          .append("@").append(datanodeUuids[i]);
    }
  }

  private final BlockWithLocations[] blocks;

  /** Constructor with one parameter */
  public BlocksWithLocations(BlockWithLocations[] blocks) {
    this.blocks = blocks;
  }

  /** getter */
  public BlockWithLocations[] getBlocks() {
    return blocks;
  }
}
