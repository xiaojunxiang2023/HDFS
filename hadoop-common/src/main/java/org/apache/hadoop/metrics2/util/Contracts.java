package org.apache.hadoop.metrics2.util;

/**
 * Additional helpers (besides guava Preconditions) for programming by contract
 */
public class Contracts {

  private Contracts() {
  }

  /**
   * Check an argument for false conditions
   * @param <T> type of the argument
   * @param arg the argument to check
   * @param expression  the boolean expression for the condition
   * @param msg the error message if {@code expression} is false
   * @return the argument for convenience
   */
  public static <T> T checkArg(T arg, boolean expression, Object msg) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(msg) + ": " + arg);
    }
    return arg;
  }

  /**
   * Check an argument for false conditions
   * @param arg the argument to check
   * @param expression  the boolean expression for the condition
   * @param msg the error message if {@code expression} is false
   * @return the argument for convenience
   */
  public static int checkArg(int arg, boolean expression, Object msg) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(msg) + ": " + arg);
    }
    return arg;
  }

  /**
   * Check an argument for false conditions
   * @param arg the argument to check
   * @param expression  the boolean expression for the condition
   * @param msg the error message if {@code expression} is false
   * @return the argument for convenience
   */
  public static long checkArg(long arg, boolean expression, Object msg) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(msg) + ": " + arg);
    }
    return arg;
  }

  /**
   * Check an argument for false conditions
   * @param arg the argument to check
   * @param expression  the boolean expression for the condition
   * @param msg the error message if {@code expression} is false
   * @return the argument for convenience
   */
  public static float checkArg(float arg, boolean expression, Object msg) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(msg) + ": " + arg);
    }
    return arg;
  }

  /**
   * Check an argument for false conditions
   * @param arg the argument to check
   * @param expression  the boolean expression for the condition
   * @param msg the error message if {@code expression} is false
   * @return the argument for convenience
   */
  public static double checkArg(double arg, boolean expression, Object msg) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(msg) + ": " + arg);
    }
    return arg;
  }
}
