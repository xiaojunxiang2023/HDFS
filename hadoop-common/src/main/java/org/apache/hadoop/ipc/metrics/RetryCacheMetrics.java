package org.apache.hadoop.ipc.metrics;

import org.apache.hadoop.ipc.RetryCache;
import org.apache.hadoop.metrics2.annotation.Metric;
import org.apache.hadoop.metrics2.annotation.Metrics;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.apache.hadoop.metrics2.lib.MetricsRegistry;
import org.apache.hadoop.metrics2.lib.MutableCounterLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is for maintaining the various RetryCache-related statistics
 * and publishing them through the metrics interfaces.
 */
@Metrics(about = "Aggregate RetryCache metrics", context = "rpc")
public class RetryCacheMetrics {

  static final Logger LOG = LoggerFactory.getLogger(RetryCacheMetrics.class);
  final MetricsRegistry registry;
  final String name;

  RetryCacheMetrics(RetryCache retryCache) {
    name = "RetryCache." + retryCache.getCacheName();
    registry = new MetricsRegistry(name);
    if (LOG.isDebugEnabled()) {
      LOG.debug("Initialized " + registry);
    }
  }

  public String getName() {
    return name;
  }

  public static RetryCacheMetrics create(RetryCache cache) {
    RetryCacheMetrics m = new RetryCacheMetrics(cache);
    return DefaultMetricsSystem.instance().register(m.name, null, m);
  }

  @Metric("Number of RetryCache hit")
  MutableCounterLong cacheHit;
  @Metric("Number of RetryCache cleared")
  MutableCounterLong cacheCleared;
  @Metric("Number of RetryCache updated")
  MutableCounterLong cacheUpdated;

  /**
   * One cache hit event
   */
  public void incrCacheHit() {
    cacheHit.incr();
  }

  /**
   * One cache cleared
   */
  public void incrCacheCleared() {
    cacheCleared.incr();
  }

  /**
   * One cache updated
   */
  public void incrCacheUpdated() {
    cacheUpdated.incr();
  }

  public long getCacheHit() {
    return cacheHit.value();
  }

  public long getCacheCleared() {
    return cacheCleared.value();
  }

  public long getCacheUpdated() {
    return cacheUpdated.value();
  }

}
