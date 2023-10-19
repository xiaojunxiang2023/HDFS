package org.apache.hadoop.fs.impl;

import java.util.Locale;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.PathCapabilities;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkArgument;

@InterfaceAudience.Private
@InterfaceStability.Evolving
public class PathCapabilitiesSupport {

  /**
   * Validate the arguments to
   * {@link PathCapabilities#hasPathCapability(Path, String)}.
   * @param path path to query the capability of.
   * @param capability non-null, non-empty string to query the path for support.
   * @return the string to use in a switch statement.
   * @throws IllegalArgumentException if a an argument is invalid.
   */
  public static String validatePathCapabilityArgs(
      final Path path, final String capability) {
    checkArgument(path != null, "null path");
    checkArgument(capability != null, "capability parameter is null");
    checkArgument(!capability.isEmpty(),
        "capability parameter is empty string");
    return capability.toLowerCase(Locale.ENGLISH);
  }
}
