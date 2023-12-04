package org.apache.hadoop.util;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * This is a wrap class of a <tt>WriteLock</tt>.
 * It extends the class {@link InstrumentedLock}, and can be used to track
 * whether a specific write lock is being held for too long and log
 * warnings if so.
 *
 * The logged warnings are throttled so that logs are not spammed.
 */
public class InstrumentedWriteLock extends InstrumentedLock {

  public InstrumentedWriteLock(String name, Logger logger,
                               ReentrantReadWriteLock readWriteLock,
                               long minLoggingGapMs, long lockWarningThresholdMs) {
    this(name, logger, readWriteLock, minLoggingGapMs, lockWarningThresholdMs,
        new Timer());
  }

  @VisibleForTesting
  InstrumentedWriteLock(String name, Logger logger,
                        ReentrantReadWriteLock readWriteLock,
                        long minLoggingGapMs, long lockWarningThresholdMs, Timer clock) {
    super(name, logger, readWriteLock.writeLock(), minLoggingGapMs,
        lockWarningThresholdMs, clock);
  }
}
