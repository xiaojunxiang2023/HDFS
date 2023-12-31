package org.apache.hadoop.service.launcher;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.service.Service;

import java.util.List;

/**
 * An interface which services can implement to have their
 * execution managed by the ServiceLauncher.
 * <p>
 * The command line options will be passed down before the 
 * {@link Service#init(Configuration)} operation is invoked via an
 * invocation of {@link LaunchableService#bindArgs(Configuration, List)}
 * After the service has been successfully started via {@link Service#start()}
 * the {@link LaunchableService#execute()} method is called to execute the 
 * service. When this method returns, the service launcher will exit, using
 * the return code from the method as its exit option.
 */
public interface LaunchableService extends Service {

  /**
   * Propagate the command line arguments.
   * <p>
   * This method is called before {@link #init(Configuration)};
   * Any non-null configuration that is returned from this operation
   * becomes the one that is passed on to that {@link #init(Configuration)}
   * operation.
   * <p>
   * This permits implementations to change the configuration before
   * the init operation. As the ServiceLauncher only creates
   * an instance of the base {@link Configuration} class, it is
   * recommended to instantiate any subclass (such as YarnConfiguration)
   * that injects new resources.
   * <p>
   * @param config the initial configuration build up by the
   * service launcher.
   * @param args list of arguments passed to the command line
   * after any launcher-specific commands have been stripped.
   * @return the configuration to init the service with.
   * Recommended: pass down the config parameter with any changes
   * @throws Exception any problem
   */
  Configuration bindArgs(Configuration config, List<String> args)
      throws Exception;

  /**
   * Run a service. This method is called after {@link Service#start()}.
   * <p>
   * The return value becomes the exit code of the launched process.
   * <p>
   * If an exception is raised, the policy is:
   * <ol>
   *   <li>Any subset of {@link org.apache.hadoop.util.ExitUtil.ExitException}:
   *   the exception is passed up unmodified.
   *   </li>
   *   <li>Any exception which implements
   *   {@link org.apache.hadoop.util.ExitCodeProvider}:
   *   A new {@link ServiceLaunchException} is created with the exit code
   *   and message of the thrown exception; the thrown exception becomes the
   *   cause.</li>
   *   <li>Any other exception: a new {@link ServiceLaunchException} is created
   *   with the exit code {@link LauncherExitCodes#EXIT_EXCEPTION_THROWN} and
   *   the message of the original exception (which becomes the cause).</li>
   * </ol>
   * @return the exit code
   * @throws org.apache.hadoop.util.ExitUtil.ExitException an exception passed
   *  up as the exit code and error text.
   * @throws Exception any exception to report. If it provides an exit code
   * this is used in a wrapping exception.
   */
  int execute() throws Exception;
}
