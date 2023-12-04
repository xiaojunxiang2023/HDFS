package fs;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DFSClient;
import utils.Constant;
import utils.FSUtils;

import java.io.IOException;

/**
 * 功能:      测试 HDFS文件的读写功能
 * 使用示例:   hadoop jar hadoop-case*.jar fs.Fs_01_put ha[可缺省]
 *           Kerberos环境下需要先 export kerberos=true 才会使用 hdfs.headless.keytab认证
 */
public class Fs_01_put {

  public static void main(String[] args) throws IOException {
    FileSystem fs = FSUtils.loadFS(args);
    DFSClient dfsClient = FSUtils.dfsClient;

    Path srcFile = Constant.srcFile_Local;
    Path destFile = Constant.destFile_HDFS;

    // 上传文件
    System.out.println("upload local file " + srcFile.toUri().getPath() + "....");
    FSUtils.putHosts(fs);
    FSUtils.listFiles(fs, destFile);

    // 读文件
    System.out.println("reading hdfs file " + destFile.toUri().getPath() + ":");
    FSUtils.readFile(fs, destFile);

    // 对文件改名
    Path destFileNew = new Path(destFile.toUri().getPath() + "--" + Constant.startDate);
    System.out.println("rename " + destFile.toUri().getPath() + " to " + destFileNew.toUri().getPath());
    dfsClient.rename(destFile.toUri().getPath(), destFileNew.toUri().getPath());
    FSUtils.listFiles(fs, destFileNew);

    // 读新文件
    System.out.println("reading hdfs new file " + destFileNew.toUri().getPath() + ":");
    FSUtils.readFile(fs, destFileNew);

    // 再次上传原文件
    System.out.println("reupload origin local file " + srcFile.toUri().getPath() + "....");
    FSUtils.putHosts(fs);
    FSUtils.listFiles(fs, destFile);

    fs.close();
  }

}
