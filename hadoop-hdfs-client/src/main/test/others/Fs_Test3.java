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
        FileSystem fileSystem = FileSystem.get(conf);
        fileSystem.mkdirs(new Path("hdfs://ha/test1/" + System.currentTimeMillis()));
    }

}
