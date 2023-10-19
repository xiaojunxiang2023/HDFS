package org.apache.hadoop.tracing;

public class NullTraceScope extends TraceScope {
  public static final NullTraceScope INSTANCE = new NullTraceScope();

  public NullTraceScope() {
    super(null);
  }
}
