package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.fs.BatchedRemoteIterator;
import org.apache.hadoop.tracing.TraceScope;
import org.apache.hadoop.tracing.Tracer;

import java.io.IOException;

/**
 * EncryptionZoneIterator is a remote iterator that iterates over encryption
 * zones. It supports retrying in case of namenode failover.
 */
public class EncryptionZoneIterator
    extends BatchedRemoteIterator<Long, EncryptionZone> {

  private final ClientProtocol namenode;
  private final Tracer tracer;

  public EncryptionZoneIterator(ClientProtocol namenode, Tracer tracer) {
    super((long) 0);
    this.namenode = namenode;
    this.tracer = tracer;
  }

  @Override
  public BatchedEntries<EncryptionZone> makeRequest(Long prevId)
      throws IOException {
    try (TraceScope ignored = tracer.newScope("listEncryptionZones")) {
      return namenode.listEncryptionZones(prevId);
    }
  }

  @Override
  public Long elementToPrevKey(EncryptionZone entry) {
    return entry.getId();
  }
}
