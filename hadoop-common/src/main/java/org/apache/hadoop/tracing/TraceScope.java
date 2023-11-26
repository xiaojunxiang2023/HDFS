package org.apache.hadoop.tracing;

import java.io.Closeable;

public class TraceScope implements Closeable {
  Span span;

  public TraceScope(Span span) {
    this.span = span;
  }

  // Add tag to the span
  public void addKVAnnotation(String key, String value) {
  }

  public void addKVAnnotation(String key, Number value) {
  }

  public void addTimelineAnnotation(String msg) {
  }

  public Span span() {
    return span;
  }

  public Span getSpan() {
    return span;
  }

  public void reattach() {
  }

  public void detach() {
  }

  public void close() {
    if (span != null) {
      span.close();
    }
  }
}
