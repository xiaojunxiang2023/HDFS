package org.apache.hadoop.hdfs.server.protocol;

import java.util.List;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.server.blockmanagement.DatanodeDescriptor.BlockTargetPair;
import org.apache.hadoop.hdfs.server.blockmanagement.DatanodeStorageInfo;

/****************************************************
 * A BlockCommand is an instruction to a datanode 
 * regarding some blocks under its control.  It tells
 * the DataNode to either invalidate a set of indicated
 * blocks, or to copy a set of indicated blocks to 
 * another DataNode.
 * 
 ****************************************************/
public class BlockCommand extends DatanodeCommand {
  
  /**
   * This constant is used to indicate that the block deletion does not need
   * explicit ACK from the datanode. When a block is put into the list of blocks
   * to be deleted, it's size is set to this constant. We assume that no block
   * would actually have this size. Otherwise, we would miss ACKs for blocks
   * with such size. Positive number is used for compatibility reasons.
   */
  public static final long NO_ACK = Long.MAX_VALUE;
  
  final String poolId;
  final Block[] blocks;
  final DatanodeInfo[][] targets;
  final StorageType[][] targetStorageTypes;
  final String[][] targetStorageIDs;

  /**
   * Create BlockCommand for transferring blocks to another datanode
   * @param blocktargetlist    blocks to be transferred 
   */
  public BlockCommand(int action, String poolId,
      List<BlockTargetPair> blocktargetlist) {
    super(action);
    this.poolId = poolId;
    blocks = new Block[blocktargetlist.size()]; 
    targets = new DatanodeInfo[blocks.length][];
    targetStorageTypes = new StorageType[blocks.length][];
    targetStorageIDs = new String[blocks.length][];

    for(int i = 0; i < blocks.length; i++) {
      BlockTargetPair p = blocktargetlist.get(i);
      blocks[i] = p.block;
      targets[i] = DatanodeStorageInfo.toDatanodeInfos(p.targets);
      targetStorageTypes[i] = DatanodeStorageInfo.toStorageTypes(p.targets);
      targetStorageIDs[i] = DatanodeStorageInfo.toStorageIDs(p.targets);
    }
  }

  private static final DatanodeInfo[][] EMPTY_TARGET_DATANODES = {};
  private static final StorageType[][] EMPTY_TARGET_STORAGE_TYPES = {};
  private static final String[][] EMPTY_TARGET_STORAGEIDS = {};

  /**
   * Create BlockCommand for the given action
   * @param blocks blocks related to the action
   */
  public BlockCommand(int action, String poolId, Block blocks[]) {
    this(action, poolId, blocks, EMPTY_TARGET_DATANODES,
        EMPTY_TARGET_STORAGE_TYPES, EMPTY_TARGET_STORAGEIDS);
  }

  /**
   * Create BlockCommand for the given action
   * @param blocks blocks related to the action
   */
  public BlockCommand(int action, String poolId, Block[] blocks,
      DatanodeInfo[][] targets, StorageType[][] targetStorageTypes,
      String[][] targetStorageIDs) {
    super(action);
    this.poolId = poolId;
    this.blocks = blocks;
    this.targets = targets;
    this.targetStorageTypes = targetStorageTypes;
    this.targetStorageIDs = targetStorageIDs;
  }
  
  public String getBlockPoolId() {
    return poolId;
  }
  
  public Block[] getBlocks() {
    return blocks;
  }

  public DatanodeInfo[][] getTargets() {
    return targets;
  }

  public StorageType[][] getTargetStorageTypes() {
    return targetStorageTypes;
  }

  public String[][] getTargetStorageIDs() {
    return targetStorageIDs;
  }
}
