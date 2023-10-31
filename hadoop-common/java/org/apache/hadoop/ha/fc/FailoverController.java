package org.apache.hadoop.ha.fc;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.ha.status.HAServiceProtocol;
import org.apache.hadoop.ha.status.HAServiceProtocol.StateChangeRequestInfo;
import org.apache.hadoop.ha.status.HAServiceProtocol.RequestSource;

import org.apache.hadoop.ha.status.HAServiceTarget;

public class FailoverController {

  private final int gracefulFenceTimeout;
  private final int rpcTimeoutToNewActive;
  
  private final Configuration conf;
  
  // 优雅地隔离 gracefulFence
  private final Configuration gracefulFenceConf;
  
  // 请求来源类型，是自动切换 / 还是来自于 haadmin命令
  private final RequestSource requestSource;
  
  // failover，fromSvc是当前的 Active
  public void failover(HAServiceTarget fromSvc, HAServiceTarget toSvc)
          throws IOException {
    
    // step1：会先进行判断，参数是否合理...
    
    // step2：进行隔离
    tryGracefulFence(fromSvc);
    
    // step3：切成主
    HAServiceProtocol svc = toSvc.getProxy(conf, rpcTimeoutToNewActive);
    svc.transitionToActive(createReqInfo());
    
    // step4：隔离失败了，强制执行回滚（调换 fromSvc 和 toSvc）
    failover(toSvc, fromSvc);
  }

  boolean tryGracefulFence(HAServiceTarget svc) throws IOException {
    HAServiceProtocol proxy = svc.getProxy(gracefulFenceConf, gracefulFenceTimeout);
    
    // transitionToStandby
    proxy.transitionToStandby(createReqInfo());
    return true;
  }
  
  
  
  ///////////////////////// 不重要  /////////////////////////
  //////////////////////////////////////////////////////////
  
  // 配置的初始化
  public FailoverController(Configuration conf,
                            RequestSource source) {
    this.conf = conf;
    this.gracefulFenceConf = new Configuration(conf);
    this.requestSource = source;

    this.gracefulFenceTimeout = getGracefulFenceTimeout(conf);
    this.rpcTimeoutToNewActive = getRpcTimeoutToNewActive(conf);

    int gracefulFenceConnectRetries = conf.getInt(
            CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_CONNECTION_RETRIES,
            CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_CONNECTION_RETRIES_DEFAULT);
    gracefulFenceConf.setInt(
            CommonConfigurationKeys.IPC_CLIENT_CONNECT_MAX_RETRIES_KEY,
            gracefulFenceConnectRetries);
    gracefulFenceConf.setInt(
            CommonConfigurationKeys.IPC_CLIENT_CONNECT_MAX_RETRIES_ON_SOCKET_TIMEOUTS_KEY,
            gracefulFenceConnectRetries);
  }
  // 获取配置
  static int getGracefulFenceTimeout(Configuration conf) {
    return conf.getInt(
            CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_TIMEOUT_KEY,
            CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_TIMEOUT_DEFAULT);
  }
  public static int getRpcTimeoutToNewActive(Configuration conf) {
    return conf.getInt(
            CommonConfigurationKeys.HA_FC_NEW_ACTIVE_TIMEOUT_KEY,
            CommonConfigurationKeys.HA_FC_NEW_ACTIVE_TIMEOUT_DEFAULT);
  }
  private StateChangeRequestInfo createReqInfo() {
    return new StateChangeRequestInfo(requestSource);
  }
  
}
