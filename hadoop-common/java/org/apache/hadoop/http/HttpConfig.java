package org.apache.hadoop.http;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Singleton to get access to Http related configuration.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class HttpConfig {
  public enum Policy {
    HTTP_ONLY,
    HTTPS_ONLY,
    HTTP_AND_HTTPS;

    private static final Policy[] VALUES = values();
    public static Policy fromString(String value) {
      for (Policy p : VALUES) {
        if (p.name().equalsIgnoreCase(value)) {
          return p;
        }
      }
      return null;
    }

    public boolean isHttpEnabled() {
      return this == HTTP_ONLY || this == HTTP_AND_HTTPS;
    }

    public boolean isHttpsEnabled() {
      return this == HTTPS_ONLY || this == HTTP_AND_HTTPS;
    }
  }
}
