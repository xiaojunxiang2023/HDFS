package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience.Public;
import org.apache.hadoop.classification.InterfaceStability.Unstable;
import org.slf4j.Logger;

import java.util.function.Supplier;

/**
 * A duration with logging of final state at info or debug
 * in the {@code close()} call.
 * This allows it to be used in a try-with-resources clause, and have the
 * duration automatically logged.
 */
@Public
@Unstable
public class DurationInfo extends OperationDuration
    implements AutoCloseable {

  private final Supplier<String> text;

  private String textStr;

  private final Logger log;

  /**
   * Should the log be at INFO rather than DEBUG.
   */
  private final boolean logAtInfo;

  /**
   * Create the duration text from a {@code String.format()} code call;
   * log output at info level.
   * @param log log to write to
   * @param format format string
   * @param args list of arguments
   */
  public DurationInfo(Logger log, String format, Object... args) {
    this(log, true, format, args);
  }

  /**
   * Create the duration text from a {@code String.format()} code call
   * and log either at info or debug.
   * @param log log to write to
   * @param logAtInfo should the log be at info, rather than debug
   * @param format format string
   * @param args list of arguments
   */
  public DurationInfo(Logger log,
                      boolean logAtInfo,
                      String format,
                      Object... args) {
    this.text = () -> String.format(format, args);
    this.log = log;
    this.logAtInfo = logAtInfo;
    if (logAtInfo) {
      log.info("Starting: {}", getFormattedText());
    } else {
      if (log.isDebugEnabled()) {
        log.debug("Starting: {}", getFormattedText());
      }
    }
  }

  private String getFormattedText() {
    return (textStr == null) ? (textStr = text.get()) : textStr;
  }

  @Override
  public String toString() {
    return getFormattedText() + ": duration " + super.toString();
  }

  @Override
  public void close() {
    finished();
    if (logAtInfo) {
      log.info("{}", this);
    } else {
      if (log.isDebugEnabled()) {
        log.debug("{}", this);
      }
    }
  }
}
