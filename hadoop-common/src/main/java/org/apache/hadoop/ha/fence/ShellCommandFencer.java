package org.apache.hadoop.ha.fence;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.ha.micro.BadFencingConfigurationException;
import org.apache.hadoop.ha.micro.StreamPumper;
import org.apache.hadoop.ha.status.HAServiceProtocol;
import org.apache.hadoop.ha.status.HAServiceTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

public class ShellCommandFencer
    extends Configured implements FenceMethod {

  public static Logger LOG = LoggerFactory.getLogger(ShellCommandFencer.class);

  private static final int ABBREV_LENGTH = 20;

  private static final String TARGET_PREFIX = "target_";

  private static final String SOURCE_PREFIX = "source_";

  private static final String ARG_DELIMITER = ",";

  @Override
  public void checkArgs(String args) throws BadFencingConfigurationException {
    if (args == null || args.isEmpty()) {
      throw new BadFencingConfigurationException(
          "No argument passed to 'shell' fencing method");
    }
    // Nothing else we can really check without actually running the command
  }

  @Override
  public boolean tryFence(HAServiceTarget target, String args) {
    ProcessBuilder builder;
    String cmd = parseArgs(target.getTransitionTargetHAStatus(), args);

    builder = new ProcessBuilder("bash", "-e", "-c", cmd);

    setConfAsEnvVars(builder.environment());
    addTargetInfoAsEnvVars(target, builder.environment());

    Process p;
    try {
      p = builder.start();
      p.getOutputStream().close();
    } catch (IOException e) {
      LOG.warn("Unable to execute " + cmd, e);
      return false;
    }

    String pid = tryGetPid(p);
    LOG.info("Launched fencing command '" + cmd + "' with "
        + ((pid != null) ? ("pid " + pid) : "unknown pid"));

    String logPrefix = abbreviate(cmd, ABBREV_LENGTH);
    if (pid != null) {
      logPrefix = "[PID " + pid + "] " + logPrefix;
    }

    // Pump logs to stderr
    StreamPumper errPumper = new StreamPumper(
        LOG, logPrefix, p.getErrorStream(),
        StreamPumper.StreamType.STDERR);
    errPumper.start();

    StreamPumper outPumper = new StreamPumper(
        LOG, logPrefix, p.getInputStream(),
        StreamPumper.StreamType.STDOUT);
    outPumper.start();

    int rc;
    try {
      rc = p.waitFor();
      errPumper.join();
      outPumper.join();
    } catch (InterruptedException ie) {
      LOG.warn("Interrupted while waiting for fencing command: " + cmd);
      return false;
    }

    return rc == 0;
  }

  private String parseArgs(HAServiceProtocol.HAServiceState state,
                           String cmd) {
    String[] args = cmd.split(ARG_DELIMITER);
    if (args.length == 1) {
      // only one command is given, assuming both src and dst
      // will execute the same command/script.
      return args[0];
    }
    if (args.length > 2) {
      throw new IllegalArgumentException("Expecting arguments size of at most "
          + "two, getting " + Arrays.asList(args));
    }
    if (HAServiceProtocol.HAServiceState.ACTIVE.equals(state)) {
      return args[0];
    } else if (HAServiceProtocol.HAServiceState.STANDBY.equals(state)) {
      return args[1];
    } else {
      throw new IllegalArgumentException(
          "Unexpected HA service state:" + state);
    }
  }

  /**
   * Abbreviate a string by putting '...' in the middle of it,
   * in an attempt to keep logs from getting too messy.
   * @param cmd the string to abbreviate
   * @param len maximum length to abbreviate to
   * @return abbreviated string
   */
  static String abbreviate(String cmd, int len) {
    if (cmd.length() > len && len >= 5) {
      int firstHalf = (len - 3) / 2;
      int rem = len - firstHalf - 3;

      return cmd.substring(0, firstHalf) +
          "..." + cmd.substring(cmd.length() - rem);
    } else {
      return cmd;
    }
  }

  /**
   * Attempt to use evil reflection tricks to determine the
   * pid of a launched process. This is helpful to ops
   * if debugging a fencing process that might have gone
   * wrong. If running on a system or JVM where this doesn't
   * work, it will simply return null.
   */
  private static String tryGetPid(Process p) {
    try {
      Class<? extends Process> clazz = p.getClass();
      if (clazz.getName().equals("java.lang.UNIXProcess")) {
        Field f = clazz.getDeclaredField("pid");
        f.setAccessible(true);
        return String.valueOf(f.getInt(p));
      } else {
        LOG.trace("Unable to determine pid for " + p
            + " since it is not a UNIXProcess");
        return null;
      }
    } catch (Throwable t) {
      LOG.trace("Unable to determine pid for " + p, t);
      return null;
    }
  }

  /**
   * Set the environment of the subprocess to be the Configuration,
   * with '.'s replaced by '_'s.
   */
  private void setConfAsEnvVars(Map<String, String> env) {
    for (Map.Entry<String, String> pair : getConf()) {
      env.put(pair.getKey().replace('.', '_'), pair.getValue());
    }
  }

  /**
   * Add information about the target to the the environment of the
   * subprocess.
   *
   * @param target
   * @param environment
   */
  private void addTargetInfoAsEnvVars(HAServiceTarget target,
                                      Map<String, String> environment) {
    String prefix;
    HAServiceProtocol.HAServiceState targetState =
        target.getTransitionTargetHAStatus();
    if (targetState == null ||
        HAServiceProtocol.HAServiceState.ACTIVE.equals(targetState)) {
      // null is assumed to be same as ACTIVE, this is to be compatible
      // with existing tests/use cases where target state is not specified
      // but assuming it's active.
      prefix = TARGET_PREFIX;
    } else if (HAServiceProtocol.HAServiceState.STANDBY.equals(targetState)) {
      prefix = SOURCE_PREFIX;
    } else {
      throw new IllegalArgumentException(
          "Unexpected HA service state:" + targetState);
    }
    for (Map.Entry<String, String> e :
        target.getFencingParameters().entrySet()) {
      String key = prefix + e.getKey();
      key = key.replace('.', '_');
      environment.put(key, e.getValue());
    }
  }
}