package org.apache.hadoop.hdfs.client.impl.metrics;

import org.apache.hadoop.hdfs.client.impl.DfsClientConf.ShortCircuitConf;
import org.apache.hadoop.util.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Profiles {@link org.apache.hadoop.hdfs.client.impl.BlockReaderLocal} short
 * circuit read latencies when ShortCircuit read metrics is enabled through
 * {@link ShortCircuitConf#scrMetricsEnabled}.
 */
public class BlockReaderIoProvider {
  public static final Logger LOG = LoggerFactory.getLogger(
      BlockReaderIoProvider.class);

  private final BlockReaderLocalMetrics metrics;
  private final boolean isEnabled;
  private final int sampleRangeMax;
  private final Timer timer;

  // Threshold in milliseconds above which a warning should be flagged.
  private static final long SLOW_READ_WARNING_THRESHOLD_MS = 1000;
  private boolean isWarningLogged = false;

  public BlockReaderIoProvider(@Nullable ShortCircuitConf conf,
      BlockReaderLocalMetrics metrics, Timer timer) {
    if (conf != null) {
      isEnabled = conf.isScrMetricsEnabled();
      sampleRangeMax = (Integer.MAX_VALUE / 100) *
          conf.getScrMetricsSamplingPercentage();
      this.metrics = metrics;
      this.timer = timer;
    } else {
      this.isEnabled = false;
      this.sampleRangeMax = 0;
      this.metrics = null;
      this.timer = null;
    }
  }

  public int read(FileChannel dataIn, ByteBuffer dst, long position)
      throws IOException{
    final int nRead;
    if (isEnabled && (ThreadLocalRandom.current().nextInt() < sampleRangeMax)) {
      long begin = timer.monotonicNow();
      nRead = dataIn.read(dst, position);
      long latency = timer.monotonicNow() - begin;
      addLatency(latency);
    } else {
      nRead = dataIn.read(dst, position);
    }
    return nRead;
  }

  private void addLatency(long latency) {
    metrics.addShortCircuitReadLatency(latency);
    if (latency > SLOW_READ_WARNING_THRESHOLD_MS && !isWarningLogged) {
      LOG.warn(String.format("The Short Circuit Local Read latency, %d ms, " +
          "is higher then the threshold (%d ms). Suppressing further warnings" +
          " for this BlockReaderLocal.",
          latency, SLOW_READ_WARNING_THRESHOLD_MS));
      isWarningLogged = true;
    }
  }
}
