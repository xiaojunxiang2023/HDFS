package org.apache.hadoop.util;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Sequential number generator.
 * 
 * This class is thread safe.
 */
public abstract class SequentialNumber implements IdGenerator {
  private final AtomicLong currentValue;

  /** Create a new instance with the given initial value. */
  protected SequentialNumber(final long initialValue) {
    currentValue = new AtomicLong(initialValue);
  }

  /** @return the current value. */
  public long getCurrentValue() {
    return currentValue.get();
  }

  /** Set current value. */
  public void setCurrentValue(long value) {
    currentValue.set(value);
  }

  public boolean setIfGreater(long value) {
    while(true) {
      long local = currentValue.get();
      if(value <= local) {
        return false; // swap failed
      }
      if(currentValue.compareAndSet(local, value)) {
        return true;  // swap successful
      }
      // keep trying
    }
  }

  /** Increment and then return the next value. */
  public long nextValue() {
    return currentValue.incrementAndGet();
  }

  /** Skip to the new value. */
  public void skipTo(long newValue) throws IllegalStateException {
    for(;;) {
      final long c = getCurrentValue();
      if (newValue < c) {
        throw new IllegalStateException(
            "Cannot skip to less than the current value (="
            + c + "), where newValue=" + newValue);
      }

      if (currentValue.compareAndSet(c, newValue)) {
        return;
      }
    }
  }

  @Override
  public boolean equals(final Object that) {
    if (that == null || this.getClass() != that.getClass()) {
      return false;
    }
    final AtomicLong thatValue = ((SequentialNumber)that).currentValue;
    return currentValue.equals(thatValue);
  }

  @Override
  public int hashCode() {
    final long v = currentValue.get();
    return (int)v ^ (int)(v >>> 32);
  }
}
