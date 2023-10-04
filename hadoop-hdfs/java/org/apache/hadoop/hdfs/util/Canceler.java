package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Provides a simple interface where one thread can mark an operation
 * for cancellation, and another thread can poll for whether the
 * cancellation has occurred.
 */
@InterfaceAudience.Private
public class Canceler {
    /**
     * If the operation has been canceled, set to the reason why
     * it has been canceled (eg standby moving to active)
     */
    private volatile String cancelReason = null;

    /**
     * Requests that the current operation be canceled if it is still running.
     * This does not block until the cancellation is successful.
     * @param reason the reason why cancellation is requested
     */
    public void cancel(String reason) {
        this.cancelReason = reason;
    }

    public boolean isCancelled() {
        return cancelReason != null;
    }

    public String getCancellationReason() {
        return cancelReason;
    }
}
