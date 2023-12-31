package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.DFSUtil;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.hdfs.util.LightWeightHashSet;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.util.Time;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.LongAdder;

/**
 * Keeps a Collection for every named machine containing blocks
 * that have recently been invalidated and are thought to live
 * on the machine in question.
 */
class InvalidateBlocks {
  private final Map<DatanodeInfo, LightWeightHashSet<Block>>
      nodeToBlocks = new HashMap<>();
  private final Map<DatanodeInfo, LightWeightHashSet<Block>>
      nodeToECBlocks = new HashMap<>();
  private final LongAdder numBlocks = new LongAdder();
  private final LongAdder numECBlocks = new LongAdder();
  private final int blockInvalidateLimit;
  private final BlockIdManager blockIdManager;

  /**
   * The period of pending time for block invalidation since the NameNode
   * startup
   */
  private final long pendingPeriodInMs;
  /** the startup time */
  private final long startupTime = Time.monotonicNow();

  InvalidateBlocks(final int blockInvalidateLimit, long pendingPeriodInMs,
                   final BlockIdManager blockIdManager) {
    this.blockInvalidateLimit = blockInvalidateLimit;
    this.pendingPeriodInMs = pendingPeriodInMs;
    this.blockIdManager = blockIdManager;
    printBlockDeletionTime();
  }

  private void printBlockDeletionTime() {
    BlockManager.LOG.info("{} is set to {}",
        DFSConfigKeys.DFS_NAMENODE_STARTUP_DELAY_BLOCK_DELETION_SEC_KEY,
        DFSUtil.durationToString(pendingPeriodInMs));
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
    Calendar calendar = new GregorianCalendar();
    calendar.add(Calendar.SECOND, (int) (this.pendingPeriodInMs / 1000));
    BlockManager.LOG.info("The block deletion will start around {}",
        sdf.format(calendar.getTime()));
  }

  /**
   * @return The total number of blocks to be invalidated.
   */
  long numBlocks() {
    return getECBlocks() + getBlocks();
  }

  /**
   * @return The total number of blocks of type
   * {@link org.apache.hadoop.hdfs.protocol.BlockType#CONTIGUOUS}
   * to be invalidated.
   */
  long getBlocks() {
    return numBlocks.longValue();
  }

  /**
   * @return The total number of blocks of type
   * {@link org.apache.hadoop.hdfs.protocol.BlockType#STRIPED}
   * to be invalidated.
   */
  long getECBlocks() {
    return numECBlocks.longValue();
  }

  private LightWeightHashSet<Block> getBlocksSet(final DatanodeInfo dn) {
    return nodeToBlocks.get(dn);
  }

  private LightWeightHashSet<Block> getECBlocksSet(final DatanodeInfo dn) {
    return nodeToECBlocks.get(dn);
  }

  private LightWeightHashSet<Block> getBlocksSet(final DatanodeInfo dn,
                                                 final Block block) {
    return getBlocksSet(dn);
  }

  private void putBlocksSet(final DatanodeInfo dn,
                            final LightWeightHashSet set) {
    assert getBlocksSet(dn) == null;
    nodeToBlocks.put(dn, set);
  }

  private long getBlockSetsSize(final DatanodeInfo dn) {
    LightWeightHashSet<Block> replicaBlocks = getBlocksSet(dn);
    LightWeightHashSet<Block> stripedBlocks = getECBlocksSet(dn);
    return ((replicaBlocks == null ? 0 : replicaBlocks.size()) +
        (stripedBlocks == null ? 0 : stripedBlocks.size()));
  }


  /**
   * @return true if the given storage has the given block listed for
   * invalidation. Blocks are compared including their generation stamps:
   * if a block is pending invalidation but with a different generation stamp,
   * returns false.
   */
  synchronized boolean contains(final DatanodeInfo dn, final Block block) {
    final LightWeightHashSet<Block> s = getBlocksSet(dn, block);
    if (s == null) {
      return false; // no invalidate blocks for this storage ID
    }
    Block blockInSet = s.getElement(block);
    return blockInSet != null &&
        block.getGenerationStamp() == blockInSet.getGenerationStamp();
  }

  /**
   * Add a block to the block collection which will be
   * invalidated on the specified datanode.
   */
  synchronized void add(final Block block, final DatanodeInfo datanode,
                        final boolean log) {
    LightWeightHashSet<Block> set = getBlocksSet(datanode, block);
    if (set == null) {
      set = new LightWeightHashSet<>();
      putBlocksSet(datanode, set);
    }
    if (set.add(block)) {
      numBlocks.increment();
      if (log) {
        NameNode.blockStateChangeLog.debug("BLOCK* {}: add {} to {}",
            getClass().getSimpleName(), block, datanode);
      }
    }
  }

