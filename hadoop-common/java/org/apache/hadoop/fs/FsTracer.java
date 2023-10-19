package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.tracing.TraceUtils;
import org.apache.hadoop.tracing.Tracer;

/**
 * Holds the HTrace Tracer used for FileSystem operations.
 *
 * Ideally, this would be owned by the DFSClient, rather than global.  However,
 * the FileContext API may create a new DFSClient for each operation in some
 * cases.  Because of this, we cannot store this Tracer inside DFSClient.  See
 * HADOOP-6356 for details.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public final class FsTracer {
  private static Tracer instance;

  public static synchronized Tracer get(Configuration conf) {
    if (instance == null) {
      instance = new Tracer.Builder("FSClient").
          conf(TraceUtils.wrapHadoopConf(CommonConfigurationKeys.
              FS_CLIENT_HTRACE_PREFIX, conf)).
          build();
    }
    return instance;
  }

  private FsTracer() {
  }
}
