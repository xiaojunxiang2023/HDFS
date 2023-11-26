package org.apache.hadoop.tracing;

/**
 * No-Op Tracer (for now) to remove HTrace without changing too many files.
 */
public class Tracer {
  // Singleton
  private static final Tracer globalTracer = null;
  private final NullTraceScope nullTraceScope;
  private final String name;

  public final static String SPAN_RECEIVER_CLASSES_KEY =
      "span.receiver.classes";

  public Tracer(String name) {
    this.name = name;
    nullTraceScope = NullTraceScope.INSTANCE;
  }

  // Keeping this function at the moment for HTrace compatiblity,
  // in fact all threads share a single global tracer for OpenTracing.
  public static Tracer curThreadTracer() {
    return globalTracer;
  }

  /***
   * Return active span.
   * @return org.apache.hadoop.tracing.Span
   */
  public static Span getCurrentSpan() {
    return null;
  }

  public TraceScope newScope(String description) {
    return nullTraceScope;
  }

  public Span newSpan(String description, SpanContext spanCtx) {
    return new Span();
  }

  public TraceScope newScope(String description, SpanContext spanCtx) {
    return nullTraceScope;
  }

  public TraceScope newScope(String description, SpanContext spanCtx,
      boolean finishSpanOnClose) {
    return nullTraceScope;
  }

  public TraceScope activateSpan(Span span) {
    return nullTraceScope;
  }

  public void close() {
  }

  public String getName() {
    return name;
  }

  public static class Builder {
    static Tracer globalTracer;
    private String name;

    public Builder(final String name) {
      this.name = name;
    }

    public Builder conf(TraceConfiguration conf) {
      return this;
    }

    public Tracer build() {
      if (globalTracer == null) {
        globalTracer = new Tracer(name);
      }
      return globalTracer;
    }
  }
}