  /** Remove a storage from the invalidatesSet */
  synchronized void remove(final DatanodeInfo dn) {
    LightWeightHashSet<Block> replicaBlockSets = nodeToBlocks.remove(dn);
    if (replicaBlockSets != null) {
      numBlocks.add(replicaBlockSets.size() * -1);
    }
    LightWeightHashSet<Block> ecBlocksSet = nodeToECBlocks.remove(dn);
    if (ecBlocksSet != null) {
      numECBlocks.add(ecBlocksSet.size() * -1);
    }
  }

  /** Remove the block from the specified storage. */
  synchronized void remove(final DatanodeInfo dn, final Block block) {
    final LightWeightHashSet<Block> v = getBlocksSet(dn, block);
    if (v != null && v.remove(block)) {
      numBlocks.decrement();
      if (v.isEmpty() && getBlockSetsSize(dn) == 0) {
        remove(dn);
      }
    }
  }

  private void dumpBlockSet(final Map<DatanodeInfo,
      LightWeightHashSet<Block>> nodeToBlocksMap, final PrintWriter out) {
    for (Entry<DatanodeInfo, LightWeightHashSet<Block>> entry :
        nodeToBlocksMap.entrySet()) {
      final LightWeightHashSet<Block> blocks = entry.getValue();
      if (blocks != null && blocks.size() > 0) {
        out.println(entry.getKey());
        out.println(StringUtils.join(',', blocks));
      }
    }
  }

  /** Print the contents to out. */
  synchronized void dump(final PrintWriter out) {
    final int size = nodeToBlocks.values().size() +
        nodeToECBlocks.values().size();
    out.println("Metasave: Blocks " + numBlocks()
        + " waiting deletion from " + size + " datanodes.");
    if (size == 0) {
      return;
    }
    dumpBlockSet(nodeToBlocks, out);
    dumpBlockSet(nodeToECBlocks, out);
  }

  /** @return a list of the storage IDs. */
  synchronized List<DatanodeInfo> getDatanodes() {
    HashSet<DatanodeInfo> set = new HashSet<>();
    set.addAll(nodeToBlocks.keySet());
    set.addAll(nodeToECBlocks.keySet());
    return new ArrayList<>(set);
  }

  /**
   * @return the remianing pending time
   */

  long getInvalidationDelay() {
    return pendingPeriodInMs - (Time.monotonicNow() - startupTime);
  }

  /**
   * Get blocks to invalidate by limit as blocks that can be sent in one
   * message is limited.
   * @return the remaining limit
   */
  private int getBlocksToInvalidateByLimit(LightWeightHashSet<Block> blockSet,
                                           List<Block> toInvalidate, LongAdder statsAdder, int limit) {
    assert blockSet != null;
    int remainingLimit = limit;
    List<Block> polledBlocks = blockSet.pollN(limit);
    remainingLimit -= polledBlocks.size();
    toInvalidate.addAll(polledBlocks);
    statsAdder.add(polledBlocks.size() * -1);
    return remainingLimit;
  }

  synchronized List<Block> invalidateWork(final DatanodeDescriptor dn) {
    final long delay = getInvalidationDelay();
    if (delay > 0) {
      BlockManager.LOG
          .debug("Block deletion is delayed during NameNode startup. "
              + "The deletion will start after {} ms.", delay);
      return null;
    }

    int remainingLimit = blockInvalidateLimit;
    final List<Block> toInvalidate = new ArrayList<>();

    if (nodeToBlocks.get(dn) != null) {
      remainingLimit = getBlocksToInvalidateByLimit(nodeToBlocks.get(dn),
          toInvalidate, numBlocks, remainingLimit);
    }
    if ((remainingLimit > 0) && (nodeToECBlocks.get(dn) != null)) {
      getBlocksToInvalidateByLimit(nodeToECBlocks.get(dn),
          toInvalidate, numECBlocks, remainingLimit);
    }
    if (toInvalidate.size() > 0) {
      if (getBlockSetsSize(dn) == 0) {
        remove(dn);
      }
      dn.addBlocksToBeInvalidated(toInvalidate);
    }
    return toInvalidate;
  }

  synchronized void clear() {
    nodeToBlocks.clear();
    nodeToECBlocks.clear();
    numBlocks.reset();
    numECBlocks.reset();
  }
}
