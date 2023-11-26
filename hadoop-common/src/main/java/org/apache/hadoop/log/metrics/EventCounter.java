package org.apache.hadoop.log.metrics;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

/**
 * A log4J Appender that simply counts logging events in three levels:
 * fatal, error and warn. The class name is used in log4j.properties
 */
public class EventCounter extends AppenderSkeleton {
  private static final int FATAL = 0;
  private static final int ERROR = 1;
  private static final int WARN = 2;
  private static final int INFO = 3;

  private static class EventCounts {
    private final long[] counts = {0, 0, 0, 0};

    private synchronized void incr(int i) {
      ++counts[i];
    }

    private synchronized long get(int i) {
      return counts[i];
    }
  }

  private static EventCounts counts = new EventCounts();
  public static long getFatal() {
    return counts.get(FATAL);
  }
  public static long getError() {
    return counts.get(ERROR);
  }
  public static long getWarn() {
    return counts.get(WARN);
  }
  public static long getInfo() {
    return counts.get(INFO);
  }

  @Override
  public void append(LoggingEvent event) {
    Level level = event.getLevel();
    // depends on the api, == might not work
    // see HADOOP-7055 for details
    if (level.equals(Level.INFO)) {
      counts.incr(INFO);
    }
    else if (level.equals(Level.WARN)) {
      counts.incr(WARN);
    }
    else if (level.equals(Level.ERROR)) {
      counts.incr(ERROR);
    }
    else if (level.equals(Level.FATAL)) {
      counts.incr(FATAL);
    }
  }

  @Override
  public void close() {
  }

  @Override
  public boolean requiresLayout() {
    return false;
  }
}
