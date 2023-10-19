package org.apache.hadoop.tracing;

import java.io.Closeable;

/**
 * Wrapper class for SpanContext to avoid using OpenTracing/OpenTelemetry
 * SpanContext class directly for better separation.
 */
public class SpanContext implements Closeable {
  public SpanContext() {
  }

  public void close() {
  }
}
