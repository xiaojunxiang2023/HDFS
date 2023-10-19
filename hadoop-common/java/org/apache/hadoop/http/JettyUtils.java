package org.apache.hadoop.http;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Contains utility methods and constants relating to Jetty.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public final class JettyUtils {
  public static final String UTF_8 = "charset=utf-8";
  public static final int HEADER_SIZE = 1024 * 64;

  private JettyUtils() {
  }
}
