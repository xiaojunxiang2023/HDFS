package org.apache.hadoop.conf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logs access to {@link Configuration}.
 * Sensitive data will be redacted.
 */
public class ConfigurationWithLogging extends Configuration {
  private static final Logger LOG =
      LoggerFactory.getLogger(ConfigurationWithLogging.class);

  private final Logger log;
  private final ConfigRedactor redactor;

  public ConfigurationWithLogging(Configuration conf) {
    super(conf);
    log = LOG;
    redactor = new ConfigRedactor(conf);
  }

  /**
   * See {@link Configuration#get(String)}.
   */
  @Override
  public String get(String name) {
    String value = super.get(name);
    log.info("Got {} = '{}'", name, redactor.redact(name, value));
    return value;
  }

  /**
   * See {@link Configuration#get(String, String)}.
   */
  @Override
  public String get(String name, String defaultValue) {
    String value = super.get(name, defaultValue);
    log.info("Got {} = '{}' (default '{}')", name,
        redactor.redact(name, value), redactor.redact(name, defaultValue));
    return value;
  }

  /**
   * See {@link Configuration#getBoolean(String, boolean)}.
   */
  @Override
  public boolean getBoolean(String name, boolean defaultValue) {
    boolean value = super.getBoolean(name, defaultValue);
    log.info("Got {} = '{}' (default '{}')", name, value, defaultValue);
    return value;
  }

  /**
   * See {@link Configuration#getFloat(String, float)}.
   */
  @Override
  public float getFloat(String name, float defaultValue) {
    float value = super.getFloat(name, defaultValue);
    log.info("Got {} = '{}' (default '{}')", name, value, defaultValue);
    return value;
  }

  /**
   * See {@link Configuration#getInt(String, int)}.
   */
  @Override
  public int getInt(String name, int defaultValue) {
    int value = super.getInt(name, defaultValue);
    log.info("Got {} = '{}' (default '{}')", name, value, defaultValue);
    return value;
  }

  /**
   * See {@link Configuration#getLong(String, long)}.
   */
  @Override
  public long getLong(String name, long defaultValue) {
    long value = super.getLong(name, defaultValue);
    log.info("Got {} = '{}' (default '{}')", name, value, defaultValue);
    return value;
  }

  /**
   * See {@link Configuration#set(String, String, String)}.
   */
  @Override
  public void set(String name, String value, String source) {
    log.info("Set {} to '{}'{}", name, redactor.redact(name, value),
        source == null ? "" : " from " + source);
    super.set(name, value, source);
  }
}
