package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.fs.BatchedRemoteIterator;
import org.apache.hadoop.tracing.TraceScope;
import org.apache.hadoop.tracing.Tracer;

import java.io.IOException;

/**
 * CachePoolIterator is a remote iterator that iterates cache pools.
 * It supports retrying in case of namenode failover.
 */
public class CachePoolIterator
    extends BatchedRemoteIterator<String, CachePoolEntry> {

  private final ClientProtocol namenode;
  private final Tracer tracer;

  public CachePoolIterator(ClientProtocol namenode, Tracer tracer) {
    super("");
    this.namenode = namenode;
    this.tracer = tracer;
  }

  @Override
  public BatchedEntries<CachePoolEntry> makeRequest(String prevKey)
      throws IOException {
    try (TraceScope ignored = tracer.newScope("listCachePools")) {
      return namenode.listCachePools(prevKey);
    }
  }

  @Override
  public String elementToPrevKey(CachePoolEntry entry) {
    return entry.getInfo().getPoolName();
  }
}
