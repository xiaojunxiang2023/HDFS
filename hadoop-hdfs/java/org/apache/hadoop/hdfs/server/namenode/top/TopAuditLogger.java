package org.apache.hadoop.hdfs.server.namenode.top;

import java.net.InetAddress;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.hdfs.HdfsConfiguration;
import org.apache.hadoop.hdfs.server.namenode.AuditLogger;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.hadoop.hdfs.server.namenode.top.metrics.TopMetrics;

import static org.apache.hadoop.hdfs.server.namenode.top.metrics.TopMetrics.TOPMETRICS_METRICS_SOURCE_NAME;

/**
 * An {@link AuditLogger} that sends logged data directly to the metrics
 * systems. It is used when the top service is used directly by the name node
 */
public class TopAuditLogger implements AuditLogger {
  public static final Logger LOG = LoggerFactory.getLogger(TopAuditLogger.class);

  private final TopMetrics topMetrics;

  public TopAuditLogger() {
    Configuration conf = new HdfsConfiguration();
    TopConf topConf = new TopConf(conf);
    this.topMetrics = new TopMetrics(conf, topConf.nntopReportingPeriodsMs);
    if (DefaultMetricsSystem.instance().getSource(
            TOPMETRICS_METRICS_SOURCE_NAME) == null) {
      DefaultMetricsSystem.instance().register(TOPMETRICS_METRICS_SOURCE_NAME,
              "Top N operations by user", topMetrics);
    }
  }

  public TopAuditLogger(TopMetrics topMetrics) {
    Preconditions.checkNotNull(topMetrics, "Cannot init with a null " +
        "TopMetrics");
    this.topMetrics = topMetrics;
  }

  @Override
  public void initialize(Configuration conf) {
  }

  @Override
  public void logAuditEvent(boolean succeeded, String userName,
      InetAddress addr, String cmd, String src, String dst, FileStatus status) {
    try {
      topMetrics.report(succeeded, userName, addr, cmd, src, dst, status);
    } catch (Throwable t) {
      LOG.error("An error occurred while reflecting the event in top service, "
          + "event: (cmd={},userName={})", cmd, userName);
    }

    if (LOG.isDebugEnabled()) {
      final StringBuilder sb = new StringBuilder();
      sb.append("allowed=").append(succeeded).append("\t");
      sb.append("ugi=").append(userName).append("\t");
      sb.append("ip=").append(addr).append("\t");
      sb.append("cmd=").append(cmd).append("\t");
      sb.append("src=").append(src).append("\t");
      sb.append("dst=").append(dst).append("\t");
      if (null == status) {
        sb.append("perm=null");
      } else {
        sb.append("perm=");
        sb.append(status.getOwner()).append(":");
        sb.append(status.getGroup()).append(":");
        sb.append(status.getPermission());
      }
      LOG.debug("------------------- logged event for top service: " + sb);
    }
  }

}
