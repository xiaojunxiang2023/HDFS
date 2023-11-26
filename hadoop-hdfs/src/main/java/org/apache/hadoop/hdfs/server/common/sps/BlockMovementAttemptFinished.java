package org.apache.hadoop.hdfs.server.common.sps;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;

/**
 * This class represents status from a block movement task. This will have the
 * information of the task which was successful or failed due to errors.
 */
public class BlockMovementAttemptFinished {
    private final Block block;
    private final DatanodeInfo src;
    private final DatanodeInfo target;
    private final StorageType targetType;
    private final BlockMovementStatus status;

    /**
     * Construct movement attempt finished info.
     *
     * @param block
     *          block
     * @param src
     *          src datanode
     * @param target
     *          target datanode
     * @param targetType
     *          target storage type
     * @param status
     *          movement status
     */
    public BlockMovementAttemptFinished(Block block, DatanodeInfo src,
                                        DatanodeInfo target, StorageType targetType, BlockMovementStatus status) {
        this.block = block;
        this.src = src;
        this.target = target;
        this.targetType = targetType;
        this.status = status;
    }

    /**
     * @return details of the block, which attempted to move from src to target
     *         node.
     */
    public Block getBlock() {
        return block;
    }

    /**
     * @return the target datanode where it moved the block.
     */
    public DatanodeInfo getTargetDatanode() {
        return target;
    }

    /**
     * @return target storage type.
     */
    public StorageType getTargetType() {
        return targetType;
    }

    /**
     * @return block movement status code.
     */
    public BlockMovementStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Block movement attempt finished(\n  ")
                .append(" block : ").append(block).append(" src node: ").append(src)
                .append(" target node: ").append(target).append(" target type: ")
                .append(targetType).append(" movement status: ")
                .append(status).append(")").toString();
    }
}