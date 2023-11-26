package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.hadoop.ipc.RemoteException;

import java.util.List;

/**
 * A partial listing returned by the batched listing API. This is used
 * internally by the HDFS client and namenode and is not meant for public
 * consumption.
 */
public class HdfsPartialListing {

  private final List<HdfsFileStatus> partialListing;
  private final int parentIdx;
  private final RemoteException exception;

  public HdfsPartialListing(
      int parentIdx,
      List<HdfsFileStatus> partialListing) {
    this(parentIdx, partialListing, null);
  }

  public HdfsPartialListing(
      int parentIdx,
      RemoteException exception) {
    this(parentIdx, null, exception);
  }

  private HdfsPartialListing(
      int parentIdx,
      List<HdfsFileStatus> partialListing,
      RemoteException exception) {
    Preconditions.checkArgument(partialListing == null ^ exception == null);
    this.parentIdx = parentIdx;
    this.partialListing = partialListing;
    this.exception = exception;
  }

  public int getParentIdx() {
    return parentIdx;
  }

  public List<HdfsFileStatus> getPartialListing() {
    return partialListing;
  }

  public RemoteException getException() {
    return exception;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("partialListing", partialListing)
        .append("parentIdx", parentIdx)
        .append("exception", exception)
        .toString();
  }
}
