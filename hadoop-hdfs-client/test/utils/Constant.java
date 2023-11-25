package utils;


import org.apache.hadoop.fs.Path;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Constant {
    
    public final static String defaultFSId = "ha";
    public final static String startDate = new SimpleDateFormat(Constant.dateFormat, Locale.CHINA)
            .format(new Date(System.currentTimeMillis()));

    public final static String dateFormat = "yyyy-MM-dd_HH-mm-ss";
    public final static String HADOOP_USER_NAME = "xiaojunxiang";
    public final static Path srcFile_Local = new Path("/etc/hosts");
    public final static Path destFile_HDFS = new Path("/tmp/hosts");
    public final static Path srcFile_Local2 = new Path("/etc/os-release");
    public final static Path destFile_HDFS2 = new Path("/tmp/os-release");

    public final static Path outputDir_HDFS = new Path("/tmp/output_" + startDate);
    public final static String krb5File = "/etc/krb5.conf";
    public final static String keytabFile = "/etc/security/keytabs/hdfs.headless.keytab";
    public final static String useDNHostName = "true";

    public final static String msg = "*************************************************";

    public static long hour = 3600 * 1000;
    public static long minute = 60 * 1000;
}
