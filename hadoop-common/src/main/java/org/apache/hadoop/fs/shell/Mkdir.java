package org.apache.hadoop.fs.shell;

import org.apache.hadoop.fs.*;

import java.io.IOException;
import java.util.LinkedList;

/**
 * Create the given dir
 */

class Mkdir extends FsCommand {
  public static void registerCommands(CommandFactory factory) {
    factory.addClass(Mkdir.class, "-mkdir");
  }

  public static final String NAME = "mkdir";
  public static final String USAGE = "[-p] <path> ...";
  public static final String DESCRIPTION =
      "Create a directory in specified location.\n" +
          "-p: Do not fail if the directory already exists";

  private boolean createParents;

  @Override
  protected void processOptions(LinkedList<String> args) {
    CommandFormat cf = new CommandFormat(1, Integer.MAX_VALUE, "p");
    cf.parse(args);
    createParents = cf.getOpt("p");
  }

  @Override
  protected void processPath(PathData item) throws IOException {
    if (item.stat.isDirectory()) {
      if (!createParents) {
        throw new PathExistsException(item.toString());
      }
    } else {
      throw new PathIsNotDirectoryException(item.toString());
    }
  }

  @Override
  protected void processNonexistentPath(PathData item) throws IOException {
    if (!createParents) {
      // check if parent exists. this is complicated because getParent(a/b/c/) returns a/b/c, but
      // we want a/b
      final Path itemPath = new Path(item.path.toString());
      final Path itemParentPath = itemPath.getParent();

      if (itemParentPath == null) {
        throw new PathNotFoundException(String.format(
            "Item: %s parent's path is null. This can happen if mkdir is " +
                "called on root, so there's no parent.", itemPath.toString()));
      }

      if (!item.fs.exists(itemParentPath)) {
        throw new PathNotFoundException(itemParentPath.toString());
      }
    }
    if (!item.fs.mkdirs(item.path)) {
      throw new PathIOException(item.toString());
    }
  }
}
