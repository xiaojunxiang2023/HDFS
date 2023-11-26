package utils;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;

/**
 * @Author: hellosrc
 * @Date: 2023/10/10日  15:59分
 * @Description:
 */
public class KerberosUtils {

    public static void login(Configuration conf) {
        login(conf, Constant.keytabFile, Constant.krb5File);
    }

    public static void login(Configuration conf, String keytabFile) {
        login(conf, keytabFile, Constant.krb5File);
    }

    public static void login(Configuration conf, String keytabFile, String krb5File) {
        conf.set("hadoop.security.authentication", "kerberos");
        conf.setBoolean("ipc.client.fallback-to-simple-auth-allowed", true);
        System.setProperty("java.security.krb5.conf", krb5File);

        UserGroupInformation.setConfiguration(conf);

        try {
            String principal = getPrincipal(keytabFile);
            principal = principal.substring(principal.lastIndexOf(' ') + 1);
            Thread.sleep(200);
            System.out.println("获取到 principal为：" + principal);
            UserGroupInformation.loginUserFromKeytab(principal, keytabFile);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getPrincipal(String keytabFile) {
        String cmd = "klist -k " + keytabFile;
        String principal = CommonUtils.open(cmd);
        int begin = principal.lastIndexOf(' ') + 1;
        return principal.substring(begin);
    }

}
