package org.apache.hadoop.hdfs.server.common;
import org.apache.hadoop.hdfs.protocol.Block;

/**
 * Interface used to load provided blocks.
 */
public interface BlockAlias {

    Block getBlock();

}
