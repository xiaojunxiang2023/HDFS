package org.apache.hadoop.tools;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

import java.io.PrintStream;

/**
 * This program is a CLI utility base class utilizing hadoop Tool class.
 */
public abstract class CommandShell extends Configured implements Tool {

  private PrintStream out = System.out;
  private PrintStream err = System.err;

  /** The subcommand instance for this shell command, if any. */
  private SubCommand subcommand = null;

  /**
   * Return usage string for the command including any summary of subcommands.
   */
  public abstract String getCommandUsage();

  public void setSubCommand(SubCommand cmd) {
    subcommand = cmd;
  }

  public void setOut(PrintStream p) {
    out = p;
  }

  public PrintStream getOut() {
    return out;
  }

  public void setErr(PrintStream p) {
    err = p;
  }

  public PrintStream getErr() {
    return err;
  }

  @Override
  public int run(String[] args) throws Exception {
    int exitCode = 0;
    try {
      exitCode = init(args);
      if (exitCode != 0 || subcommand == null) {
        printShellUsage();
        return exitCode;
      }
      if (subcommand.validate()) {
        subcommand.execute();
      } else {
        printShellUsage();
        exitCode = 1;
      }
    } catch (Exception e) {
      printShellUsage();
      printException(e);
      return 1;
    }
    return exitCode;
  }

  /**
   * Parse the command line arguments and initialize subcommand instance.
   * @param args
   * @return 0 if the argument(s) were recognized, 1 otherwise
   */
  protected abstract int init(String[] args) throws Exception;

  protected final void printShellUsage() {
    if (subcommand != null) {
      out.println(subcommand.getUsage());
    } else {
      out.println(getCommandUsage());
    }
    out.flush();
  }

  protected void printException(Exception ex) {
    ex.printStackTrace(err);
  }

  /**
   * Base class for any subcommands of this shell command.
   */
  protected abstract class SubCommand {

    public boolean validate() {
      return true;
    }

    public abstract void execute() throws Exception;

    public abstract String getUsage();
  }
}
