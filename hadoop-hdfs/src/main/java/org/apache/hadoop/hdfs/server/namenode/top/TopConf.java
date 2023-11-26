package org.apache.hadoop.hdfs.server.namenode.top;

import java.util.concurrent.TimeUnit;

import org.apache.hadoop.thirdparty.com.google.common.primitives.Ints;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

/**
 * This class is a common place for NNTop configuration.
 */
public final class TopConf {
  /**
   * Whether TopMetrics are enabled
   */
  public final boolean isEnabled;

  /**
   * A meta command representing the total number of calls to all commands
   */
  public static final String ALL_CMDS = "*";

  /**
   * nntop reporting periods in milliseconds
   */
  public final int[] nntopReportingPeriodsMs;

  public TopConf(Configuration conf) {
    isEnabled = conf.getBoolean(DFSConfigKeys.NNTOP_ENABLED_KEY,
        DFSConfigKeys.NNTOP_ENABLED_DEFAULT);
    String[] periodsStr = conf.getTrimmedStrings(
        DFSConfigKeys.NNTOP_WINDOWS_MINUTES_KEY,
        DFSConfigKeys.NNTOP_WINDOWS_MINUTES_DEFAULT);
    nntopReportingPeriodsMs = new int[periodsStr.length];
    for (int i = 0; i < periodsStr.length; i++) {
      nntopReportingPeriodsMs[i] = Ints.checkedCast(
          TimeUnit.MINUTES.toMillis(Integer.parseInt(periodsStr[i])));
    }
    for (int aPeriodMs: nntopReportingPeriodsMs) {
      Preconditions.checkArgument(aPeriodMs >= TimeUnit.MINUTES.toMillis(1),
          "minimum reporting period is 1 min!");
    }
  }
}
