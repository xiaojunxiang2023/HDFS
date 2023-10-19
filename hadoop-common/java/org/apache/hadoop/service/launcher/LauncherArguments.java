package org.apache.hadoop.service.launcher;

/**
 * Standard launcher arguments. These are all from
 * the {@code GenericOptionsParser}, simply extracted to constants.
 */
public interface LauncherArguments {
  /**
   * Name of the configuration argument on the CLI.
   * Value: {@value}
   */
  String ARG_CONF = "conf";
  String ARG_CONF_SHORT = "conf";

  /**
   * prefixed version of {@link #ARG_CONF}.
   * Value: {@value}
   */
  String ARG_CONF_PREFIXED = "--" + ARG_CONF;

  /**
   * Name of a configuration class which is loaded before any
   * attempt is made to load the class.
   * <p>
   * Value: {@value}
   */
  String ARG_CONFCLASS = "hadoopconf";
  String ARG_CONFCLASS_SHORT = "hadoopconf";

  /**
   * Prefixed version of {@link #ARG_CONFCLASS}.
   * Value: {@value}
   */
  String ARG_CONFCLASS_PREFIXED = "--" + ARG_CONFCLASS;

  /**
   * Error string on a parse failure.
   * Value: {@value}
   */
  String E_PARSE_FAILED = "Failed to parse: ";
}
