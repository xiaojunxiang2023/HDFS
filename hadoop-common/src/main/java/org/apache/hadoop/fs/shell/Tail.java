package org.apache.hadoop.fs.shell;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.PathIsDirectoryException;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Get a listing of all files in that match the file patterns.
 */

class Tail extends FsCommand {
  public static void registerCommands(CommandFactory factory) {
    factory.addClass(Tail.class, "-tail");
  }

  public static final String NAME = "tail";
  public static final String USAGE = "[-f] [-s <sleep interval>] <file>";
  public static final String DESCRIPTION =
      "Show the last 1KB of the file.\n"
          + "-f: Shows appended data as the file grows.\n"
          + "-s: With -f , "
          + "defines the sleep interval between iterations in milliseconds.\n";

  private long startingOffset = -1024;
  private boolean follow = false;
  private long followDelay = 5000; // milliseconds


  public long getFollowDelay() {
    return followDelay;
  }

  @Override
  protected void processOptions(LinkedList<String> args) throws IOException {
    CommandFormat cf = new CommandFormat(1, 1, "f");
    cf.addOptionWithValue("s");
    cf.parse(args);
    follow = cf.getOpt("f");
    if (follow) {
      String sleep = cf.getOptValue("s");
      if (sleep != null && !sleep.isEmpty()) {
        long sleepInterval = Long.parseLong(sleep);
        if (sleepInterval > 0) {
          followDelay = sleepInterval;
        }
      }
    }
  }

  // TODO: HADOOP-7234 will add glob support; for now, be backwards compat
  @Override
  protected List<PathData> expandArgument(String arg) throws IOException {
    List<PathData> items = new LinkedList<PathData>();
    items.add(new PathData(arg, getConf()));
    return items;
  }

  @Override
  protected void processPath(PathData item) throws IOException {
    if (item.stat.isDirectory()) {
      throw new PathIsDirectoryException(item.toString());
    }

    long offset = dumpFromOffset(item, startingOffset);
    while (follow) {
      try {
        Thread.sleep(followDelay);
      } catch (InterruptedException e) {
        break;
      }
      offset = dumpFromOffset(item, offset);
    }
  }

  private long dumpFromOffset(PathData item, long offset) throws IOException {
    long fileSize = item.refreshStatus().getLen();
    if (offset > fileSize) return fileSize;
    // treat a negative offset as relative to end of the file, floor of 0
    if (offset < 0) {
      offset = Math.max(fileSize + offset, 0);
    }

    FSDataInputStream in = item.fs.open(item.path);
    try {
      in.seek(offset);
      // use conf so the system configured io block size is used
      IOUtils.copyBytes(in, System.out, getConf(), false);
      offset = in.getPos();
    } finally {
      in.close();
    }
    return offset;
  }
}
