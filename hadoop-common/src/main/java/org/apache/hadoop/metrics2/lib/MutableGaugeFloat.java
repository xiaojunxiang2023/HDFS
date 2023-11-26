package org.apache.hadoop.metrics2.lib;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.MetricsRecordBuilder;

/**
 * A mutable float gauge.
 */
public class MutableGaugeFloat extends MutableGauge {

  private AtomicInteger value = new AtomicInteger();

  MutableGaugeFloat(MetricsInfo info, float initValue) {
    super(info);
    this.value.set(Float.floatToIntBits(initValue));
  }

  public float value() {
    return Float.intBitsToFloat(value.get());
  }

  @Override
  public void incr() {
    incr(1.0f);
  }

  @Override
  public void decr() {
    incr(-1.0f);
  }

  @Override
  public void snapshot(MetricsRecordBuilder builder, boolean all) {
    if (all || changed()) {
      builder.addGauge(info(), value());
      clearChanged();
    }
  }

  public void set(float value) {
    this.value.set(Float.floatToIntBits(value));
    setChanged();
  }

  private final boolean compareAndSet(float expect, float update) {
    return value.compareAndSet(Float.floatToIntBits(expect),
        Float.floatToIntBits(update));
  }

  private void incr(float delta) {
    while (true) {
      float current = value.get();
      float next = current + delta;
      if (compareAndSet(current, next)) {
        setChanged();
        return;
      }
    }
  }

  /**
   * @return  the value of the metric
   */
  public String toString() {
    return value.toString();
  }
}
