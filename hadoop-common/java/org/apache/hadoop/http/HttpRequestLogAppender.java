package org.apache.hadoop.http;

import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.AppenderSkeleton;

/**
 * Log4j Appender adapter for HttpRequestLog
 */
public class HttpRequestLogAppender extends AppenderSkeleton {

  private String filename;
  private int retainDays;

  public HttpRequestLogAppender() {
  }

  public void setRetainDays(int retainDays) {
    this.retainDays = retainDays;
  }

  public int getRetainDays() {
    return retainDays;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }

  @Override
  public void append(LoggingEvent event) {
  }

  @Override
  public void close() {
  }

  @Override
  public boolean requiresLayout() {
    return false;
  }
}
