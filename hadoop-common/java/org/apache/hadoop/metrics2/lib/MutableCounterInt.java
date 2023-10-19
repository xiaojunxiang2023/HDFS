package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.MetricsRecordBuilder;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * A mutable int counter for implementing metrics sources
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class MutableCounterInt extends MutableCounter {
  private AtomicInteger value = new AtomicInteger();

  MutableCounterInt(MetricsInfo info, int initValue) {
    super(info);
    this.value.set(initValue);
  }

  @Override
  public void incr() {
    incr(1);
  }

  /**
   * Increment the value by a delta
   * @param delta of the increment
   */
  public synchronized void incr(int delta) {
    value.addAndGet(delta);
    setChanged();
  }

  public int value() {
    return value.get();
  }

  @Override
  public void snapshot(MetricsRecordBuilder builder, boolean all) {
    if (all || changed()) {
      builder.addCounter(info(), value());
      clearChanged();
    }
  }

}
