package org.apache.hadoop.net;

import java.util.*;
import java.io.*;

import org.apache.hadoop.util.Shell.ShellCommandExecutor;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScriptBasedMapping extends CachedDNSToSwitchMapping {

  static final int MIN_ALLOWABLE_ARGS = 1;

  static final int DEFAULT_ARG_COUNT = 
                     CommonConfigurationKeys.NET_TOPOLOGY_SCRIPT_NUMBER_ARGS_DEFAULT;

  static final String SCRIPT_FILENAME_KEY = 
                     CommonConfigurationKeys.NET_TOPOLOGY_SCRIPT_FILE_NAME_KEY ;

  static final String SCRIPT_ARG_COUNT_KEY =
                     CommonConfigurationKeys.NET_TOPOLOGY_SCRIPT_NUMBER_ARGS_KEY ;
  public static final String NO_SCRIPT = "no script";

  public ScriptBasedMapping() {
    this(new RawScriptBasedMapping());
  }

  public ScriptBasedMapping(DNSToSwitchMapping rawMap) {
    super(rawMap);
  }

  public ScriptBasedMapping(Configuration conf) {
    this();
    setConf(conf);
  }

  private RawScriptBasedMapping getRawMapping() {
    return (RawScriptBasedMapping)rawMapping;
  }

  @Override
  public Configuration getConf() {
    return getRawMapping().getConf();
  }

  @Override
  public String toString() {
    return "script-based mapping with " + getRawMapping().toString();
  }

  @Override
  public void setConf(Configuration conf) {
    super.setConf(conf);
    getRawMapping().setConf(conf);
  }

  /**
   * This is the uncached script mapping that is fed into the cache managed
   * by the superclass {@link CachedDNSToSwitchMapping}
   */
  protected static class RawScriptBasedMapping
      extends AbstractDNSToSwitchMapping {
    private String scriptName;
    private int maxArgs; //max hostnames per call of the script
    private static final Logger LOG =
        LoggerFactory.getLogger(ScriptBasedMapping.class);

    @Override
    public void setConf (Configuration conf) {
      super.setConf(conf);
      if (conf != null) {
        scriptName = conf.get(SCRIPT_FILENAME_KEY);
        maxArgs = conf.getInt(SCRIPT_ARG_COUNT_KEY, DEFAULT_ARG_COUNT);
      } else {
        scriptName = null;
        maxArgs = 0;
      }
    }

    public RawScriptBasedMapping() {}

    @Override
    public List<String> resolve(List<String> names) {
      List<String> m = new ArrayList<String>(names.size());

      if (names.isEmpty()) {
        return m;
      }

      if (scriptName == null) {
        for (String name : names) {
          m.add(NetworkTopology.DEFAULT_RACK);
        }
        return m;
      }

      String output = runResolveCommand(names, scriptName);
      if (output != null) {
        StringTokenizer allSwitchInfo = new StringTokenizer(output);
        while (allSwitchInfo.hasMoreTokens()) {
          String switchInfo = allSwitchInfo.nextToken();
          m.add(switchInfo);
        }

        if (m.size() != names.size()) {
          // invalid number of entries returned by the script
          LOG.error("Script " + scriptName + " returned "
              + Integer.toString(m.size()) + " values when "
              + Integer.toString(names.size()) + " were expected.");
          return null;
        }
      } else {
        // an error occurred. return null to signify this.
        // (exn was already logged in runResolveCommand)
        return null;
      }

      return m;
    }

    protected String runResolveCommand(List<String> args, 
        String commandScriptName) {
      int loopCount = 0;
      if (args.size() == 0) {
        return null;
      }
      StringBuilder allOutput = new StringBuilder();
      int numProcessed = 0;
      if (maxArgs < MIN_ALLOWABLE_ARGS) {
        LOG.warn("Invalid value " + Integer.toString(maxArgs)
            + " for " + SCRIPT_ARG_COUNT_KEY + "; must be >= "
            + Integer.toString(MIN_ALLOWABLE_ARGS));
        return null;
      }

      while (numProcessed != args.size()) {
        int start = maxArgs * loopCount;
        List<String> cmdList = new ArrayList<String>();
        cmdList.add(commandScriptName);
        for (numProcessed = start; numProcessed < (start + maxArgs) &&
            numProcessed < args.size(); numProcessed++) {
          cmdList.add(args.get(numProcessed));
        }
        File dir = null;
        String userDir;
        if ((userDir = System.getProperty("user.dir")) != null) {
          dir = new File(userDir);
        }
        ShellCommandExecutor s = new ShellCommandExecutor(
            cmdList.toArray(new String[cmdList.size()]), dir);
        try {
          s.execute();
          allOutput.append(s.getOutput()).append(" ");
        } catch (Exception e) {
          LOG.warn("Exception running " + s, e);
          return null;
        }
        loopCount++;
      }
      return allOutput.toString();
    }

    @Override
    public boolean isSingleSwitch() {
      return scriptName == null;
    }

    @Override
    public String toString() {
      return scriptName != null ? ("script " + scriptName) : NO_SCRIPT;
    }

    @Override
    public void reloadCachedMappings() {
      // RawScriptBasedMapping没有缓存，no need to do
    }

    @Override
    public void reloadCachedMappings(List<String> names) {
    }
  }
}
