package org.apache.hadoop.util;

import org.slf4j.Logger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * This is a wrap class of a {@link ReentrantReadWriteLock}.
 * It implements the interface {@link ReadWriteLock}, and can be used to
 * create instrumented <tt>ReadLock</tt> and <tt>WriteLock</tt>.
 */
public class InstrumentedReadWriteLock implements ReadWriteLock {

  private final Lock readLock;
  private final Lock writeLock;

  public InstrumentedReadWriteLock(boolean fair, String name, Logger logger,
                                   long minLoggingGapMs, long lockWarningThresholdMs) {
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock(fair);
    readLock = new InstrumentedReadLock(name, logger, readWriteLock,
        minLoggingGapMs, lockWarningThresholdMs);
    writeLock = new InstrumentedWriteLock(name, logger, readWriteLock,
        minLoggingGapMs, lockWarningThresholdMs);
  }

  @Override
  public Lock readLock() {
    return readLock;
  }

  @Override
  public Lock writeLock() {
    return writeLock;
  }
}
