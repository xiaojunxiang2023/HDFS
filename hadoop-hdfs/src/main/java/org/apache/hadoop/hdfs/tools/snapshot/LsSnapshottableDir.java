package org.apache.hadoop.hdfs.tools.snapshot;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.hdfs.protocol.SnapshottableDirectoryStatus;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.IOException;

/**
 * A tool used to list all snapshottable directories that are owned by the 
 * current user. The tool returns all the snapshottable directories if the user
 * is a super user.
 */
public class LsSnapshottableDir extends Configured implements Tool {
  public static void main(String[] argv) throws Exception {
    int rc = ToolRunner.run(new LsSnapshottableDir(), argv);
    System.exit(rc);
  }

  @Override
  public int run(String[] argv) throws Exception {
    String description = "hdfs lsSnapshottableDir: \n" +
        "\tGet the list of snapshottable directories that are owned by the current user.\n" +
        "\tReturn all the snapshottable directories if the current user is a super user.\n";

    if (argv.length != 0) {
      System.err.println("Usage: \n" + description);
      return 1;
    }

    FileSystem fs = FileSystem.get(getConf());
    if (!(fs instanceof DistributedFileSystem)) {
      System.err.println(
          "LsSnapshottableDir can only be used in DistributedFileSystem");
      return 1;
    }
    DistributedFileSystem dfs = (DistributedFileSystem) fs;

    try {
      SnapshottableDirectoryStatus[] stats = dfs.getSnapshottableDirListing();
      SnapshottableDirectoryStatus.print(stats, System.out);
    } catch (IOException e) {
      String[] content = e.getLocalizedMessage().split("\n");
      System.err.println("lsSnapshottableDir: " + content[0]);
      return 1;
    }
    return 0;
  }
}
