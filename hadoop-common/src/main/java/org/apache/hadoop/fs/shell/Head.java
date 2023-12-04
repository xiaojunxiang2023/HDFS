package org.apache.hadoop.fs.shell;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.PathIsDirectoryException;
import org.apache.hadoop.io.IOUtils;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Show the first 1KB of the file.
 */

class Head extends FsCommand {
  public static void registerCommands(CommandFactory factory) {
    factory.addClass(Head.class, "-head");
  }

  public static final String NAME = "head";
  public static final String USAGE = "<file>";
  public static final String DESCRIPTION =
      "Show the first 1KB of the file.\n";

  private long endingOffset = 1024;

  @Override
  protected void processOptions(LinkedList<String> args) throws IOException {
    CommandFormat cf = new CommandFormat(1, 1);
    cf.parse(args);
  }

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

    dumpToOffset(item);
  }

  private void dumpToOffset(PathData item) throws IOException {
    FSDataInputStream in = item.fs.open(item.path);
    try {
      IOUtils.copyBytes(in, System.out, endingOffset, false);
    } finally {
      in.close();
    }
  }
}
