package org.apache.hadoop.hdfs;

import org.apache.hadoop.fs.ByteBufferReadable;
import org.apache.hadoop.fs.ReadOption;
import org.apache.hadoop.hdfs.shortcircuit.ClientMmap;
import org.apache.hadoop.util.DataChecksum;

import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

/**
 * A BlockReader is responsible for reading a single block
 * from a single datanode.
 */
public interface BlockReader extends ByteBufferReadable, Closeable {


  /* same interface as inputStream java.io.InputStream#read()
   * used by DFSInputStream#read()
   * This violates one rule when there is a checksum error:
   * "Read should not modify user buffer before successful read"
   * because it first reads the data to user buffer and then checks
   * the checksum.
   * Note: this must return -1 on EOF, even in the case of a 0-byte read.
   * See HDFS-5762 for details.
   */
  int read(byte[] buf, int off, int len) throws IOException;

  /**
   * Skip the given number of bytes
   */
  long skip(long n) throws IOException;

  /**
   * Returns an estimate of the number of bytes that can be read
   * (or skipped over) from this input stream without performing
   * network I/O.
   * This may return more than what is actually present in the block.
   */
  int available();

  /**
   * Close the block reader.
   *
   * @throws IOException
   */
  @Override
  // java.io.Closeable
  void close() throws IOException;

  /**
   * Read exactly the given amount of data, throwing an exception
   * if EOF is reached before that amount
   */
  void readFully(byte[] buf, int readOffset, int amtToRead) throws IOException;

  /**
   * Similar to {@link #readFully(byte[], int, int)} except that it will
   * not throw an exception on EOF. However, it differs from the simple
   * {@link #read(byte[], int, int)} call in that it is guaranteed to
   * read the data if it is available. In other words, if this call
   * does not throw an exception, then either the buffer has been
   * filled or the next call will return EOF.
   */
  int readAll(byte[] buf, int offset, int len) throws IOException;

  /**
   * @return true only if this is a short-circuit read.
   *                      All short-circuit reads are also local.
   */
  boolean isShortCircuit();

  /**
   * Get a ClientMmap object for this BlockReader.
   *
   * @param opts          The read options to use.
   * @return The ClientMmap object, or null if mmap is not
   *                      supported.
   */
  ClientMmap getClientMmap(EnumSet<ReadOption> opts);

  /**
   * @return The DataChecksum used by the read block
   */
  DataChecksum getDataChecksum();

  /**
   * Return the network distance between local machine and the remote machine.
   */
  int getNetworkDistance();
}
