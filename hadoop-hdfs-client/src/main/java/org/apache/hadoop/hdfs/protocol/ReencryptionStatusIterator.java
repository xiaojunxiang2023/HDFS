package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.fs.BatchedRemoteIterator;
import org.apache.hadoop.tracing.TraceScope;
import org.apache.hadoop.tracing.Tracer;

import java.io.IOException;

/**
 * ReencryptionStatusIterator is a remote iterator that iterates over the
 * reencryption status of encryption zones.
 * It supports retrying in case of namenode failover.
 */
public class ReencryptionStatusIterator
    extends BatchedRemoteIterator<Long, ZoneReencryptionStatus> {

  private final ClientProtocol namenode;
  private final Tracer tracer;

  public ReencryptionStatusIterator(ClientProtocol namenode, Tracer tracer) {
    super((long) 0);
    this.namenode = namenode;
    this.tracer = tracer;
  }

  @Override
  public BatchedEntries<ZoneReencryptionStatus> makeRequest(Long prevId)
      throws IOException {
    try (TraceScope ignored = tracer.newScope("listReencryptionStatus")) {
      return namenode.listReencryptionStatus(prevId);
    }
  }

  @Override
  public Long elementToPrevKey(ZoneReencryptionStatus entry) {
    return entry.getId();
  }
}
