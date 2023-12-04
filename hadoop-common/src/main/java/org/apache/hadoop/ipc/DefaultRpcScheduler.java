package org.apache.hadoop.ipc;

import org.apache.hadoop.conf.Configuration;

/**
 * No op default RPC scheduler.
 */
public class DefaultRpcScheduler implements RpcScheduler {
  @Override
  public int getPriorityLevel(Schedulable obj) {
    return 0;
  }

  @Override
  public boolean shouldBackOff(Schedulable obj) {
    return false;
  }

  @Override
  public void addResponseTime(String callName, Schedulable schedulable,
                              ProcessingDetails details) {
  }

  public DefaultRpcScheduler(int priorityLevels, String namespace,
                             Configuration conf) {
  }

  @Override
  public void stop() {
  }
}
