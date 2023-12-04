package org.apache.hadoop.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.audit.CommonAuditContext;
import org.apache.hadoop.ipc.CallerContext;

import java.io.IOException;
import java.io.PrintStream;

/**
 * A utility to help run {@link Tool}s.
 *
 * <p><code>ToolRunner</code> can be used to run classes implementing 
 * <code>Tool</code> interface. It works in conjunction with 
 * {@link GenericOptionsParser} to parse the 
 * <a href="{@docRoot}/../hadoop-project-dist/hadoop-common/CommandsManual.html#Generic_Options">
 * generic hadoop command line arguments</a> and modifies the 
 * <code>Configuration</code> of the <code>Tool</code>. The 
 * application-specific options are passed along without being modified.
 * </p>
 *
 * @see Tool
 * @see GenericOptionsParser
 */
public class ToolRunner {

  /**
   * Runs the given <code>Tool</code> by {@link Tool#run(String[])}, after 
   * parsing with the given generic arguments. Uses the given 
   * <code>Configuration</code>, or builds one if null.
   *
   * Sets the <code>Tool</code>'s configuration with the possibly modified 
   * version of the <code>conf</code>.  
   *
   * @param conf <code>Configuration</code> for the <code>Tool</code>.
   * @param tool <code>Tool</code> to run.
   * @param args command-line arguments to the tool.
   * @return exit code of the {@link Tool#run(String[])} method.
   */
  public static int run(Configuration conf, Tool tool, String[] args)
      throws Exception {
    if (CallerContext.getCurrent() == null) {
      CallerContext ctx = new CallerContext.Builder("CLI").build();
      CallerContext.setCurrent(ctx);
    }
    // Note the entry point in the audit context; this
    // may be used in audit events set to cloud store logs
    // or elsewhere.
    CommonAuditContext.noteEntryPoint(tool);

    if (conf == null) {
      conf = new Configuration();
    }
    GenericOptionsParser parser = new GenericOptionsParser(conf, args);
    //set the configuration back, so that Tool can configure itself
    tool.setConf(conf);

    //get the args w/o generic hadoop args
    String[] toolArgs = parser.getRemainingArgs();
    return tool.run(toolArgs);
  }

  /**
   * Runs the <code>Tool</code> with its <code>Configuration</code>.
   *
   * Equivalent to <code>run(tool.getConf(), tool, args)</code>.
   *
   * @param tool <code>Tool</code> to run.
   * @param args command-line arguments to the tool.
   * @return exit code of the {@link Tool#run(String[])} method.
   */
  public static int run(Tool tool, String[] args)
      throws Exception {
    return run(tool.getConf(), tool, args);
  }

  /**
   * Prints generic command-line argurments and usage information.
   *
   *  @param out stream to write usage information to.
   */
  public static void printGenericCommandUsage(PrintStream out) {
    GenericOptionsParser.printGenericCommandUsage(out);
  }


  /**
   * Print out a prompt to the user, and return true if the user
   * responds with "y" or "yes". (case insensitive)
   */
  public static boolean confirmPrompt(String prompt) throws IOException {
    while (true) {
      System.err.print(prompt + " (Y or N) ");
      StringBuilder responseBuilder = new StringBuilder();
      while (true) {
        int c = System.in.read();
        if (c == -1 || c == '\r' || c == '\n') {
          break;
        }
        responseBuilder.append((char) c);
      }

      String response = responseBuilder.toString();
      if (response.equalsIgnoreCase("y") ||
          response.equalsIgnoreCase("yes")) {
        return true;
      } else if (response.equalsIgnoreCase("n") ||
          response.equalsIgnoreCase("no")) {
        return false;
      }
      System.err.println("Invalid input: " + response);
      // else ask them again
    }
  }
}
