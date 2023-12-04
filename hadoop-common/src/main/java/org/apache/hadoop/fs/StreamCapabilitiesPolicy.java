package org.apache.hadoop.fs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * Static methods to implement policies for {@link StreamCapabilities}.
 */
public class StreamCapabilitiesPolicy {
  public static final String CAN_UNBUFFER_NOT_IMPLEMENTED_MESSAGE =
      "claims unbuffer capabilty but does not implement CanUnbuffer";
  static final Logger LOG = LoggerFactory.getLogger(
      StreamCapabilitiesPolicy.class);

  /**
   * Implement the policy for {@link CanUnbuffer#unbuffer()}.
   *
   * @param in the input stream
   */
  public static void unbuffer(InputStream in) {
    try {
      if (in instanceof StreamCapabilities
          && ((StreamCapabilities) in).hasCapability(
          StreamCapabilities.UNBUFFER)) {
        ((CanUnbuffer) in).unbuffer();
      } else {
        LOG.debug(in.getClass().getName() + ":"
            + " does not implement StreamCapabilities"
            + " and the unbuffer capability");
      }
    } catch (ClassCastException e) {
      throw new UnsupportedOperationException(in.getClass().getName() + ": "
          + CAN_UNBUFFER_NOT_IMPLEMENTED_MESSAGE);
    }
  }
}

