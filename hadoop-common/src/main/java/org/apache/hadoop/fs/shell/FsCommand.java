package org.apache.hadoop.fs.shell;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FsShellPermissions;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.shell.find.Find;

import java.io.IOException;
import java.util.LinkedList;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.*;

/**
 * Base class for all "hadoop fs" commands.
 */

// this class may not look useful now, but it's a placeholder for future
// functionality to act as a registry for fs commands.  currently it's being
// used to implement unnecessary abstract methods in the base class

abstract public class FsCommand extends Command {
  /**
   * Register the command classes used by the fs subcommand
   * @param factory where to register the class
   */
  public static void registerCommands(CommandFactory factory) {
    factory.registerCommands(AclCommands.class);
    factory.registerCommands(CopyCommands.class);
    factory.registerCommands(Count.class);
    factory.registerCommands(Delete.class);
    factory.registerCommands(Display.class);
    factory.registerCommands(Find.class);
    factory.registerCommands(FsShellPermissions.class);
    factory.registerCommands(FsUsage.class);
    factory.registerCommands(Ls.class);
    factory.registerCommands(Mkdir.class);
    factory.registerCommands(MoveCommands.class);
    factory.registerCommands(SetReplication.class);
    factory.registerCommands(Stat.class);
    factory.registerCommands(Tail.class);
    factory.registerCommands(Head.class);
    factory.registerCommands(Test.class);
    factory.registerCommands(TouchCommands.class);
    factory.registerCommands(Truncate.class);
    factory.registerCommands(SnapshotCommands.class);
    factory.registerCommands(XAttrCommands.class);
    factory.registerCommands(Concat.class);
  }

  protected FsCommand() {
  }

  protected FsCommand(Configuration conf) {
    super(conf);
  }

  // historical abstract method in Command
  @Override
  public String getCommandName() {
    return getName();
  }

  // abstract method that normally is invoked by runall() which is
  // overridden below
  @Override
  protected void run(Path path) throws IOException {
    throw new RuntimeException("not supposed to get here");
  }

  /** @deprecated use {@link Command#run(String...argv)} */
  @Deprecated
  @Override
  public int runAll() {
    return run(args);
  }

  @Override
  protected void processRawArguments(LinkedList<String> args)
      throws IOException {
    LinkedList<PathData> expendedArgs = expandArguments(args);
    // If "fs.defaultFs" is not set appropriately, it warns the user that the
    // command is not running against HDFS.
    final boolean displayWarnings = getConf().getBoolean(
        HADOOP_SHELL_MISSING_DEFAULT_FS_WARNING_KEY,
        HADOOP_SHELL_MISSING_DEFAULT_FS_WARNING_DEFAULT);
    if (displayWarnings) {
      final String defaultFs = getConf().get(FS_DEFAULT_NAME_KEY);
      final boolean missingDefaultFs =
          defaultFs == null || defaultFs.equals(FS_DEFAULT_NAME_DEFAULT);
      if (missingDefaultFs) {
        err.printf(
            "Warning: fs.defaultFS is not set when running \"%s\" command.%n",
            getCommandName());
      }
    }
    processArguments(expendedArgs);
  }
}
