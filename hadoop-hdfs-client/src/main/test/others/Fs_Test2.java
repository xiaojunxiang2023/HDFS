package others;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;
import utils.Constant;

import java.io.IOException;

public class Fs_Test2 {

  public static void main(String[] args) throws IOException, InterruptedException {
    Configuration conf = new Configuration();
    System.setProperty("HADOOP_USER_NAME", "hdfs");
    conf.set("fs.defaultFS", "hdfs://node1:8020");

    FileSystem fs = FileSystem.get(conf);
    FSDataInputStream fis = fs.open(Constant.destFile_HDFS);
    System.out.println(fis.available());
    IOUtils.copyBytes(fis, System.out, 4096, false);
    System.out.flush();
    Thread.sleep(System.currentTimeMillis());
  }

  @Test
  public void test01() throws Exception {
    Configuration conf = new Configuration();
    System.setProperty("HADOOP_USER_NAME", "hdfs");
    conf.set("fs.defaultFS", "hdfs://node1:8020");

    FileSystem fs = FileSystem.get(conf);
    FSDataOutputStream ois = fs.append(new Path("/tmp/hosts2"));
    ois.write("testxjx".getBytes());
    ois.flush();
    Thread.sleep(System.currentTimeMillis());
  }

}
