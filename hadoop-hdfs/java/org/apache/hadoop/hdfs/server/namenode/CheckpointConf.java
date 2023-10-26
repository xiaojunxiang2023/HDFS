package org.apache.hadoop.hdfs.server.namenode;

import static org.apache.hadoop.hdfs.DFSConfigKeys.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.thirdparty.com.google.common.collect.ImmutableList;

import java.util.concurrent.TimeUnit;
public class CheckpointConf {
  private static final Logger LOG =
      LoggerFactory.getLogger(CheckpointConf.class);
  
  /** How often to checkpoint regardless of number of txns */
  private final long checkpointPeriod;    // in seconds
  
  /** How often to poll the NN to check checkpointTxnCount */
  private final long checkpointCheckPeriod; // in seconds
  
  /** checkpoint once every this many transactions, regardless of time */
  private final long checkpointTxnCount;

  /** maxium number of retries when merge errors occur */
  private final int maxRetriesOnMergeError;

  /** The output dir for legacy OIV image */
  private final String legacyOivImageDir;

  /**
  * multiplier on the checkpoint period to allow other nodes to do the checkpointing, when not the
  * 'primary' checkpoint node
  */
  private double quietMultiplier;

  public CheckpointConf(Configuration conf) {
    checkpointCheckPeriod = conf.getTimeDuration(
        DFS_NAMENODE_CHECKPOINT_CHECK_PERIOD_KEY,
        DFS_NAMENODE_CHECKPOINT_CHECK_PERIOD_DEFAULT, TimeUnit.SECONDS);
        
    checkpointPeriod = conf.getTimeDuration(DFS_NAMENODE_CHECKPOINT_PERIOD_KEY,
        DFS_NAMENODE_CHECKPOINT_PERIOD_DEFAULT, TimeUnit.SECONDS);
    checkpointTxnCount = conf.getLong(DFS_NAMENODE_CHECKPOINT_TXNS_KEY, 
                                  DFS_NAMENODE_CHECKPOINT_TXNS_DEFAULT);
    maxRetriesOnMergeError = conf.getInt(DFS_NAMENODE_CHECKPOINT_MAX_RETRIES_KEY,
                                  DFS_NAMENODE_CHECKPOINT_MAX_RETRIES_DEFAULT);
    legacyOivImageDir = conf.get(DFS_NAMENODE_LEGACY_OIV_IMAGE_DIR_KEY);
    quietMultiplier = conf.getDouble(DFS_NAMENODE_CHECKPOINT_QUIET_MULTIPLIER_KEY,
      DFS_NAMENODE_CHECKPOINT_QUIET_MULTIPLIER_DEFAULT);
    warnForDeprecatedConfigs(conf);
  }
  
  private static void warnForDeprecatedConfigs(Configuration conf) {
    for (String key : ImmutableList.of(
          "fs.checkpoint.size",
          "dfs.namenode.checkpoint.size")) {
      if (conf.get(key) != null) {
        LOG.warn("Configuration key " + key + " is deprecated! Ignoring..." +
            " Instead please specify a value for " +
            DFS_NAMENODE_CHECKPOINT_TXNS_KEY);
      }
    }
  }

  public long getPeriod() {
    return checkpointPeriod;
  }

  public long getCheckPeriod() {
    return Math.min(checkpointCheckPeriod, checkpointPeriod);
  }

  public long getTxnCount() {
    return checkpointTxnCount;
  }

  public int getMaxRetriesOnMergeError() {
    return maxRetriesOnMergeError;
  }

  public String getLegacyOivImageDir() {
    return legacyOivImageDir;
  }

  public double getQuietPeriod() {
    return this.checkpointPeriod * this.quietMultiplier;
  }
}
