package org.apache.hadoop.fs.shell;

import org.apache.hadoop.fs.PathIsDirectoryException;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Truncates a file to a new size
 */
public class Truncate extends FsCommand {
  public static void registerCommands(CommandFactory factory) {
    factory.addClass(Truncate.class, "-truncate");
  }

  public static final String NAME = "truncate";
  public static final String USAGE = "[-w] <length> <path> ...";
  public static final String DESCRIPTION =
      "Truncate all files that match the specified file pattern to the " +
          "specified length.\n" +
          "-w: Requests that the command wait for block recovery to complete, " +
          "if necessary.";

  protected long newLength = -1;
  protected List<PathData> waitList = new LinkedList<>();
  protected boolean waitOpt = false;

  @Override
  protected void processOptions(LinkedList<String> args) throws IOException {
    CommandFormat cf = new CommandFormat(2, Integer.MAX_VALUE, "w");
    cf.parse(args);
    waitOpt = cf.getOpt("w");

    try {
      newLength = Long.parseLong(args.removeFirst());
    } catch (NumberFormatException nfe) {
      displayWarning("Illegal length, a non-negative integer expected");
      throw nfe;
    }
    if (newLength < 0) {
      throw new IllegalArgumentException("length must be >= 0");
    }
  }

  @Override
  protected void processArguments(LinkedList<PathData> args)
      throws IOException {
    super.processArguments(args);
    if (waitOpt) waitForRecovery();
  }

  @Override
  protected void processPath(PathData item) throws IOException {
    if (item.stat.isDirectory()) {
      throw new PathIsDirectoryException(item.toString());
    }
    long oldLength = item.stat.getLen();
    if (newLength > oldLength) {
      throw new IllegalArgumentException(
          "Cannot truncate to a larger file size. Current size: " + oldLength +
              ", truncate size: " + newLength + ".");
    }
    if (item.fs.truncate(item.path, newLength)) {
      out.println("Truncated " + item + " to length: " + newLength);
    } else if (waitOpt) {
      waitList.add(item);
    } else {
      out.println("Truncating " + item + " to length: " + newLength + ". " +
          "Wait for block recovery to complete before further updating this " +
          "file.");
    }
  }

  /**
   * Wait for all files in waitList to have length equal to newLength.
   */
  private void waitForRecovery() throws IOException {
    for (PathData item : waitList) {
      out.println("Waiting for " + item + " ...");
      out.flush();

      for (; ; ) {
        item.refreshStatus();
        if (item.stat.getLen() == newLength) break;
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }
      }

      out.println("Truncated " + item + " to length: " + newLength);
      out.flush();
    }
  }
}
