package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.BlockType;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.BlockUCState;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.util.LightWeightGSet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import static org.apache.hadoop.hdfs.server.namenode.INodeId.INVALID_INODE_ID;

public abstract class BlockInfo extends Block implements LightWeightGSet.LinkedElement {

  public static final BlockInfo[] EMPTY_ARRAY = {};

  // 副本因子
  private short replication;

  private volatile long bcId;

  // LightWeightGSet的一个元素 (next 结构)
  private LightWeightGSet.LinkedElement nextLinkedElement;

  // 压缩字节存储的三元组，triplets[3*i+1] and triplets[3*i+2] 分别代表着前后的 Block
  // triplets[3*i] 代表着存储着当前 block的其中一个 DatanodeStorageInfo
  protected Object[] triplets;

  // 是否处于构建中状态，null代表着否
  private BlockUnderConstructionFeature uc;

  public BlockInfo(short size) {
    this.triplets = new Object[3 * size];
    this.bcId = INVALID_INODE_ID;
    this.replication = size;
  }

  public BlockInfo(Block blk, short size) {
    super(blk);
    this.triplets = new Object[3 * size];
    this.bcId = INVALID_INODE_ID;
    this.replication = size;
  }

  public short getReplication() {
    return replication;
  }

  public void setReplication(short repl) {
    this.replication = repl;
  }

  public long getBlockCollectionId() {
    return bcId;
  }

  public void setBlockCollectionId(long id) {
    this.bcId = id;
  }

  public void delete() {
    setBlockCollectionId(INVALID_INODE_ID);
  }

  public boolean isDeleted() {
    return bcId == INVALID_INODE_ID;
  }

  public Iterator<DatanodeStorageInfo> getStorageInfos() {
    return new BlocksMap.StorageIterator(this);
  }

  public DatanodeDescriptor getDatanode(int index) {
    DatanodeStorageInfo storage = getStorageInfo(index);
    return storage == null ? null : storage.getDatanodeDescriptor();
  }

  DatanodeStorageInfo getStorageInfo(int index) {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert index >= 0 && index * 3 < triplets.length : "Index is out of bound";
    return (DatanodeStorageInfo) triplets[index * 3];
  }

  BlockInfo getPrevious(int index) {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert index >= 0 && index * 3 + 1 < triplets.length : "Index is out of bound";
    BlockInfo info = (BlockInfo) triplets[index * 3 + 1];
    assert info == null ||
        info.getClass().getName().startsWith(BlockInfo.class.getName()) :
        "BlockInfo is expected at " + index * 3;
    return info;
  }

  BlockInfo getNext(int index) {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert index >= 0 && index * 3 + 2 < triplets.length : "Index is out of bound";
    BlockInfo info = (BlockInfo) triplets[index * 3 + 2];
    assert info == null || info.getClass().getName().startsWith(
        BlockInfo.class.getName()) :
        "BlockInfo is expected at " + index * 3;
    return info;
  }

  void setStorageInfo(int index, DatanodeStorageInfo storage) {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert index >= 0 && index * 3 < triplets.length : "Index is out of bound";
    triplets[index * 3] = storage;
  }

  /**
   * Return the previous block on the block list for the datanode at
   * position index. Set the previous block on the list to "to".
   *
   * @param index - the datanode index
   * @param to - block to be set to previous on the list of blocks
   * @return current previous block on the list of blocks
   */
  BlockInfo setPrevious(int index, BlockInfo to) {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert index >= 0 && index * 3 + 1 < triplets.length : "Index is out of bound";
    BlockInfo info = (BlockInfo) triplets[index * 3 + 1];
    triplets[index * 3 + 1] = to;
    return info;
  }

  /**
   * Return the next block on the block list for the datanode at
   * position index. Set the next block on the list to "to".
   *
   * @param index - the datanode index
   * @param to - block to be set to next on the list of blocks
   * @return current next block on the list of blocks
   */
  BlockInfo setNext(int index, BlockInfo to) {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert index >= 0 && index * 3 + 2 < triplets.length : "Index is out of bound";
    BlockInfo info = (BlockInfo) triplets[index * 3 + 2];
    triplets[index * 3 + 2] = to;
    return info;
  }

