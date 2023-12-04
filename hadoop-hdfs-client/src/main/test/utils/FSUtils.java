package utils;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.hadoop.hdfs.DFSClient;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.io.InputStream;

public class FSUtils {
  public static Configuration conf = new Configuration();

  // 得先访问文件系统，才能激活此属性
  public static DFSClient dfsClient;

  static {
    System.setProperty("file.encoding", "utf-8");
  }

  public static FileSystem loadFS(String[] args) {
    if (args.length == 0) {
      args = new String[]{Constant.defaultFSId};
    }

    System.setProperty("HADOOP_USER_NAME", Constant.HADOOP_USER_NAME);
    conf.set("fs.defaultFS", "hdfs://" + "localhost:8020");
    conf.set("dfs.client.use.datanode.hostname", Constant.useDNHostName);

    System.out.println("fs.defaultFS的值设为：" + conf.get("fs.defaultFS"));
    FileSystem fs = null;
    try {
      fs = FileSystem.get(conf);
      dfsClient = new DFSClient(FSUtils.conf);
      if (Boolean.parseBoolean(System.getenv("kerberos"))) {
        if (!UserGroupInformation.isSecurityEnabled()) {
          System.out.println("客户端根据配置，发现不处于 SecurityEnabled模式下，所以无需登录, return.");
          return fs;
        }
        System.out.println("客户端根据配置，发现处于 SecurityEnabled模式下，准备使用 keytab登录...");
        KerberosUtils.login(conf);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fs;
  }

  // 将 SRC_FILE_LOCAL 上传到 DEST_FILE_HDFS
  public static void putHosts(FileSystem fs) {
    try {
      fs.deleteOnExit(Constant.destFile_HDFS);
      fs.copyFromLocalFile(Constant.srcFile_Local, Constant.destFile_HDFS);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void listFiles(FileSystem fs, Path path) {
    System.out.println("\nlist hdfs file " + path.toUri().getPath() + ":");
    try {
      RemoteIterator<LocatedFileStatus> listFiles = fs.listFiles(path, false);
      while (listFiles.hasNext()) {
        System.out.println(listFiles.next().toString());
        System.out.println();
      }
      System.out.println();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void readFile(FileSystem fs, Path path) {
    InputStream inputStream;
    try {
      inputStream = fs.open(path);
      byte[] buffer = new byte[1024];
      int bytesRead;

      System.out.println(Constant.msg);
      while ((bytesRead = inputStream.read(buffer)) != -1) {
        System.out.write(buffer, 0, bytesRead);
      }
      System.out.println("\n" + Constant.msg);
      System.out.flush();
      inputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  ////////////////////////////  私有方法 ////////////////////////////

}
