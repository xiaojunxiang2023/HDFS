package org.apache.hadoop.fs.store;

import org.slf4j.Logger;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Log exactly once, even across threads.
 */
public class LogExactlyOnce {

  private final AtomicBoolean logged = new AtomicBoolean(false);
  private final Logger log;

  public LogExactlyOnce(final Logger log) {
    this.log = log;
  }

  public void warn(String format, Object... args) {
    if (!logged.getAndSet(true)) {
      log.warn(format, args);
    }
  }

  public void info(String format, Object... args) {
    if (!logged.getAndSet(true)) {
      log.info(format, args);
    }
  }

  public void error(String format, Object... args) {
    if (!logged.getAndSet(true)) {
      log.error(format, args);
    }
  }
}
