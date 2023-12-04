package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.metrics2.MetricsRecordBuilder;
import org.apache.hadoop.thirdparty.com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Set;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * Helper class to manage a group of mutable rate metrics
 *
 * This class synchronizes all accesses to the metrics it
 * contains, so it should not be used in situations where
 * there is high contention on the metrics.
 * {@link MutableRatesWithAggregation} is preferable in that
 * situation.
 */
public class MutableRates extends MutableMetric {
  static final Logger LOG = LoggerFactory.getLogger(MutableRates.class);
  private final MetricsRegistry registry;
  private final Set<Class<?>> protocolCache = Sets.newHashSet();

  MutableRates(MetricsRegistry registry) {
    this.registry = checkNotNull(registry, "metrics registry");
  }

  /**
   * Initialize the registry with all the methods in a protocol
   * so they all show up in the first snapshot.
   * Convenient for JMX implementations.
   * @param protocol the protocol class
   */
  public void init(Class<?> protocol) {
    if (protocolCache.contains(protocol)) return;
    protocolCache.add(protocol);
    for (Method method : protocol.getDeclaredMethods()) {
      String name = method.getName();
      LOG.debug(name);
      try {
        registry.newRate(name, name, false, true);
      } catch (Exception e) {
        LOG.error("Error creating rate metrics for " + method.getName(), e);
      }
    }
  }

  /**
   * Add a rate sample for a rate metric
   * @param name of the rate metric
   * @param elapsed time
   */
  public void add(String name, long elapsed) {
    registry.add(name, elapsed);
  }

  @Override
  public void snapshot(MetricsRecordBuilder rb, boolean all) {
    registry.snapshot(rb, all);
  }
}
