package org.apache.hadoop.fs;

import org.apache.hadoop.hdfs.protocol.LocatedBlock;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Wrapper for {@link BlockLocation} that also includes a {@link LocatedBlock},
 * allowing more detailed queries to the datanode about a block.
 *
 */
public class HdfsBlockLocation extends BlockLocation implements Serializable {
  private static final long serialVersionUID = 0x7aecec92;

  private transient LocatedBlock block;

  public HdfsBlockLocation(BlockLocation loc, LocatedBlock block) {
    // Initialize with data from passed in BlockLocation
    super(loc);
    this.block = block;
  }

  public LocatedBlock getLocatedBlock() {
    return block;
  }

  private void readObject(ObjectInputStream ois)
      throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    // LocatedBlock is not Serializable
    block = null;
  }

  @Override
  public boolean isStriped() {
    return block.isStriped();
  }
}
