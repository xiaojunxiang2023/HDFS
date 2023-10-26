package org.apache.hadoop.metrics2.lib;
import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.MetricsRecordBuilder;

import java.util.concurrent.atomic.LongAdder;

/**
 * A mutable long counter
 */
public class MutableCounterLong extends MutableCounter {

  private final LongAdder value = new LongAdder();

  public MutableCounterLong(MetricsInfo info, long initValue) {
    super(info);
    this.value.add(initValue);
  }

  @Override
  public void incr() {
    incr(1);
  }

  /**
   * Increment the value by a delta
   * @param delta of the increment
   */
  public void incr(long delta) {
    value.add(delta);
    setChanged();
  }

  public long value() {
    return value.longValue();
  }

  @Override
  public void snapshot(MetricsRecordBuilder builder, boolean all) {
    if (all || changed()) {
      builder.addCounter(info(), value());
      clearChanged();
    }
  }

}
