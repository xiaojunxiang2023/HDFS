package org.apache.hadoop.hdfs;

import org.apache.hadoop.fs.CreateFlag;
import org.apache.hadoop.hdfs.protocol.ClientProtocol;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;

import java.util.EnumSet;

/**
 * AddBlockFlag provides hints for new block allocation and placement.
 * Users can use this flag to control <em>per DFSOutputStream</em>
 * @see ClientProtocol#addBlock(String, String, ExtendedBlock, DatanodeInfo[],
 *      long, String[], EnumSet)
 */
public enum AddBlockFlag {

  /**
   * Advise that a block replica NOT be written to the local DataNode where
   * 'local' means the same host as the client is being run on.
   *
   * @see CreateFlag#NO_LOCAL_WRITE
   */
  NO_LOCAL_WRITE((short) 0x01),

  /**
   * Advise that the first block replica NOT take into account DataNode
   * locality. The first block replica should be placed randomly within the
   * cluster. Subsequent block replicas should follow DataNode locality rules.
   *
   * @see CreateFlag#IGNORE_CLIENT_LOCALITY
   */
  IGNORE_CLIENT_LOCALITY((short) 0x02),

  /**
   * Advise that a block replica NOT be written to the local rack DataNode where
   * 'local' means the same host as the client is being run on.
   *
   * @see CreateFlag#NO_LOCAL_WRITE
   */
  NO_LOCAL_RACK((short) 0x03);

  private final short mode;

  AddBlockFlag(short mode) {
    this.mode = mode;
  }

  public static AddBlockFlag valueOf(short mode) {
    for (AddBlockFlag flag : AddBlockFlag.values()) {
      if (flag.getMode() == mode) {
        return flag;
      }
    }
    return null;
  }

  public short getMode() {
    return mode;
  }
}
