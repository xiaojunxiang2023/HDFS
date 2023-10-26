package org.apache.hadoop.service.launcher;


import java.util.Locale;
import org.apache.hadoop.util.ExitCodeProvider;
import org.apache.hadoop.util.ExitUtil;

/**
 * A service launch exception that includes an exit code.
 * <p>
 * When caught by the ServiceLauncher, it will convert that
 * into a process exit code.
 * 
 * The {@link #ServiceLaunchException(int, String, Object...)} constructor
 * generates formatted exceptions.
 */

public class ServiceLaunchException extends ExitUtil.ExitException
    implements ExitCodeProvider, LauncherExitCodes {

  /**
   * Create an exception with the specific exit code.
   * @param exitCode exit code
   * @param cause cause of the exception
   */
  public ServiceLaunchException(int exitCode, Throwable cause) {
    super(exitCode, cause);
  }

  /**
   * Create an exception with the specific exit code and text.
   * @param exitCode exit code
   * @param message message to use in exception
   */
  public ServiceLaunchException(int exitCode, String message) {
    super(exitCode, message);
  }

  /**
   * Create a formatted exception.
   * <p>
   * This uses {@link String#format(String, Object...)}
   * to build the formatted exception in the ENGLISH locale.
   * <p>
   * If the last argument is a throwable, it becomes the cause of the exception.
   * It will also be used as a parameter for the format.
   * @param exitCode exit code
   * @param format format for message to use in exception
   * @param args list of arguments
   */
  public ServiceLaunchException(int exitCode, String format, Object... args) {
    super(exitCode, String.format(Locale.ENGLISH, format, args));
    if (args.length > 0 && (args[args.length - 1] instanceof Throwable)) {
      initCause((Throwable) args[args.length - 1]);
    }
  }

  /**
   * Create a formatted exception.
   * <p>
   * This uses {@link String#format(String, Object...)}
   * to build the formatted exception in the ENGLISH locale.
   * @param exitCode exit code
   * @param cause inner cause
   * @param format format for message to use in exception
   * @param args list of arguments
   */
  public ServiceLaunchException(int exitCode, Throwable cause,
      String format, Object... args) {
    super(exitCode, String.format(Locale.ENGLISH, format, args), cause);
  }
}
