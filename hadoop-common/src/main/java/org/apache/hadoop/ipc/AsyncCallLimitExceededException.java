package org.apache.hadoop.ipc;

import java.io.IOException;

/**
 * Signals that an AsyncCallLimitExceededException has occurred. This class is
 * used to make application code using async RPC aware that limit of max async
 * calls is reached, application code need to retrieve results from response of
 * established async calls to avoid buffer overflow in order for follow-on async
 * calls going correctly.
 */
public class AsyncCallLimitExceededException extends IOException {
  private static final long serialVersionUID = 1L;

  public AsyncCallLimitExceededException(String message) {
    super(message);
  }
}
