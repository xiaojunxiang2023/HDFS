package org.apache.hadoop.tracing;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.thirdparty.protobuf.ByteString;

/**
 * This class provides utility functions for tracing.
 */
public class TraceUtils {
  static final String DEFAULT_HADOOP_TRACE_PREFIX = "hadoop.htrace.";

  public static TraceConfiguration wrapHadoopConf(final String prefix,
                                                  final Configuration conf) {
    return null;
  }

  public static Tracer createAndRegisterTracer(String name) {
    return null;
  }

  public static SpanContext byteStringToSpanContext(ByteString byteString) {
    return null;
  }

  public static ByteString spanContextToByteString(SpanContext context) {
    return null;
  }
}
