package org.apache.hadoop.ha;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.io.retry.Idempotent;
import org.apache.hadoop.security.AccessControlException;
import org.apache.hadoop.security.KerberosInfo;

import java.io.IOException;

@KerberosInfo(
    serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
public interface ZKFCProtocol {
  
  long versionID = 1L;

  // 放弃 Active角色
  @Idempotent
  void cedeActive(int millisToCede) throws IOException;
  
  // 优雅地切换（容错转移）
  @Idempotent
  void gracefulFailover() throws IOException;
}
