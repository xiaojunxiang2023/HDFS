package org.apache.hadoop.tracing;

import java.io.Closeable;

public class Span implements Closeable {

  public Span() {
  }

  public Span addKVAnnotation(String key, String value) {
    return this;
  }

  public Span addTimelineAnnotation(String msg) {
    return this;
  }

  public SpanContext getContext() {
    return null;
  }

  public void finish() {
  }

  public void close() {
  }
}
