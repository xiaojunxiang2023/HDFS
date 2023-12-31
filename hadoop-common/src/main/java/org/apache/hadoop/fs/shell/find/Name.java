package org.apache.hadoop.fs.shell.find;

import org.apache.hadoop.fs.GlobPattern;
import org.apache.hadoop.fs.shell.PathData;
import org.apache.hadoop.util.StringUtils;

import java.io.IOException;
import java.util.Deque;

/**
 * Implements the -name expression for the
 * {@link org.apache.hadoop.fs.shell.find.Find} command.
 */
final class Name extends BaseExpression {
  /** Registers this expression with the specified factory. */
  public static void registerExpression(ExpressionFactory factory)
      throws IOException {
    factory.addClass(Name.class, "-name");
    factory.addClass(Iname.class, "-iname");
  }

  private static final String[] USAGE = {"-name pattern", "-iname pattern"};
  private static final String[] HELP = {
      "Evaluates as true if the basename of the file matches the",
      "pattern using standard file system globbing.",
      "If -iname is used then the match is case insensitive."};
  private GlobPattern globPattern;
  private boolean caseSensitive = true;

  /** Creates a case sensitive name expression. */
  public Name() {
    this(true);
  }

  /**
   * Construct a Name {@link Expression} with a specified case sensitivity.
   *
   * @param caseSensitive if true the comparisons are case sensitive.
   */
  private Name(boolean caseSensitive) {
    super();
    setUsage(USAGE);
    setHelp(HELP);
    setCaseSensitive(caseSensitive);
  }

  private void setCaseSensitive(boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  @Override
  public void addArguments(Deque<String> args) {
    addArguments(args, 1);
  }

  @Override
  public void prepare() throws IOException {
    String argPattern = getArgument(1);
    if (!caseSensitive) {
      argPattern = StringUtils.toLowerCase(argPattern);
    }
    globPattern = new GlobPattern(argPattern);
  }

  @Override
  public Result apply(PathData item, int depth) throws IOException {
    String name = getPath(item).getName();
    if (!caseSensitive) {
      name = StringUtils.toLowerCase(name);
    }
    if (globPattern.matches(name)) {
      return Result.PASS;
    } else {
      return Result.FAIL;
    }
  }

  /** Case insensitive version of the -name expression. */
  static class Iname extends FilterExpression {
    public Iname() {
      super(new Name(false));
    }
  }
}
