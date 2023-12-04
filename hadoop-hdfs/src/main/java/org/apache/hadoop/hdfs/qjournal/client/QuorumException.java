package org.apache.hadoop.hdfs.qjournal.client;

import org.apache.hadoop.thirdparty.com.google.common.base.Joiner;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.util.StringUtils;

import java.io.IOException;
import java.util.Map;

/**
 * Exception thrown when too many exceptions occur while gathering
 * responses to a quorum call. 
 */
class QuorumException extends IOException {

  /**
   * Create a QuorumException instance with a descriptive message detailing
   * the underlying exceptions, as well as any successful responses which
   * were returned.
   * @param <K> the keys for the quorum calls
   * @param <V> the success response type
   * @param successes any successful responses returned
   * @param exceptions the exceptions returned
   */
  public static <K, V> QuorumException create(
      String simpleMsg,
      Map<K, V> successes,
      Map<K, Throwable> exceptions) {
    Preconditions.checkArgument(!exceptions.isEmpty(),
        "Must pass exceptions");

    StringBuilder msg = new StringBuilder();
    msg.append(simpleMsg).append(". ");
    if (!successes.isEmpty()) {
      msg.append(successes.size()).append(" successful responses:\n");

      Joiner.on("\n")
          .useForNull("null [success]")
          .withKeyValueSeparator(": ")
          .appendTo(msg, successes);
      msg.append("\n");
    }

    msg.append(exceptions.size() + " exceptions thrown:\n");
    boolean isFirst = true;

    for (Map.Entry<K, Throwable> e : exceptions.entrySet()) {
      if (!isFirst) {
        msg.append("\n");
      }
      isFirst = false;

      msg.append(e.getKey()).append(": ");

      if (e.getValue() instanceof RuntimeException) {
        msg.append(StringUtils.stringifyException(e.getValue()));
      } else if (e.getValue().getLocalizedMessage() != null) {
        msg.append(e.getValue().getLocalizedMessage());
      } else {
        msg.append(StringUtils.stringifyException(e.getValue()));
      }
    }
    return new QuorumException(msg.toString());
  }

  private QuorumException(String msg) {
    super(msg);
  }

  private static final long serialVersionUID = 1L;
}
