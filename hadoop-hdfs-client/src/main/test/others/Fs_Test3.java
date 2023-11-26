package others;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;

public class Fs_Test3 {

    public static void main(String[] args) throws IOException {
        System.setProperty("java.security.krb5.conf", "/etc/krb5.conf");

        // 配置
        Configuration conf = new Configuration();
        UserGroupInformation.setConfiguration(conf);

        // 使用 keytab登录
        UserGroupInformation.loginUserFromKeytab("hbase/kde-offline1.sdns.kscbigdata.cloud@HADOOP.COM",
                "/etc/security/keytabs/hbase.service.keytab");

        FileSystem fs = FileSystem.get(conf);
        fs.mkdirs(new Path(args[0]));
    }

}
