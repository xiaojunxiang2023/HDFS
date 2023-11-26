package org.apache.hadoop.ha.micro;

import java.io.IOException;

public class BadFencingConfigurationException extends IOException {
  private static final long serialVersionUID = 1L;

  public BadFencingConfigurationException(String msg) {
    super(msg);
  }

  public BadFencingConfigurationException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
