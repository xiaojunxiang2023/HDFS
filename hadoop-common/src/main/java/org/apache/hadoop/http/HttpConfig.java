package org.apache.hadoop.http;

/**
 * Singleton to get access to Http related configuration.
 */
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
