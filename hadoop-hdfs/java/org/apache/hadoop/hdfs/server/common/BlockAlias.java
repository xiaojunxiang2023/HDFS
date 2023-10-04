package org.apache.hadoop.hdfs.server.common;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.protocol.Block;

/**
 * Interface used to load provided blocks.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface BlockAlias {

    Block getBlock();

}
