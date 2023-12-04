package others;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import utils.FSUtils;

import java.io.IOException;

public class Fs_Test1 {

  public static void main(String[] args) throws IOException {
    FileSystem fs = FSUtils.loadFS(args);
    System.out.println(fs.getUri());
    fs.mkdirs(new Path("hdfs://hh"));
  }

}
