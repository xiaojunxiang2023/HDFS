package org.apache.hadoop.ha.status;


import java.io.IOException;

public interface HAServiceProtocol {
  long versionID = 1L;

  // NameNode的状态
  enum HAServiceState {
    INITIALIZING("initializing"),
    ACTIVE("active"),
    STANDBY("standby"),
    OBSERVER("observer"),
    STOPPING("stopping");

    private String name;

    HAServiceState(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  // 请求来源，来源于 ZKFC，还是用户手动执行
  enum RequestSource {
    REQUEST_BY_USER,
    REQUEST_BY_USER_FORCED,
    REQUEST_BY_ZKFC;
  }

  class StateChangeRequestInfo {
    private final RequestSource source;

    public StateChangeRequestInfo(RequestSource source) {
      super();
      this.source = source;
    }

    public RequestSource getSource() {
      return source;
    }
  }

  // 监视健康状态
  void monitorHealth() throws IOException;

  // transitionToActive
  void transitionToActive(StateChangeRequestInfo reqInfo) throws IOException;

  // transitionToStandby
  void transitionToStandby(StateChangeRequestInfo reqInfo) throws IOException;

  // transitionToObserver
  void transitionToObserver(StateChangeRequestInfo reqInfo) throws IOException;

  HAServiceStatus getServiceStatus() throws IOException;
}
