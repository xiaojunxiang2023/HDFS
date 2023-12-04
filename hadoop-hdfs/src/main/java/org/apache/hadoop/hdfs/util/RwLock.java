package org.apache.hadoop.hdfs.util;

/** Read-write lock interface. */
public interface RwLock {
  /** Acquire read lock. */
  public void readLock();

  /** Acquire read lock, unless interrupted while waiting  */
  void readLockInterruptibly() throws InterruptedException;

  /** Release read lock. */
  public void readUnlock();

  /** Check if the current thread holds read lock. */
  public boolean hasReadLock();

  /** Acquire write lock. */
  public void writeLock();

  /** Acquire write lock, unless interrupted while waiting  */
  void writeLockInterruptibly() throws InterruptedException;

  /** Release write lock. */
  public void writeUnlock();

  /** Check if the current thread holds write lock. */
  public boolean hasWriteLock();
}
