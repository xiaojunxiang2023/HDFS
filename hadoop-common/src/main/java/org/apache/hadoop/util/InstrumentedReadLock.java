package org.apache.hadoop.util;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * This is a wrap class of a <tt>ReadLock</tt>.
 * It extends the class {@link InstrumentedLock}, and can be used to track
 * whether a specific read lock is being held for too long and log
 * warnings if so.
 *
 * The logged warnings are throttled so that logs are not spammed.
 */
public class InstrumentedReadLock extends InstrumentedLock {

  private final ReentrantReadWriteLock readWriteLock;

  /**
   * Uses the ThreadLocal to keep the time of acquiring locks since
   * there can be multiple threads that hold the read lock concurrently.
   */
  private final ThreadLocal<Long> readLockHeldTimeStamp =
      new ThreadLocal<Long>() {
        @Override
        protected Long initialValue() {
          return Long.MAX_VALUE;
        }

        ;
      };

  public InstrumentedReadLock(String name, Logger logger,
                              ReentrantReadWriteLock readWriteLock,
                              long minLoggingGapMs, long lockWarningThresholdMs) {
    this(name, logger, readWriteLock, minLoggingGapMs, lockWarningThresholdMs,
        new Timer());
  }

  
  InstrumentedReadLock(String name, Logger logger,
                       ReentrantReadWriteLock readWriteLock,
                       long minLoggingGapMs, long lockWarningThresholdMs, Timer clock) {
    super(name, logger, readWriteLock.readLock(), minLoggingGapMs,
        lockWarningThresholdMs, clock);
    this.readWriteLock = readWriteLock;
  }

  @Override
  public void unlock() {
    boolean needReport = readWriteLock.getReadHoldCount() == 1;
    long localLockReleaseTime = getTimer().monotonicNow();
    long localLockAcquireTime = readLockHeldTimeStamp.get();
    getLock().unlock();
    if (needReport) {
      readLockHeldTimeStamp.remove();
      check(localLockAcquireTime, localLockReleaseTime, true);
    }
  }

  /**
   * Starts timing for the instrumented read lock.
   * It records the time to ThreadLocal.
   */
  @Override
  protected void startLockTiming() {
    if (readWriteLock.getReadHoldCount() == 1) {
      readLockHeldTimeStamp.set(getTimer().monotonicNow());
    }
  }
}