  public int getCapacity() {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert triplets.length % 3 == 0 : "Malformed BlockInfo";
    return triplets.length / 3;
  }

  /**
   * Count the number of data-nodes the block currently belongs to (i.e., NN
   * has received block reports from the DN).
   */
  public abstract int numNodes();

  /**
   * Add a {@link DatanodeStorageInfo} location for a block
   * @param storage The storage to add
   * @param reportedBlock The block reported from the datanode. This is only
   *                      used by erasure coded blocks, this block's id contains
   *                      information indicating the index of the block in the
   *                      corresponding block group.
   */
  abstract boolean addStorage(DatanodeStorageInfo storage, Block reportedBlock);

  /**
   * Remove {@link DatanodeStorageInfo} location for a block
   */
  abstract boolean removeStorage(DatanodeStorageInfo storage);

  public abstract BlockType getBlockType();

  /** @return true if there is no datanode storage associated with the block */
  abstract boolean hasNoStorage();

  /**
   * Checks whether this block has a Provided replica.
   * @return true if this block has a replica on Provided storage.
   */
  abstract boolean isProvided();

  /**
   * Find specified DatanodeStorageInfo.
   * @return DatanodeStorageInfo or null if not found.
   */
  DatanodeStorageInfo findStorageInfo(DatanodeDescriptor dn) {
    int len = getCapacity();
    DatanodeStorageInfo providedStorageInfo = null;
    for (int idx = 0; idx < len; idx++) {
      DatanodeStorageInfo cur = getStorageInfo(idx);
      if (cur != null) {
        if (cur.getStorageType() == StorageType.PROVIDED) {
          // if block resides on provided storage, only match the storage ids
          if (dn.getStorageInfo(cur.getStorageID()) != null) {
            // do not return here as we have to check the other
            // DatanodeStorageInfos for this block which could be local
            providedStorageInfo = cur;
          }
        } else if (cur.getDatanodeDescriptor() == dn) {
          return cur;
        }
      }
    }
    return providedStorageInfo;
  }

  /**
   * Find specified DatanodeStorageInfo.
   * @return index or -1 if not found.
   */
  int findStorageInfo(DatanodeStorageInfo storageInfo) {
    int len = getCapacity();
    for (int idx = 0; idx < len; idx++) {
      DatanodeStorageInfo cur = getStorageInfo(idx);
      if (cur == storageInfo) {
        return idx;
      }
    }
    return -1;
  }

  /**
   * Insert this block into the head of the list of blocks
   * related to the specified DatanodeStorageInfo.
   * If the head is null then form a new list.
   * @return current block as the new head of the list.
   */
  BlockInfo listInsert(BlockInfo head, DatanodeStorageInfo storage) {
    int dnIndex = this.findStorageInfo(storage);
    assert dnIndex >= 0 : "Data node is not found: current";
    assert getPrevious(dnIndex) == null && getNext(dnIndex) == null :
        "Block is already in the list and cannot be inserted.";
    this.setPrevious(dnIndex, null);
    this.setNext(dnIndex, head);
    if (head != null) {
      head.setPrevious(head.findStorageInfo(storage), this);
    }
    return this;
  }

  /**
   * Remove this block from the list of blocks
   * related to the specified DatanodeStorageInfo.
   * If this block is the head of the list then return the next block as
   * the new head.
   * @return the new head of the list or null if the list becomes
   * empy after deletion.
   */
  BlockInfo listRemove(BlockInfo head, DatanodeStorageInfo storage) {
    if (head == null) {
      return null;
    }
    int dnIndex = this.findStorageInfo(storage);
    if (dnIndex < 0) { // this block is not on the data-node list
      return head;
    }

    BlockInfo next = this.getNext(dnIndex);
    BlockInfo prev = this.getPrevious(dnIndex);
    this.setNext(dnIndex, null);
    this.setPrevious(dnIndex, null);
    if (prev != null) {
      prev.setNext(prev.findStorageInfo(storage), next);
    }
    if (next != null) {
      next.setPrevious(next.findStorageInfo(storage), prev);
    }
    if (this == head) { // removing the head
      head = next;
    }
    return head;
  }

