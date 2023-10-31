package org.apache.hadoop.ha.fc;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.security.KerberosInfo;

import java.io.IOException;

@KerberosInfo(serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
public interface ZKFCProtocol {
  
  long versionID = 1L;

  // 放弃 Active角色
  void cedeActive(int millisToCede) throws IOException;
  
  // 优雅地切换（容错转移）
  void gracefulFailover() throws IOException;
}
