package org.apache.hadoop.service.launcher;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.service.AbstractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Subclass of {@link AbstractService} that provides basic implementations
 * of the {@link LaunchableService} methods.
 */
public abstract class AbstractLaunchableService extends AbstractService
    implements LaunchableService {

  private static final Logger LOG =
      LoggerFactory.getLogger(AbstractLaunchableService.class);

  /**
   * Construct an instance with the given name.
   */
  protected AbstractLaunchableService(String name) {
    super(name);
  }

  /**
   * {@inheritDoc}
   * <p>
   * The base implementation logs all arguments at the debug level,
   * then returns the passed in config unchanged.
   */

  @Override
  public Configuration bindArgs(Configuration config, List<String> args) throws
      Exception {
    if (LOG.isDebugEnabled()) {
      LOG.debug("Service {} passed in {} arguments:", getName(), args.size());
      for (String arg : args) {
        LOG.debug(arg);
      }
    }
    return config;
  }

  /**
   * {@inheritDoc}
   * <p>
   * The action is to signal success by returning the exit code 0.
   */
  @Override
  public int execute() throws Exception {
    return LauncherExitCodes.EXIT_SUCCESS;
  }
}