  /**
   * Remove this block from the list of blocks related to the specified
   * DatanodeDescriptor. Insert it into the head of the list of blocks.
   *
   * @return the new head of the list.
   */
  public BlockInfo moveBlockToHead(BlockInfo head, DatanodeStorageInfo storage,
                                   int curIndex, int headIndex) {
    if (head == this) {
      return this;
    }
    BlockInfo next = this.setNext(curIndex, head);
    BlockInfo prev = this.setPrevious(curIndex, null);

    head.setPrevious(headIndex, this);
    prev.setNext(prev.findStorageInfo(storage), next);
    if (next != null) {
      next.setPrevious(next.findStorageInfo(storage), prev);
    }
    return this;
  }

  @Override
  public int hashCode() {
    // Super implementation is sufficient
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    // Sufficient to rely on super's implementation
    return (this == obj) || super.equals(obj);
  }

  @Override
  public LightWeightGSet.LinkedElement getNext() {
    return nextLinkedElement;
  }

  @Override
  public void setNext(LightWeightGSet.LinkedElement next) {
    this.nextLinkedElement = next;
  }

  /* UnderConstruction Feature related */

  public BlockUnderConstructionFeature getUnderConstructionFeature() {
    return uc;
  }

  public BlockUCState getBlockUCState() {
    return uc == null ? BlockUCState.COMPLETE : uc.getBlockUCState();
  }

  /**
   * Is this block complete?
   *
   * @return true if the state of the block is {@link BlockUCState#COMPLETE}
   */
  public boolean isComplete() {
    return getBlockUCState().equals(BlockUCState.COMPLETE);
  }

  public boolean isUnderRecovery() {
    return getBlockUCState().equals(BlockUCState.UNDER_RECOVERY);
  }

  public final boolean isCompleteOrCommitted() {
    final BlockUCState state = getBlockUCState();
    return state.equals(BlockUCState.COMPLETE) ||
        state.equals(BlockUCState.COMMITTED);
  }

  public void convertToBlockUnderConstruction(BlockUCState s,
                                              DatanodeStorageInfo[] targets) {
    if (isComplete()) {
      uc = new BlockUnderConstructionFeature(this, s, targets,
          this.getBlockType());
    } else {
      // the block is already under construction
      uc.setBlockUCState(s);
      uc.setExpectedLocations(this, targets, this.getBlockType());
    }
  }

  void convertToCompleteBlock() {
    assert getBlockUCState() != BlockUCState.COMPLETE :
        "Trying to convert a COMPLETE block";
    uc = null;
  }

  /**
   * Process the recorded replicas. When about to commit or finish the
   * pipeline recovery sort out bad replicas.
   * @param genStamp  The final generation stamp for the block.
   * @return staleReplica's List.
   */
  public List<ReplicaUnderConstruction> setGenerationStampAndVerifyReplicas(
      long genStamp) {
    Preconditions.checkState(uc != null && !isComplete());
    // Set the generation stamp for the block.
    setGenerationStamp(genStamp);

    return uc.getStaleReplicas(genStamp);
  }

  List<ReplicaUnderConstruction> commitBlock(Block block) throws IOException {
    if (getBlockId() != block.getBlockId()) {
      throw new IOException("Trying to commit inconsistent block: id = "
          + block.getBlockId() + ", expected id = " + getBlockId());
    }
    Preconditions.checkState(!isComplete());
    uc.commit();
    this.setNumBytes(block.getNumBytes());
    // Sort out invalid replicas.
    return setGenerationStampAndVerifyReplicas(block.getGenerationStamp());
  }

  private byte[] indices;

  public byte getStorageBlockIndex(DatanodeStorageInfo storage) {
    int i = this.findStorageInfo(storage);
    return i == -1 ? -1 : indices[i];
  }
}
