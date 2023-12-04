package org.apache.hadoop.fs.shell.find;

import org.apache.hadoop.fs.shell.PathData;

import java.io.IOException;

/**
 * Implements the -print expression for the
 * {@link org.apache.hadoop.fs.shell.find.Find} command.
 */
final class Print extends BaseExpression {
  /** Registers this expression with the specified factory. */
  public static void registerExpression(ExpressionFactory factory)
      throws IOException {
    factory.addClass(Print.class, "-print");
    factory.addClass(Print0.class, "-print0");
  }

  private static final String[] USAGE = {"-print", "-print0"};
  private static final String[] HELP = {
      "Always evaluates to true. Causes the current pathname to be",
      "written to standard output followed by a newline. If the -print0",
      "expression is used then an ASCII NULL character is appended rather",
      "than a newline."};

  private final String suffix;

  public Print() {
    this("\n");
  }

  /**
   * Construct a Print {@link Expression} with the specified suffix.
   */
  private Print(String suffix) {
    super();
    setUsage(USAGE);
    setHelp(HELP);
    this.suffix = suffix;
  }

  @Override
  public Result apply(PathData item, int depth) throws IOException {
    getOptions().getOut().print(item.toString() + suffix);
    return Result.PASS;
  }

  @Override
  public boolean isAction() {
    return true;
  }

  /** Implements the -print0 expression. */
  final static class Print0 extends FilterExpression {
    public Print0() {
      super(new Print("\0"));
    }
  }
}
