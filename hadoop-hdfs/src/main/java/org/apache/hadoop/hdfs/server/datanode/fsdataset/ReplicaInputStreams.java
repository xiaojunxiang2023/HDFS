package org.apache.hadoop.hdfs.server.datanode.fsdataset;

import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.hdfs.server.datanode.FileIoProvider;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.nativeio.NativeIOException;
import org.slf4j.Logger;

import java.io.*;

/**
 * Contains the input streams for the data and checksum of a replica.
 */
public class ReplicaInputStreams implements Closeable {
  public static final Logger LOG = DataNode.LOG;
  private final FileIoProvider fileIoProvider;
  private InputStream dataIn;
  private InputStream checksumIn;
  private FsVolumeReference volumeRef;
  private FileDescriptor dataInFd = null;

  /** Create an object with a data input stream and a checksum input stream. */
  public ReplicaInputStreams(
      InputStream dataStream, InputStream checksumStream,
      FsVolumeReference volumeRef, FileIoProvider fileIoProvider) {
    this.volumeRef = volumeRef;
    this.fileIoProvider = fileIoProvider;
    this.dataIn = dataStream;
    this.checksumIn = checksumStream;
    if (dataIn instanceof FileInputStream) {
      try {
        dataInFd = ((FileInputStream) dataIn).getFD();
      } catch (Exception e) {
        LOG.warn("Could not get file descriptor for inputstream of class " +
            this.dataIn.getClass());
      }
    } else {
      LOG.debug("Could not get file descriptor for inputstream of class " +
          this.dataIn.getClass());
    }
  }

  /** @return the data input stream. */
  public InputStream getDataIn() {
    return dataIn;
  }

  /** @return the checksum input stream. */
  public InputStream getChecksumIn() {
    return checksumIn;
  }

  public FileDescriptor getDataInFd() {
    return dataInFd;
  }

  public FsVolumeReference getVolumeRef() {
    return volumeRef;
  }

  public void readDataFully(byte[] buf, int off, int len)
      throws IOException {
    IOUtils.readFully(dataIn, buf, off, len);
  }

  public void readChecksumFully(byte[] buf, int off, int len)
      throws IOException {
    IOUtils.readFully(checksumIn, buf, off, len);
  }

  public void skipDataFully(long len) throws IOException {
    IOUtils.skipFully(dataIn, len);
  }

  public void skipChecksumFully(long len) throws IOException {
    IOUtils.skipFully(checksumIn, len);
  }

  public void closeChecksumStream() throws IOException {
    IOUtils.closeStream(checksumIn);
    checksumIn = null;
  }

  public void dropCacheBehindReads(String identifier, long offset, long len,
                                   int flags) throws NativeIOException {
    assert this.dataInFd != null : "null dataInFd!";
    fileIoProvider.posixFadvise(getVolumeRef().getVolume(),
        identifier, dataInFd, offset, len, flags);
  }

  public void closeStreams() throws IOException {
    IOException ioe = null;
    if (checksumIn != null) {
      try {
        checksumIn.close(); // close checksum file
      } catch (IOException e) {
        ioe = e;
      }
      checksumIn = null;
    }
    if (dataIn != null) {
      try {
        dataIn.close(); // close data file
      } catch (IOException e) {
        ioe = e;
      }
      dataIn = null;
      dataInFd = null;
    }
    if (volumeRef != null) {
      IOUtils.cleanupWithLogger(null, volumeRef);
      volumeRef = null;
    }
    // throw IOException if there is any
    if (ioe != null) {
      throw ioe;
    }
  }

  @Override
  public void close() {
    IOUtils.closeStream(dataIn);
    dataIn = null;
    dataInFd = null;
    IOUtils.closeStream(checksumIn);
    checksumIn = null;
    IOUtils.cleanupWithLogger(null, volumeRef);
    volumeRef = null;
  }
}