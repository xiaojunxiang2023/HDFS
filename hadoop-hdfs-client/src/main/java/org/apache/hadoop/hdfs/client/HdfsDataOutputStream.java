package org.apache.hadoop.hdfs.client;

import org.apache.hadoop.crypto.CryptoOutputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.hdfs.DFSOutputStream;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumSet;

/**
 * The Hdfs implementation of {@link FSDataOutputStream}.
 */
public class HdfsDataOutputStream extends FSDataOutputStream {
  public HdfsDataOutputStream(DFSOutputStream out, FileSystem.Statistics stats,
                              long startPosition) throws IOException {
    super(out, stats, startPosition);
  }

  public HdfsDataOutputStream(DFSOutputStream out, FileSystem.Statistics stats)
      throws IOException {
    this(out, stats, 0L);
  }

  public HdfsDataOutputStream(CryptoOutputStream out,
                              FileSystem.Statistics stats, long startPosition) throws IOException {
    super(out, stats, startPosition);
    Preconditions.checkArgument(
        out.getWrappedStream() instanceof DFSOutputStream,
        "CryptoOutputStream should wrap a DFSOutputStream");
  }

  public HdfsDataOutputStream(CryptoOutputStream out,
                              FileSystem.Statistics stats) throws IOException {
    this(out, stats, 0L);
  }

  /**
   * Get the actual number of replicas of the current block.
   *
   * This can be different from the designated replication factor of the file
   * because the namenode does not maintain replication for the blocks which are
   * currently being written to. Depending on the configuration, the client may
   * continue to write to a block even if a few datanodes in the write pipeline
   * have failed, or the client may add a new datanodes once a datanode has
   * failed.
   *
   * @return the number of valid replicas of the current block
   */
  public synchronized int getCurrentBlockReplication() throws IOException {
    OutputStream wrappedStream = getWrappedStream();
    if (wrappedStream instanceof CryptoOutputStream) {
      wrappedStream = ((CryptoOutputStream) wrappedStream).getWrappedStream();
    }
    return ((DFSOutputStream) wrappedStream).getCurrentBlockReplication();
  }

  /**
   * Sync buffered data to DataNodes (flush to disk devices).
   *
   * @param syncFlags
   *          Indicate the detailed semantic and actions of the hsync.
   * @throws IOException
   * @see FSDataOutputStream#hsync()
   */
  public void hsync(EnumSet<SyncFlag> syncFlags) throws IOException {
    OutputStream wrappedStream = getWrappedStream();
    if (wrappedStream instanceof CryptoOutputStream) {
      wrappedStream.flush();
      wrappedStream = ((CryptoOutputStream) wrappedStream).getWrappedStream();
    }
    ((DFSOutputStream) wrappedStream).hsync(syncFlags);
  }

  public enum SyncFlag {

    /**
     * When doing sync to DataNodes, also update the metadata (block length) in
     * the NameNode.
     */
    UPDATE_LENGTH,

    /**
     * Sync the data to DataNode, close the current block, and allocate a new
     * block
     */
    END_BLOCK
  }
}
