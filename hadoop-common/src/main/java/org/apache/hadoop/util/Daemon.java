package org.apache.hadoop.util;

import java.util.concurrent.ThreadFactory;

/** A thread that has called {@link Thread#setDaemon(boolean) } with true.*/
public class Daemon extends Thread {

  {
    setDaemon(true);                              // always a daemon
  }

  /**
   * Provide a factory for named daemon threads,
   * for use in ExecutorServices constructors
   */
  public static class DaemonFactory extends Daemon implements ThreadFactory {

    @Override
    public Thread newThread(Runnable runnable) {
      return new Daemon(runnable);
    }

  }

  Runnable runnable = null;

  /** Construct a daemon thread. */
  public Daemon() {
    super();
  }

  /** Construct a daemon thread. */
  public Daemon(Runnable runnable) {
    super(runnable);
    this.runnable = runnable;
    this.setName(((Object) runnable).toString());
  }

  /** Construct a daemon thread to be part of a specified thread group. */
  public Daemon(ThreadGroup group, Runnable runnable) {
    super(group, runnable);
    this.runnable = runnable;
    this.setName(((Object) runnable).toString());
  }

  public Runnable getRunnable() {
    return runnable;
  }
}
