package org.apache.hadoop.service;

import org.apache.hadoop.classification.InterfaceAudience.Public;
import org.apache.hadoop.classification.InterfaceStability.Evolving;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a state change listener that logs events at INFO level
 */
@Public
@Evolving
public class LoggingStateChangeListener implements ServiceStateChangeListener {

  private static final Logger LOG =
      LoggerFactory.getLogger(LoggingStateChangeListener.class);

  private final Logger log;

  /**
   * Log events to the given log
   * @param log destination for events
   */
  public LoggingStateChangeListener(Logger log) {
    //force an NPE if a null log came in
    log.isDebugEnabled();
    this.log = log;
  }

  /**
   * Log events to the static log for this class
   */
  public LoggingStateChangeListener() {
    this(LOG);
  }

  /**
   * Callback for a state change event: log it
   * @param service the service that has changed.
   */
  @Override
  public void stateChanged(Service service) {
    log.info("Entry to state " + service.getServiceState()
        + " for " + service.getName());
  }
}
