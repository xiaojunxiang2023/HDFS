package others;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @Author: hellosrc
 * @Date: 2023/11/11日  19:31分
 * @Description:
 */
public class Test2 {

  public static void main(String[] args) throws IOException {
    Configuration conf = new Configuration();
    conf.addResource(new Path("/etc/hadoop/conf/hdfs-site.xml"));
    conf.addResource(new Path("/etc/hadoop/conf/hdfs-rbf-site.xml"));
    String dfsrouterPrincipal = conf.get("dfs.federation.router.kerberos.principal");
    String hostName = InetAddress.getLocalHost().getHostName();
    dfsrouterPrincipal = dfsrouterPrincipal.replace("_HOST", hostName);
    String dfsrouterKeytab = conf.get("dfs.federation.router.keytab.file");
    UserGroupInformation.loginUserFromKeytab(dfsrouterPrincipal, dfsrouterKeytab);
  }

}
