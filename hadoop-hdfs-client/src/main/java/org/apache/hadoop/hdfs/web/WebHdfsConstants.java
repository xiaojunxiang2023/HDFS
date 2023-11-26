package org.apache.hadoop.hdfs.web;
import org.apache.hadoop.hdfs.protocol.HdfsFileStatus;
import org.apache.hadoop.io.Text;
public class WebHdfsConstants {
  public static final String WEBHDFS_SCHEME = "webhdfs";
  public static final String SWEBHDFS_SCHEME = "swebhdfs";
  public static final Text WEBHDFS_TOKEN_KIND = new Text("WEBHDFS delegation");
  public static final Text SWEBHDFS_TOKEN_KIND = new Text("SWEBHDFS delegation");

  enum PathType {
    FILE, DIRECTORY, SYMLINK;

    static PathType valueOf(HdfsFileStatus status) {
      if (status.isDirectory()) {
        return DIRECTORY;
      }
      if (status.isSymlink()) {
        return SYMLINK;
      }
      return FILE;
    }
  }
}
