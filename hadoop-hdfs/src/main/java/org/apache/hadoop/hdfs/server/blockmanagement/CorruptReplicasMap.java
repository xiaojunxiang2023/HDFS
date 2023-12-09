package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.BlockType;
import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.ipc.Server;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

import java.util.*;
import java.util.concurrent.atomic.LongAdder;

/**
 * Stores information about all corrupt blocks in the File System.
 * A Block is considered corrupt only if all of its replicas are
 * corrupt. While reporting replicas of a Block, we hide any corrupt
 * copies. These copies are removed once Block is found to have 
 * expected number of good replicas.
 * Mapping: Block {@literal -> TreeSet<DatanodeDescriptor>}
 */
public class CorruptReplicasMap {

  /** The corruption reason code */
  public enum Reason {
    NONE,                // not specified.
    ANY,                 // wildcard reason
    GENSTAMP_MISMATCH,   // mismatch in generation stamps
    SIZE_MISMATCH,       // mismatch in sizes
    INVALID_STATE,       // invalid state
    CORRUPTION_REPORTED  // client or datanode reported the corruption
  }

  private final Map<Block, Map<DatanodeDescriptor, Reason>> corruptReplicasMap =
      new HashMap<Block, Map<DatanodeDescriptor, Reason>>();

  private final LongAdder totalCorruptBlocks = new LongAdder();

  /**
   * Mark the block belonging to datanode as corrupt.
   *
   * @param blk Block to be added to CorruptReplicasMap
   * @param dn DatanodeDescriptor which holds the corrupt replica
   * @param reason a textual reason (for logging purposes)
   * @param reasonCode the enum representation of the reason
   */
  void addToCorruptReplicasMap(Block blk, DatanodeDescriptor dn,
                               String reason, Reason reasonCode) {
    Map<DatanodeDescriptor, Reason> nodes = corruptReplicasMap.get(blk);
    if (nodes == null) {
      nodes = new HashMap<DatanodeDescriptor, Reason>();
      corruptReplicasMap.put(blk, nodes);
      incrementBlockStat();
    }

    String reasonText;
    if (reason != null) {
      reasonText = " because " + reason;
    } else {
      reasonText = "";
    }

    if (!nodes.keySet().contains(dn)) {
      NameNode.blockStateChangeLog.debug(
          "BLOCK NameSystem.addToCorruptReplicasMap: {} added as corrupt on "
              + "{} by {} {}", blk, dn, Server.getRemoteIp(),
          reasonText);
    } else {
      NameNode.blockStateChangeLog.debug(
          "BLOCK NameSystem.addToCorruptReplicasMap: duplicate requested for" +
              " {} to add as corrupt on {} by {} {}", blk, dn,
          Server.getRemoteIp(), reasonText);
    }
    // Add the node or update the reason.
    nodes.put(dn, reasonCode);
  }

  /**
   * Remove Block from CorruptBlocksMap.
   * @param blk Block to be removed
   */
  void removeFromCorruptReplicasMap(BlockInfo blk) {
    if (corruptReplicasMap != null) {
      Map<DatanodeDescriptor, Reason> value = corruptReplicasMap.remove(blk);
      if (value != null) {
        decrementBlockStat();
      }
    }
  }

  /**
   * Remove the block at the given datanode from CorruptBlockMap
   * @param blk block to be removed
   * @param datanode datanode where the block is located
   * @return true if the removal is successful; 
  false if the replica is not in the map
   */
  boolean removeFromCorruptReplicasMap(
      BlockInfo blk, DatanodeDescriptor datanode) {
    return removeFromCorruptReplicasMap(blk, datanode, Reason.ANY);
  }

  boolean removeFromCorruptReplicasMap(
      BlockInfo blk, DatanodeDescriptor datanode, Reason reason) {
    Map<DatanodeDescriptor, Reason> datanodes = corruptReplicasMap.get(blk);
    if (datanodes == null) {
      return false;
    }

    // if reasons can be compared but don't match, return false.
    Reason storedReason = datanodes.get(datanode);
    if (reason != Reason.ANY && storedReason != null &&
        reason != storedReason) {
      return false;
    }

    if (datanodes.remove(datanode) != null) { // remove the replicas
      if (datanodes.isEmpty()) {
        // remove the block if there is no more corrupted replicas
        corruptReplicasMap.remove(blk);
        decrementBlockStat();
      }
      return true;
    }
    return false;
  }

  private void incrementBlockStat() {
    totalCorruptBlocks.increment();
  }

  private void decrementBlockStat() {
    totalCorruptBlocks.decrement();
  }

  /**
   * Get Nodes which have corrupt replicas of Block
   *
   * @param blk Block for which nodes are requested
   * @return collection of nodes. Null if does not exists
   */
  Collection<DatanodeDescriptor> getNodes(Block blk) {
    Map<DatanodeDescriptor, Reason> nodes = corruptReplicasMap.get(blk);
    if (nodes == null)
      return null;
    return nodes.keySet();
  }

  /**
   * Check if replica belonging to Datanode is corrupt
   *
   * @param blk Block to check
   * @param node DatanodeDescriptor which holds the replica
   * @return true if replica is corrupt, false if does not exists in this map
   */
  boolean isReplicaCorrupt(Block blk, DatanodeDescriptor node) {
    Collection<DatanodeDescriptor> nodes = getNodes(blk);
    return ((nodes != null) && (nodes.contains(node)));
  }

  int numCorruptReplicas(Block blk) {
    Collection<DatanodeDescriptor> nodes = getNodes(blk);
    return (nodes == null) ? 0 : nodes.size();
  }

  int size() {
    return corruptReplicasMap.size();
  }

  /**
   * method to get the set of corrupt blocks in corruptReplicasMap.
   * @return Set of Block objects
   */
  Set<Block> getCorruptBlocksSet() {
    return new HashSet<>(corruptReplicasMap.keySet());
  }

  /**
   * return the reason about corrupted replica for a given block
   * on a given dn
   * @param block block that has corrupted replica
   * @param node datanode that contains this corrupted replica
   * @return reason
   */
  String getCorruptReason(Block block, DatanodeDescriptor node) {
    Reason reason = null;
    if (corruptReplicasMap.containsKey(block)) {
      if (corruptReplicasMap.get(block).containsKey(node)) {
        reason = corruptReplicasMap.get(block).get(node);
      }
    }
    if (reason != null) {
      return reason.toString();
    } else {
      return null;
    }
  }

  long getCorruptBlocks() {
    return totalCorruptBlocks.longValue();
  }

}
